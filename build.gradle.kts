plugins {
	id("org.openjfx.javafxplugin") version("0.0.10") apply(false)
	kotlin("jvm") version "1.6.10"
}

allprojects {
	repositories {
		mavenCentral()
	}
}

subprojects {
	apply {
		plugin("application")
		plugin("kotlin")

	}

	kotlin {
		jvmToolchain {
			(this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(17))
		}

	}
}