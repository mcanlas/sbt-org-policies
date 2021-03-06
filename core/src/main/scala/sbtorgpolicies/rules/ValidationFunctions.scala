/*
 * Copyright 2017-2018 47 Degrees, LLC. <http://www.47deg.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sbtorgpolicies.rules

import cats.instances.list._
import cats.kernel.instances.unit._
import cats.syntax.foldable._
import cats.syntax.validated._
import sbtorgpolicies.exceptions.ValidationException
import sbtorgpolicies.rules.syntax._

import scala.util.matching.Regex

trait ValidationFunctions {

  def requiredStrings(list: List[String]): ValidationFunction = {

    def validateList(content: String, list: List[String])(
        validateString: (String) => ValidationResult): ValidationResult =
      list.map(validateString).combineAll

    content: String =>
      validateList(content, list) { string =>
        if (content.contains(string)) ().valid else ValidationException(s"$string not found").invalidNel
      }
  }

  def requiredSection(startRegExp: Regex, endRegExp: Regex, validation: ValidationFunction): ValidationFunction = {

    case class Section(started: Boolean = false, ended: Boolean = false, lines: List[String] = Nil)

    def matches(r: Regex, s: String): Boolean =
      r.findFirstIn(s).isDefined

    content: String =>
      val sectionLines = content
        .split("\n")
        .foldLeft(Section()) {
          case (section, _) if section.ended => section
          case (section, l) if section.started && matches(endRegExp, l) =>
            section.copy(ended = true)
          case (section, l) if section.started =>
            section.copy(lines = section.lines :+ l)
          case (section, l) if matches(startRegExp, l) =>
            section.copy(started = true, lines = List(l))
          case (section, _) =>
            section
        }

      if (sectionLines.lines.isEmpty) {
        ValidationException("Section not found").invalidNel
      } else {
        validation(sectionLines.lines.mkString("\n"))
      }
  }

  def validTravisFile(
      crossScalaVersions: Seq[String],
      scriptExpectedTasks: Seq[String],
      afterSuccessTasks: Seq[String]): ValidationFunction = {

    def validateCrossScalaVersions(content: String): ValidationResult = {

      val travisCrossScalaVersion: List[String] = YamlOps.getFields(content, "scala").toList.sorted
      if (travisCrossScalaVersion == crossScalaVersions.sorted) ().valid
      else
        ValidationException(
          s".travis.yml is not valid, it doesn't contain all the " +
            s"cross scala versions for this project: $crossScalaVersions").invalidNel
    }

    def validateTasks(content: String, section: String, expectedTasks: Seq[String]): ValidationResult = {
      val tasksInTravisFile: List[String] = YamlOps.getFields(content, section).toList

      if (expectedTasks.forall(expectedTsk => tasksInTravisFile.exists(_.contains(expectedTsk))))
        ().valid
      else
        ValidationException(
          s".travis.yml is not valid, it doesn't contain all the " +
            s"expected tasks in the $section section: $expectedTasks").invalidNel
    }

    content: String =>
      validateCrossScalaVersions(content) combine
        validateTasks(content, "script", scriptExpectedTasks) combine
        validateTasks(content, "after_success", afterSuccessTasks)
  }
}

object ValidationFunctions extends ValidationFunctions
