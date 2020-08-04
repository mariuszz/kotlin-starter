plugins {
	application
	id("org.openjfx.javafxplugin")
    kotlin("jvm")
}

application {
    mainClassName = "com.zamolski.kotlinstarter.gui.MainKt"
}

javafx {
    version = "14"
    modules("javafx.controls")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}