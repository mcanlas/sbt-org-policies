package sbtorgpolicies.settings

import cats.syntax.either._
import org.joda.time.{DateTime, DateTimeZone}
import sbt.Keys.{baseDirectory, packageOptions, version}
import sbt.Package.ManifestAttributes
import sbt.{LocalRootProject, Project, Setting, State}
import sbtorgpolicies.github.GitHubOps
import sbtorgpolicies.io.FileHelper
import sbtorgpolicies.OrgPoliciesKeys._
import sbtorgpolicies.templates._
import sbtrelease.ReleasePlugin.autoImport.ReleaseKeys._
import sbtrelease.ReleasePlugin.autoImport._
import sbtrelease.ReleaseStateTransformations._
import sbtrelease.{Utilities, Vcs}

trait release {
  import Utilities._

  val orgVersionCommitMessage: String = "Setting version"

  lazy val orgInitialVcsChecks: ReleaseStep = { st: State =>
    val extracted = Project.extract(st)

    val hasUntrackedFiles = vcs(st).hasUntrackedFiles
    val hasModifiedFiles  = vcs(st).hasModifiedFiles
    if (hasModifiedFiles) sys.error("Aborting release: unstaged modified files")
    if (hasUntrackedFiles && !extracted.get(releaseIgnoreUntrackedFiles)) {
      sys.error(
        "Aborting release: untracked files. Remove them or specify 'releaseIgnoreUntrackedFiles := true' in settings")
    }

    st.log.info("Starting release process off commit: " + vcs(st).currentHash)
    st
  }

  lazy val orgInquireVersions: ReleaseStep = { st: State =>
    val extracted = Project.extract(st)

    val releaseV = extracted.get(version)
    val nextFunc = extracted.get(releaseNextVersion)

    val nextV = nextFunc(releaseV)

    st.put(versions, (releaseV, nextV))
  }

  lazy val orgTagRelease: ReleaseStep = { st: State =>
    val ghOps: GitHubOps = st.extract.get(orgGithubOpsSetting)

    def findTag(tag: String): Option[String] = {
      if (ghOps.fetchReference(s"tags/$tag").isRight) {
        sys.error("Tag [%s] already exists. Aborting release!" format tag)
        None
      } else {
        Some(tag)
      }
    }

    val (tagState, tag)            = st.extract.runTask(releaseTagName, st)
    val (commentState, tagComment) = st.extract.runTask(releaseTagComment, tagState)
    val tagToUse                   = findTag(tag)
    val branch                     = st.extract.get(orgCommitBranchSetting)
    val file                       = st.extract.get(releaseVersionFile)

    val releaseDescription = ghOps.latestPullRequests(branch, file.getName, orgVersionCommitMessage) match {
      case Right(Nil) => s"* $tagComment"
      case Right(list) =>
        list map { pr =>
          val prTitle = pr.title.replace(s" (#${pr.number})", "")
          s"* $prTitle ([#${pr.number}](${pr.html_url}))"
        } mkString "\n"
      case Left(e) =>
        e.printStackTrace()
        sys.error("Tag release process couldn't fetch the pull request list from Github. Aborting release!")
    }

    tagToUse.foreach(ghOps.createTagRelease(branch, _, tagComment, releaseDescription))

    tagToUse map (t =>
      reapply(
        Seq[Setting[_]](
          releaseTagComment := releaseDescription,
          packageOptions += ManifestAttributes("Vcs-Release-Tag" -> t)
        ),
        commentState)) getOrElse commentState
  }

  lazy val orgUpdateChangeLog: ReleaseStep = { st: State =>
    val ghOps: GitHubOps = st.extract.get(orgGithubOpsSetting)
    val fh               = new FileHelper

    val (_, comment)    = st.extract.runTask(releaseTagComment, st)
    val branch          = st.extract.get(orgCommitBranchSetting)
    val commitMessage   = st.extract.get(orgCommitMessageSetting)
    val baseDir         = st.extract.get(baseDirectory in LocalRootProject)
    val orgTemplatesDir = st.extract.get(orgTemplatesDirectorySetting)
    val orgTargetDir    = st.extract.get(orgTargetDirectorySetting)

    val vs = st
      .get(versions)
      .getOrElse(sys.error("No versions are set! Was this release part executed before inquireVersions?"))

    (for {
      _ <- fh.createResources(orgTemplatesDir, orgTargetDir)
      fileType = ChangelogFileType(DateTime.now(DateTimeZone.UTC), vs._1, comment)
      _ <- fh.checkOrgFiles(baseDir, orgTargetDir, List(fileType))
      _ <- ghOps.commitFiles(
        baseDir = baseDir,
        branch = branch,
        message = s"$commitMessage [ci skip]",
        files = List(fileType.outputPath))
    } yield ()) match {
      case Right(_) => st.log.info("Update Change Log was finished successfully")
      case Left(e) =>
        e.printStackTrace()
        sys.error(s"Error updating Changelog file")
    }

    st
  }

  lazy val orgCommitNextVersion: ReleaseStep = { st: State =>
    val ghOps: GitHubOps = st.extract.get(orgGithubOpsSetting)
    val file             = st.extract.get(releaseVersionFile)
    val branch           = st.extract.get(orgCommitBranchSetting)
    val baseDir          = st.extract.get(baseDirectory in LocalRootProject)

    val vs = st
      .get(versions)
      .getOrElse(sys.error("No versions are set! Was this release part executed before inquireVersions?"))

    val commitMessage = s"$orgVersionCommitMessage to ${vs._2}"

    ghOps.commitFiles(
      baseDir = baseDir,
      branch = branch,
      message = commitMessage,
      files = List(file.getName)) match {
      case Right(_) => st.log.info("Next version was committed successfully")
      case Left(e) =>
        e.printStackTrace()
        sys.error(s"Error committing next version")
    }

    st
  }

  lazy val orgPostRelease: ReleaseStep = { st: State =>
    if (sbtorgpolicies.utils.getEnvVar("TRAVIS").isEmpty) {
      st.log.warn(
        "No Travis Environment detected, please be sure you revert " +
          "your local changes and fetch the latest remote changes")
    }
    st
  }

  private[this] def vcs(st: State): Vcs =
    st.extract
      .get(releaseVcs)
      .getOrElse(sys.error("Aborting release. Working directory is not a repository of a recognized VCS."))

}
