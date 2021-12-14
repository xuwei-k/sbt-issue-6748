resolvers += "my repo" at file("maven-repo").toURI.toURL.toString

libraryDependencies += "foo" % "bar" % "1"
