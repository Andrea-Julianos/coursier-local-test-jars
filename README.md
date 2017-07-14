Example project which demonstrates a bug in sbt-coursier related to resolving test-jars that have been published to a local ivy repository.

To see the bug:

 - go to directory `a` and run `sbt publishLocal`
 - go to directory `b` and run `sbt test`
 - notice that the `test-jar` for `a` is not on the test classpath despite support for test-jars being enabled on the project
 - everything works fine if `a` is resolved from a remote repository instead
