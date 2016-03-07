name := "skyspoon"
version := "1.0"
scalaVersion := "2.11.7"
organization := "fil.iagl.idl.skyspoon"
mainClass in assembly := Some("fil.iagl.opl.skyspoon.Main")
assemblyJarName in assembly := "skyspoon.jar"

libraryDependencies := Seq(
  "fr.inria.gforge.spoon" % "spoon-core" % "5.0.0",
  "org.scalactic" %% "scalactic" % "2.2.6",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.scalamock" % "scalamock-scalatest-support_2.11" % "3.2.2"
)

resolvers := Seq(
  "Maven Repository for JDT Compiler release" at "https://repo.eclipse.org/content/repositories/eclipse-staging/"
)
