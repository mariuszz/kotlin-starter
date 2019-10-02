plugins {
    application
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation("io.ktor:ktor-server-netty:1.2.4")
    runtime("org.slf4j:slf4j-simple:1.7.28")
    implementation(kotlin("stdlib-jdk8"))
}

application {
    mainClassName = "com.zamolski.kotlinstarter.web.MainKt"
}