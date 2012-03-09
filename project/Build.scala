import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "classloading-problem"
    val appVersion      = "1.0-SNAPSHOT"

  val novusRepo = "Novus Release Repository" at "http://repo.novus.com/releases/"
  val novusSnapsRepo = "Novus Snapshots Repository" at "http://repo.novus.com/snapshots/"

  val salatCore = "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT" withSources
  val salatUtil = "com.novus" %% "salat-util" % "0.0.8-SNAPSHOT" withSources

  val appDependencies = Seq(
    // Add your project dependencies here,
    salatCore,
    salatUtil
  )

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
    // Add your own project settings here
    resolvers ++= Seq(
      novusSnapsRepo
    )
  )

}
