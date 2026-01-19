plugins {
  kotlin("jvm") version "2.3.0"
  application
}

application {
  mainClass.set("uk.gov.justice.hmpps.architecture.App")
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation("com.structurizr:structurizr-client:1.29.0")
  implementation("com.structurizr:structurizr-core:1.29.0")
  implementation("com.structurizr:structurizr-import:1.7.0")
  implementation("com.structurizr:structurizr-graphviz:2.2.2")
  implementation("org.eclipse.jgit:org.eclipse.jgit:7.5.0.202512021534-r")
  implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.21.0")
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.21.0")

  testImplementation("org.assertj:assertj-core:3.27.6")
  testImplementation("org.junit.jupiter:junit-jupiter-api:5.14.2")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.14.2")
}

val test by tasks.getting(Test::class) {
  useJUnitPlatform()
}
