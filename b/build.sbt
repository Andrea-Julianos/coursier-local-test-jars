organization := "com.github.mpilquist"
name := "coursier-test-b"

classpathTypes += "test-jar"
libraryDependencies ++= Seq(
  "com.github.mpilquist" %% "coursier-test-a" % "0.1-SNAPSHOT",
  "com.github.mpilquist" %% "coursier-test-a" % "0.1-SNAPSHOT" % "test" classifier "tests"
)
