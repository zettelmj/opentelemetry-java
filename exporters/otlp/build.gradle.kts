subprojects {
  // Workaround https://github.com/gradle/gradle/issues/847
  group = "io.opentelemetry.exporter.otlp"
  val proj = this
  plugins.withId("java") {
    configure<BasePluginExtension> {
      archivesName.set("opentelemetry-exporter-otlp-${proj.name}")
    }
  }
}

tasks {
  withType<JavaCompile>().configureEach {
    sourceCompatibility = "21"
    targetCompatibility = "21"
    options.release.set(21)
  }
}
