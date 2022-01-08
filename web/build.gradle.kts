dependencies {
    implementation(project(":core"))
    implementation("io.ktor:ktor-server-netty:1.6.7")
    runtimeOnly("org.slf4j:slf4j-simple:1.7.32")
}

application {
    mainClass.set("com.zamolski.kotlinstarter.web.MainKt")
}