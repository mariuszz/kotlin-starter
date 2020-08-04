plugins {
    application
    kotlin("jvm")
}

dependencies {
    implementation("io.ktor:ktor-server-netty:1.3.2")
    runtimeOnly("org.slf4j:slf4j-simple:1.7.30")
    implementation(kotlin("stdlib-jdk8"))
}

application {
    mainClassName = "com.zamolski.kotlinstarter.web.MainKt"
}