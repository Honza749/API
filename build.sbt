ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"
val akkaVersion = "2.6.19"
val akkaHttpVersion = "10.2.9"

libraryDependencies ++= Seq(
  // akka streams
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  // akka http
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "org.scalaj" %% "scalaj-http" % "2.4.2"
)

lazy val root = (project in file("."))
  .settings(
    name := "API"
  )
