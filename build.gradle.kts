plugins {

    kotlin("jvm") version "1.6.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral() // This is a common repository, make sure it's included

    maven {
        url = uri("https://jitpack.io")
    }
}
configurations {
    all {
        exclude(group = "org.processing", module = "core")
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))

    implementation(files("lib/core/core.jar"))
}


tasks.test {
    useJUnitPlatform()
}
