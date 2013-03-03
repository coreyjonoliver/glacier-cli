name := "glacier-cli"

organization := "org.coreyoliver"

version := "0.1"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk" % "1.3.32",
  "com.github.scopt" %% "scopt" % "2.1.0",
  "org.scalatest" %% "scalatest" % "1.8" % "test",
  "org.rogach" %% "scallop" % "0.7.0"
)

resolvers ++= Seq(
  "sonatype-public" at "https://oss.sonatype.org/content/groups/public"
)

parallelExecution in Test := false
