ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "zapi"
  )

//libraryDependencies ++= Seq(
//  "dev.zio" %% "zio" % "2.0.1",
//  "dev.zio" %% "zio-streams" % "2.0.0",
//  "dev.zio" %% "zio-json" % "0.3.0",
//  "io.d11" %% "zhttp" % "2.0.0-RC11"
//)

libraryDependencies ++= Seq(
  "dev.zio"       %% "zio"            % "2.0.17",
  "dev.zio"       %% "zio-json"       % "0.6.2",
  "dev.zio"       %% "zio-http"       % "3.0.0-RC2",
  "io.getquill"   %% "quill-zio"      % "4.6.0",
  "io.getquill"   %% "quill-jdbc-zio" % "4.6.0",
  "com.h2database" % "h2"             % "2.2.224"
)

