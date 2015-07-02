name := """nvwa"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,

  // Automatically translate plain English stories to BDD test cases
  "org.scalatest" % "scalatest_2.11" % "3.0.0-M1",
  "org.scalatestplus" % "play_2.11" % "1.4.0-M3",
  "info.cukes" % "cucumber-scala_2.11" % "1.2.2",

  // AWS KCL and KPL
  // "com.amazonaws" % "amazon-kinesis-producer" % "0.9.0",
  "com.amazonaws" % "amazon-kinesis-client" % "1.4.0",
  // Gilt Gfc Kinesis
  "com.gilt" % "gfc-kinesis_2.11" % "0.0.10"
)

resolvers += "Sonatype-Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
// routesGenerator := InjectedRoutesGenerator

// Play2-cucumber integration
cucumberSettings

cucumberFeaturesLocation := "./test/BDD/features"

cucumberStepsBasePackage := "features.steps"
