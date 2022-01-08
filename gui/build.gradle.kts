plugins {
	id("org.openjfx.javafxplugin")
}

dependencies {
    implementation(project(":core"))
}

application {
    mainClass.set("com.zamolski.kotlinstarter.gui.MainKt")
}

javafx {
    version = "17"
    modules("javafx.controls")
}
