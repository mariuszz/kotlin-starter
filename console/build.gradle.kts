plugins {
	application
    id("org.jetbrains.kotlin.jvm")
}


application {
    mainClassName = "com.zamolski.kotlinstarter.console.MainKt"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
