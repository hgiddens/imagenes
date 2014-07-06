import AssemblyKeys._

name := "imagenes"

organization := "nz.co.robotines"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.1"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-Xfatal-warnings",
  "-Xlint"
)

val sprayVersion = "1.3.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.4",
  "io.spray" %% "spray-can" % sprayVersion,
  "io.spray" %% "spray-routing" % sprayVersion
)

scalariformSettings

Revolver.settings

assemblySettings

jarName in assembly := s"${name.value}.jar"
