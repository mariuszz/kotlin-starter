plugins {
	id("org.openjfx.javafxplugin") version("0.0.8") apply(false)
	id("org.jetbrains.kotlin.jvm") version("1.3.50") apply(false)
}

allprojects {
	repositories {
		jcenter()
	}
}
