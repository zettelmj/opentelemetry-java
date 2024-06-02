plugins {
  id("otel.java-conventions")
  id("otel.publish-conventions")
}

description = "OpenTelemetry SDK Auto-configuration SPI"
otelJava.moduleName.set("io.opentelemetry.sdk.autoconfigure.spi")

dependencies {
  api(project(":sdk:all"))
}

tasks {
  withType<JavaCompile>().configureEach {
    sourceCompatibility = "21"
    targetCompatibility = "21"
    options.release.set(21)
  }
}
