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

package sbtorgpolicies

object libraries {

  type Artifact = (String, String, String)

  val v47: Map[String, String] = Map[String, String](
    "iota"            -> "0.3.4",
    "case-classy"     -> "0.4.0",
    "fetch"           -> "0.7.2",
    "freestyle"       -> "0.6.3",
    "frees-rpc"       -> "0.10.0",
    "frees-cassandra" -> "0.1.1",
    "github4s"        -> "0.18.0",
    "org-policies"    -> sbtorgpolicies.BuildInfo.version,
    "scheckToolbox"   -> "0.2.4"
  )

  protected val vOthers: Map[String, String] = Map[String, String](
    "akka"                     -> "2.5.9",
    "akka-http"                -> "10.0.11",
    "algebra"                  -> "0.7.0",
    "alleycats"                -> "1.0.1",
    "apache-kafka"             -> "1.0.0",
    "avro4s"                   -> "1.8.1",
    "base64"                   -> "0.2.4",
    "cassandra-driver"         -> "3.4.0",
    "catalysts"                -> "0.0.5",
    "catbird"                  -> "18.1.0",
    "cats"                     -> "1.0.1",
    "cats-effect"              -> "0.8",
    "cats-mtl"                 -> "0.2.3",
    "circe"                    -> "0.9.1",
    "config"                   -> "1.3.2",
    "coursier"                 -> "1.0.2",
    "discipline"               -> "0.8",
    "doobie"                   -> "0.5.0",
    "embedded-kafka"           -> "1.0.0",
    "embedded-redis"           -> "0.6",
    "export-hook"              -> "1.2.0",
    "finch"                    -> "0.17.0",
    "fs2"                      -> "0.10.1",
    "fs2-cats"                 -> "0.5.0",
    "fs2-reactive-streams"     -> "0.5.0",
    "grpc"                     -> "1.9.0",
    "guava"                    -> "22.0",
    "hammock"                  -> "0.8.2",
    "h2"                       -> "1.4.196",
    "http4s"                   -> "0.18.0",
    "joda-convert"             -> "1.9.2",
    "joda-time"                -> "2.9.9",
    "journal"                  -> "3.0.19",
    "jwt-scala"                -> "0.14.1",
    "kind-projector"           -> "0.9.6",
    "log4s"                    -> "1.4.0",
    "logback"                  -> "1.2.3",
    "machinist"                -> "0.6.3",
    "macro-compat"             -> "1.1.1",
    "mainecoon"                -> "0.6.2",
    "monix"                    -> "3.0.0-M3",
    "monocle"                  -> "1.5.0",
    "mockito"                  -> "2.15.0",
    "moultingyaml"             -> "0.4.0",
    "newrelic"                 -> "3.47.0",
    "paradise"                 -> "2.1.0",
    "pbdirect"                 -> "0.1.0",
    "pcplod"                   -> "1.2.1",
    "play"                     -> "2.6.11",
    "postgresql"               -> "42.2.1",
    "prometheus"               -> "0.2.0",
    "pure-config"              -> "0.7.0",
    "rediscala"                -> "1.8.0",
    "refined"                  -> "0.8.7",
    "roshttp"                  -> "2.1.0",
    "scala-parser-combinators" -> "1.0.6",
    "scala-reflect"            -> "2.11.11",
    "scalacheck"               -> "1.13.5",
    "scheckShapeless"          -> "1.1.8",
    "scalactic"                -> "3.0.5",
    "scalaj"                   -> "2.3.0",
    "scalameta"                -> "3.2.0",
    "scalameta-paradise"       -> "3.0.0-M10",
    "scalamock"                -> "3.6.0",
    "scalatags"                -> "0.6.7",
    "scalatest"                -> "3.0.5",
    "scalaz"                   -> "7.2.19",
    "scalazspecs2"             -> "0.5.2",
    "scanamo"                  -> "0.9.5",
    "shapeless"                -> "2.3.3",
    "shocon"                   -> "0.2.0",
    "simulacrum"               -> "0.11.0",
    "slf4j"                    -> "1.7.25",
    "slick"                    -> "3.2.1",
    "slogging"                 -> "0.6.1",
    "sourcecode"               -> "0.1.4",
    "specs2"                   -> "4.0.2",
    "twitter-server"           -> "18.2.0"
  )

  val vPlugins47: Map[String, String] = Map[String, String](
    "sbt-dependencies" -> "0.3.8",
    "sbt-microsites"   -> "0.7.15"
  )

  val vPluginsOthers: Map[String, String] = Map[String, String](
    "sbt-buildinfo"         -> "0.7.0",
    "sbt-ghpages"           -> "0.6.2",
    "sbt-git"               -> "0.9.3",
    "sbt-header"            -> "4.1.0",
    "sbt-pgp"               -> "1.1.0",
    "sbt-jmh"               -> "0.3.3",
    "sbt-release"           -> "1.0.7",
    "sbt-scalafmt"          -> "0.6.8",
    "sbt-scalajs"           -> "0.6.22",
    "sbt-scoverage"         -> "1.5.1",
    "sbt-site"              -> "1.3.1",
    "sbt-sonatype"          -> "2.0",
    "sbt-unidoc"            -> "0.4.1",
    "sbt-wartremover"       -> "2.2.1",
    "scalastyle-sbt-plugin" -> "1.0.0",
    "tut-plugin"            -> "0.6.2"
  )

  val v: Map[String, String] = v47 ++ vOthers ++ vPlugins47 ++ vPluginsOthers

  val langLibs: Map[String, Artifact] = Map(
    "paradise"    -> (("org.scalamacros", "paradise", v("paradise"))),
    "quasiquotes" -> (("org.scalamacros", "quasiquotes", v("paradise"))),
    "scala-parser-combinators" -> (
      (
        "org.scala-lang.modules",
        "scala-parser-combinators",
        v("scala-parser-combinators"))),
    "scala-reflect" -> (("org.scala-lang", "scala-reflect", v("scala-reflect")))
  )

  val javaLibs: Map[String, Artifact] = Map(
    "cassandra-driver-core"    -> (("com.datastax.cassandra", "cassandra-driver-core", v("cassandra-driver"))),
    "cassandra-driver-extras"  -> (("com.datastax.cassandra", "cassandra-driver-extras", v("cassandra-driver"))),
    "cassandra-driver-mapping" -> (("com.datastax.cassandra", "cassandra-driver-mapping", v("cassandra-driver"))),
    "config"                   -> (("com.typesafe", "config", v("config"))),
    "embedded-redis"           -> (("com.orange.redis-embedded", "embedded-redis", v("embedded-redis"))),
    "h2"                       -> (("com.h2database", "h2", v("h2"))),
    "joda-convert"             -> (("org.joda", "joda-convert", v("joda-convert"))),
    "joda-time"                -> (("joda-time", "joda-time", v("joda-time"))),
    "kafka-clients"            -> (("org.apache.kafka", "kafka-clients", v("apache-kafka"))),
    "kafka-streams"            -> (("org.apache.kafka", "kafka-streams", v("apache-kafka"))),
    "log4j-over-slf4j"         -> (("org.slf4j", "log4j-over-slf4j", v("slf4j"))),
    "logback-classic"          -> (("ch.qos.logback", "logback-classic", v("logback"))),
    "mockito-core"             -> (("org.mockito", "mockito-core", v("mockito"))),
    "newrelic"                 -> (("com.newrelic.agent.java", "newrelic-agent", v("newrelic"))),
    "postgresql"               -> (("org.postgresql", "postgresql", v("postgresql"))),
    "prometheus"               -> (("io.prometheus", "simpleclient", v("prometheus"))),
    "slf4j-api"                -> (("org.slf4j", "slf4j-api", v("slf4j"))),
    "slf4j-nop"                -> (("org.slf4j", "slf4j-nop", v("slf4j"))),
    "slf4j-simple"             -> (("org.slf4j", "slf4j-simple", v("slf4j")))
  )

  val scalaLibs: Map[String, Artifact] = Map(
    "akka-actor"                       -> (("com.typesafe.akka", "akka-actor", v("akka"))),
    "akka-http"                        -> (("com.typesafe.akka", "akka-http", v("akka-http"))),
    "akka-http-testkit"                -> (("com.typesafe.akka", "akka-http-testkit", v("akka-http"))),
    "akka-testkit"                     -> (("com.typesafe.akka", "akka-testkit", v("akka"))),
    "algebra-laws"                     -> (("org.typelevel", "algebra-laws", v("algebra"))),
    "algebra"                          -> (("org.typelevel", "algebra", v("algebra"))),
    "alleycats"                        -> (("org.typelevel", "alleycats-core", v("alleycats"))),
    "avro4s"                           -> (("com.sksamuel.avro4s", "avro4s-core", v("avro4s"))),
    "base64"                           -> (("com.github.marklister", "base64", v("base64"))),
    "classy-cats"                      -> (("com.47deg", "classy-cats", v("case-classy"))),
    "classy-config-typesafe"           -> (("com.47deg", "classy-config-typesafe", v("case-classy"))),
    "classy-config-shocon"             -> (("com.47deg", "classy-config-shocon", v("case-classy"))),
    "classy-core"                      -> (("com.47deg", "classy-core", v("case-classy"))),
    "classy-generic"                   -> (("com.47deg", "classy-generic", v("case-classy"))),
    "catalysts-checklite"              -> (("org.typelevel", "catalysts-checklite", v("catalysts"))),
    "catalysts-lawkit"                 -> (("org.typelevel", "catalysts-lawkit", v("catalysts"))),
    "catalysts-macros"                 -> (("org.typelevel", "catalysts-macros", v("catalysts"))),
    "catalysts-platform"               -> (("org.typelevel", "catalysts-platform", v("catalysts"))),
    "catalysts-scalatest"              -> (("org.typelevel", "catalysts-scalatest", v("catalysts"))),
    "catalysts-specbase"               -> (("org.typelevel", "catalysts-specbase", v("catalysts"))),
    "catalysts-speclite"               -> (("org.typelevel", "catalysts-speclite", v("catalysts"))),
    "catalysts-specs2"                 -> (("org.typelevel", "catalysts-specs2", v("catalysts"))),
    "catalysts-testkit"                -> (("org.typelevel", "catalysts-testkit", v("catalysts"))),
    "catbird-util"                     -> (("io.catbird", "catbird-util", v("catbird"))),
    "cats-core"                        -> (("org.typelevel", "cats-core", v("cats"))),
    "cats-effect"                      -> (("org.typelevel", "cats-effect", v("cats-effect"))),
    "cats-free"                        -> (("org.typelevel", "cats-free", v("cats"))),
    "cats-kernel"                      -> (("org.typelevel", "cats-kernel", v("cats"))),
    "cats-laws"                        -> (("org.typelevel", "cats-laws", v("cats"))),
    "cats-macros"                      -> (("org.typelevel", "cats-macros", v("cats"))),
    "cats-mtl-core"                    -> (("org.typelevel", "cats-mtl-core", v("cats-mtl"))),
    "cats-testkit"                     -> (("org.typelevel", "cats-testkit", v("cats"))),
    "circe-core"                       -> (("io.circe", "circe-core", v("circe"))),
    "circe-generic"                    -> (("io.circe", "circe-generic", v("circe"))),
    "circe-parser"                     -> (("io.circe", "circe-parser", v("circe"))),
    "circe-optics"                     -> (("io.circe", "circe-optics", v("circe"))),
    "coursier-cache"                   -> (("io.get-coursier", "coursier-cache", v("coursier"))),
    "coursier"                         -> (("io.get-coursier", "coursier", v("coursier"))),
    "discipline"                       -> (("org.typelevel", "discipline", v("discipline"))),
    "doobie-core"                      -> (("org.tpolecat", "doobie-core", v("doobie"))),
    "doobie-hikari"                    -> (("org.tpolecat", "doobie-hikari", v("doobie"))),
    "doobie-h2"                        -> (("org.tpolecat", "doobie-h2", v("doobie"))),
    "doobie-postgres"                  -> (("org.tpolecat", "doobie-postgres", v("doobie"))),
    "doobie-scalatest"                 -> (("org.tpolecat", "doobie-scalatest", v("doobie"))),
    "doobie-specs2"                    -> (("org.tpolecat", "doobie-specs2", v("doobie"))),
    "scalatest-embedded-kafka"         -> (("net.manub", "scalatest-embedded-kafka", v("embedded-kafka"))),
    "scalatest-embedded-kafka-streams" -> (("net.manub", "scalatest-embedded-kafka-streams", v("embedded-kafka"))),
    "export-hook"                      -> (("org.typelevel", "export-hook", v("export-hook"))),
    "fetch"                            -> (("com.47deg", "fetch", v("fetch"))),
    "fetch-monix"                      -> (("com.47deg", "fetch-monix", v("fetch"))),
    "fetch-debug"                      -> (("com.47deg", "fetch-debug", v("fetch"))),
    "finch-core"                       -> (("com.github.finagle", "finch-core", v("finch"))),
    "finch-circe"                      -> (("com.github.finagle", "finch-circe", v("finch"))),
    "frees-akka"                       -> (("io.frees", "frees-akka", v("freestyle"))),
    "frees-async"                      -> (("io.frees", "frees-async", v("freestyle"))),
    "frees-async-cats-effect"          -> (("io.frees", "frees-async-cats-effect", v("freestyle"))),
    "frees-async-guava"                -> (("io.frees", "frees-async-guava", v("freestyle"))),
    "frees-cache"                      -> (("io.frees", "frees-cache", v("freestyle"))),
    "frees-cache-redis"                -> (("io.frees", "frees-cache-redis", v("freestyle"))),
    "frees-cassandra"                  -> (("io.frees", "frees-cassandra-core", v("frees-cassandra"))),
    "frees-config"                     -> (("io.frees", "frees-config", v("freestyle"))),
    "frees-core"                       -> (("io.frees", "frees-core", v("freestyle"))),
    "frees-doobie"                     -> (("io.frees", "frees-doobie", v("freestyle"))),
    "frees-effects"                    -> (("io.frees", "frees-effects", v("freestyle"))),
    "frees-fetch"                      -> (("io.frees", "frees-fetch", v("freestyle"))),
    "frees-finch"                      -> (("io.frees", "frees-finch", v("freestyle"))),
    "frees-http4s"                     -> (("io.frees", "frees-http4s", v("freestyle"))),
    "frees-http-client"                -> (("io.frees", "frees-http-client", v("freestyle"))),
    "frees-logging"                    -> (("io.frees", "frees-logging", v("freestyle"))),
    "frees-monix"                      -> (("io.frees", "frees-monix", v("freestyle"))),
    "frees-play"                       -> (("io.frees", "frees-play", v("freestyle"))),
    "frees-rpc"                        -> (("io.frees", "frees-rpc", v("frees-rpc"))),
    "frees-rpc-common"                 -> (("io.frees", "frees-rpc-common", v("frees-rpc"))),
    "frees-slick"                      -> (("io.frees", "frees-slick", v("freestyle"))),
    "frees-tagless"                    -> (("io.frees", "frees-tagless", v("freestyle"))),
    "frees-twitter-util"               -> (("io.frees", "frees-twitter-util", v("freestyle"))),
    "fs2-core"                         -> (("co.fs2", "fs2-core", v("fs2"))),
    "fs2-io"                           -> (("co.fs2", "fs2-io", v("fs2"))),
    "fs2-cats"                         -> (("co.fs2", "fs2-cats", v("fs2-cats"))),
    "fs2-reactive-streams"             -> (("com.github.zainab-ali", "fs2-reactive-streams", v("fs2-reactive-streams"))),
    "github4s"                         -> (("com.47deg", "github4s", v("github4s"))),
    "grpc-all"                         -> (("io.grpc", "grpc-all", v("grpc"))),
    "grpc-auth"                        -> (("io.grpc", "grpc-auth", v("grpc"))),
    "grpc-context"                     -> (("io.grpc", "grpc-context", v("grpc"))),
    "grpc-core"                        -> (("io.grpc", "grpc-core", v("grpc"))),
    "grpc-netty"                       -> (("io.grpc", "grpc-netty", v("grpc"))),
    "grpc-protobuf"                    -> (("io.grpc", "grpc-protobuf", v("grpc"))),
    "grpc-okhttp"                      -> (("io.grpc", "grpc-okhttp", v("grpc"))),
    "grpc-services"                    -> (("io.grpc", "grpc-services", v("grpc"))),
    "grpc-stub"                        -> (("io.grpc", "grpc-stub", v("grpc"))),
    "grpc-testing"                     -> (("io.grpc", "grpc-testing", v("grpc"))),
    "guava"                            -> (("com.google.guava", "guava", v("guava"))),
    "hammock-core"                     -> (("com.pepegar", "hammock-core", v("hammock"))),
    "http4s-blaze-client"              -> (("org.http4s", "http4s-blaze-client", v("http4s"))),
    "http4s-blaze-server"              -> (("org.http4s", "http4s-blaze-server", v("http4s"))),
    "http4s-circe"                     -> (("org.http4s", "http4s-circe", v("http4s"))),
    "http4s-core"                      -> (("org.http4s", "http4s-core", v("http4s"))),
    "http4s-dsl"                       -> (("org.http4s", "http4s-dsl", v("http4s"))),
    "iota-core"                        -> (("io.frees", "iota-core", v("iota"))),
    "iotaz-core"                       -> (("io.frees", "iotaz-core", v("iota"))),
    "journal-core"                     -> (("io.verizon.journal", "core", v("journal"))),
    "jwt-core"                         -> (("com.pauldijou", "jwt-core", v("jwt-scala"))),
    "jwt-play-json"                    -> (("com.pauldijou", "jwt-play-json", v("jwt-scala"))),
    "jwt-play"                         -> (("com.pauldijou", "jwt-play", v("jwt-scala"))),
    "jwt-json4s-native"                -> (("com.pauldijou", "jwt-json4s-native", v("jwt-scala"))),
    "jwt-json4s-jackson"               -> (("com.pauldijou", "jwt-json4s-jackson", v("jwt-scala"))),
    "jwt-circe"                        -> (("com.pauldijou", "jwt-circe", v("jwt-scala"))),
    "jwt-upickle"                      -> (("com.pauldijou", "jwt-upickle", v("jwt-scala"))),
    "kind-projector"                   -> (("org.spire-math", "kind-projector", v("kind-projector"))),
    "log4s"                            -> (("org.log4s", "log4s", v("log4s"))),
    "machinist"                        -> (("org.typelevel", "machinist", v("machinist"))),
    "macro-compat"                     -> (("org.typelevel", "macro-compat", v("macro-compat"))),
    "monix"                            -> (("io.monix", "monix", v("monix"))),
    "mainecoon-core"                   -> (("com.kailuowang", "mainecoon-core", v("mainecoon"))),
    "mainecoon-laws"                   -> (("com.kailuowang", "mainecoon-laws", v("mainecoon"))),
    "monix-cats"                       -> (("io.monix", "monix-cats", v("monix"))),
    "monix-eval"                       -> (("io.monix", "monix-eval", v("monix"))),
    "monocle-core"                     -> (("com.github.julien-truffaut", "monocle-core", v("monocle"))),
    "monocle-generic"                  -> (("com.github.julien-truffaut", "monocle-generic", v("monocle"))),
    "monocle-law"                      -> (("com.github.julien-truffaut", "monocle-law", v("monocle"))),
    "monocle-macro"                    -> (("com.github.julien-truffaut", "monocle-macro", v("monocle"))),
    "monocle-state"                    -> (("com.github.julien-truffaut", "monocle-state", v("monocle"))),
    "moultingyaml"                     -> (("net.jcazevedo", "moultingyaml", v("moultingyaml"))),
    "org-policies-core"                -> (("com.47deg", "org-policies-core", v("org-policies"))),
    "pbdirect"                         -> (("beyondthelines", "pbdirect", v("pbdirect"))),
    "pcplod"                           -> (("org.ensime", "pcplod", v("pcplod"))),
    "play"                             -> (("com.typesafe.play", "play", v("play"))),
    "play-test"                        -> (("com.typesafe.play", "play-test", v("play"))),
    "pure-config"                      -> (("com.github.melrief", "pureconfig", v("pure-config"))),
    "rediscala"                        -> (("com.github.etaty", "rediscala", v("rediscala"))),
    "refined-scalacheck"               -> (("eu.timepit", "refined-scalacheck", v("refined"))),
    "refined-scalaz"                   -> (("eu.timepit", "refined-scalaz", v("refined"))),
    "refined-scodec"                   -> (("eu.timepit", "refined-scodec", v("refined"))),
    "refined"                          -> (("eu.timepit", "refined", v("refined"))),
    "roshttp"                          -> (("fr.hmil", "roshttp", v("roshttp"))),
    "scalacheck"                       -> (("org.scalacheck", "scalacheck", v("scalacheck"))),
    "scheckShapeless"                  -> (("com.github.alexarchambault", "scalacheck-shapeless_1.13", v("scheckShapeless"))),
    "scheckToolboxDatetime"            -> (("com.47deg", "scalacheck-toolbox-datetime", v("scheckToolbox"))),
    "scheckToolboxMagic"               -> (("com.47deg", "scalacheck-toolbox-magic", v("scheckToolbox"))),
    "scheckToolboxComb"                -> (("com.47deg", "scalacheck-toolbox-combinators", v("scheckToolbox"))),
    "scalactic"                        -> (("org.scalactic", "scalactic", v("scalactic"))),
    "scalaj"                           -> (("org.scalaj", "scalaj-http", v("scalaj"))),
    "scalameta"                        -> (("org.scalameta", "scalameta", v("scalameta"))),
    "scalameta-contrib"                -> (("org.scalameta", "contrib", v("scalameta"))),
    "scalameta-paradise"               -> (("org.scalameta", "paradise", v("scalameta-paradise"))),
    "scalamockScalatest"               -> (("org.scalamock", "scalamock-scalatest-support", v("scalamock"))),
    "scalamockSpecs2"                  -> (("org.scalamock", "scalamock-specs2-support", v("scalamock"))),
    "scalatags"                        -> (("com.lihaoyi", "scalatags", v("scalatags"))),
    "scalatest"                        -> (("org.scalatest", "scalatest", v("scalatest"))),
    "scalaz-concurrent"                -> (("org.scalaz", "scalaz-concurrent", v("scalaz"))),
    "scalazspecs2"                     -> (("org.typelevel", "scalaz-specs2", v("scalazspecs2"))),
    "scanamo"                          -> (("com.gu", "scanamo", v("scanamo"))),
    "shapeless"                        -> (("com.chuusai", "shapeless", v("shapeless"))),
    "shocon"                           -> (("eu.unicredit", "shocon", v("shocon"))),
    "simulacrum"                       -> (("com.github.mpilquist", "simulacrum", v("simulacrum"))),
    "slick"                            -> (("com.typesafe.slick", "slick", v("slick"))),
    "slick-codegen"                    -> (("com.typesafe.slick", "slick-codegen", v("slick"))),
    "slogging"                         -> (("biz.enef", "slogging", v("slogging"))),
    "sourcecode"                       -> (("com.lihaoyi", "sourcecode", v("sourcecode"))),
    "specs2-core"                      -> (("org.specs2", "specs2-core", v("specs2"))),
    "specs2-scalacheck"                -> (("org.specs2", "specs2-scalacheck", v("specs2"))),
    "twitter-server"                   -> (("com.twitter", "twitter-server", v("twitter-server")))
  )

  val pluginLibs: Map[String, Artifact] = Map[String, Artifact](
    "sbt-buildinfo"    -> (("com.eed3si9n", "sbt-buildinfo", v("sbt-buildinfo"))),
    "sbt-dependencies" -> (("com.47deg", "sbt-dependencies", v("sbt-dependencies"))),
    "sbt-coursier"     -> (("io.get-coursier", "sbt-coursier", v("coursier"))),
    "sbt-ghpages"      -> (("com.typesafe.sbt", "sbt-ghpages", v("sbt-ghpages"))),
    "sbt-git"          -> (("com.typesafe.sbt", "sbt-git", v("sbt-git"))),
    "sbt-header"       -> (("de.heikoseeberger", "sbt-header", v("sbt-header"))),
    "sbt-jmh"          -> (("pl.project13.scala", "sbt-jmh", v("sbt-jmh"))),
    "sbt-microsites"   -> (("com.47deg", "sbt-microsites", v("sbt-microsites"))),
    "sbt-org-policies" -> (("com.47deg", "sbt-org-policies", v("org-policies"))),
    "sbt-pgp"          -> (("com.jsuereth", "sbt-pgp", v("sbt-pgp"))),
    "sbt-release"      -> (("com.github.gseitz", "sbt-release", v("sbt-release"))),
    "sbt-site"         -> (("com.typesafe.sbt", "sbt-site", v("sbt-site"))),
    "sbt-scalafmt"     -> (("com.geirsson", "sbt-scalafmt", v("sbt-scalafmt"))),
    "sbt-scalajs"      -> (("org.scala-js", "sbt-scalajs", v("sbt-scalajs"))),
    "sbt-scoverage"    -> (("org.scoverage", "sbt-scoverage", v("sbt-scoverage"))),
    "sbt-sonatype"     -> (("org.xerial.sbt", "sbt-sonatype", v("sbt-sonatype"))),
    "sbt-unidoc"       -> (("com.eed3si9n", "sbt-unidoc", v("sbt-unidoc"))),
    "sbt-wartremover"  -> (("org.wartremover", "sbt-wartremover", v("sbt-wartremover"))),
    "tut-plugin"       -> (("org.tpolecat", "tut-plugin", v("tut-plugin")))
  )

  val pluginScalaLibs: Map[String, Artifact] = Map[String, Artifact](
    "scalastyle-sbt-plugin" -> (("org.scalastyle", "scalastyle-sbt-plugin", v("scalastyle-sbt-plugin")))
  )

  val libs: Map[String, Artifact] = langLibs ++ javaLibs ++ scalaLibs

  val allPlugins: Map[String, Artifact] = pluginLibs ++ pluginScalaLibs
}
