name := """mesos-helloworld"""

version := "1.0"

retrieveManaged := true

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "org.apache.mesos" % "mesos" % "0.28.1"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.4"


// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

