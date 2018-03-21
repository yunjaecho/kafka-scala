sbtPlugin := true

name := "kafka-scala"

version := "0.1"

scalaVersion := "2.12.5"

assemblyJarName in assembly := name.value +".jar"

assemblyOption in assembly := (assemblyOption in assembly).value.copy(cacheUnzip = false)

mainClass in assembly := Some("com.yunjae.counter.Main") //optional

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "0.10.1.0"