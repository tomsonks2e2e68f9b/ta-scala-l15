organization := "example"
name := "scala-sandbox"
version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.2"

scalacOptions ++= Seq(
  "-feature"
  , "-deprecation"
  , "-unchecked"
  , "-encoding"
  , "UTF-8"
  , "-Xfatal-warnings"
  , "-language:_"
  , "-Ywarn-adapted-args" // Warn if an argument list is modified to match the receiver
  , "-Ywarn-dead-code" // Warn when dead code is identified.
  , "-Ywarn-inaccessible" // Warn about inaccessible types in method signatures.
  , "-Ywarn-infer-any" // Warn when a type argument is inferred to be `Any`.
  , "-Ywarn-nullary-override" // Warn when non-nullary `def f()' overrides nullary `def f'
  , "-Ywarn-nullary-unit" // Warn when nullary methods return Unit.
  , "-Ywarn-numeric-widen" // Warn when numerics are widened.
  , "-Ywarn-unused" // Warn when local and private vals, vars, defs, and types are are unused.
  , "-Ywarn-unused-import" // Warn when imports are unused.
)

libraryDependencies ++= Seq(
  "org.scalatest"          %% "scalatest"                    % "3.0.5" % Test,
  "org.scalikejdbc"        %% "scalikejdbc"                  % "3.2.3",
  "org.scalikejdbc"        %% "scalikejdbc-config"           % "3.2.3",
  "org.scalikejdbc"        %% "scalikejdbc-test"             % "3.2.3" % Test,
  "org.scalikejdbc"        %% "scalikejdbc-syntax-support-macro" % "3.2.+",
  "ch.qos.logback"         % "logback-classic"               % "1.2.3",
  "mysql"                  % "mysql-connector-java"          % "6.0.6"
)

