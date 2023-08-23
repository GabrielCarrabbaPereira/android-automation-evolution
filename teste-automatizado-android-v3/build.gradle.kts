plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.junit:junit-bom:5.9.1"))
    implementation("org.junit.jupiter:junit-jupiter")
    implementation("io.appium:java-client:8.5.1")

    implementation("org.seleniumhq.selenium:selenium-support:4.10.0")
}

tasks.test {
    useJUnitPlatform()
}