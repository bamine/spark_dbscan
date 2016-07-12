name := "spark_dbscan"

organization := "com.mfglabs"

version := "0.0.5"

scalaVersion in ThisBuild := "2.10.6"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.2" % "provided"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.2"

libraryDependencies += "com.github.scopt" %% "scopt" % "3.5.0"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

resolvers += Resolver.sonatypeRepo("public")

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))
