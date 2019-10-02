plugins {
	application
	id("org.openjfx.javafxplugin")
    id("org.jetbrains.kotlin.jvm")
}

application {
    mainClassName = "com.zamolski.kotlinstarter.gui.MainKt"
}

javafx {
    version = "12.0.2"
    modules("javafx.controls")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}