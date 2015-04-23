name := "SparkDemo"

version := "1.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  "spray repo" at "http://repo.spray.io"
)

libraryDependencies ++= {
  val akkaV = "2.3.6"
  val sprayV = "1.3.2"
  val sparkV = "1.2.0"
  Seq(
    "org.rogach"          %%  "scallop"       % "0.9.5",
    "com.github.scopt"    %%  "scopt"         % "3.3.0",
    "io.spray"            %%  "spray-can"     % sprayV,
    "io.spray"            %%  "spray-routing" % sprayV,
    "io.spray"            %%  "spray-testkit" % sprayV  % "test" exclude ("org.scalamacros", "quasiquotes_2.10.3"),
    "io.spray"            %%  "spray-json"    % "1.3.1",
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"   % "2.4.15" % "test"
  )
}