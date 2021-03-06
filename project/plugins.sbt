logLevel := Level.Warn

resolvers := Seq("Artifactory" at "http://lolhens.no-ip.org/artifactory/libs-release/")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.1")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.4")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.1.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0")
