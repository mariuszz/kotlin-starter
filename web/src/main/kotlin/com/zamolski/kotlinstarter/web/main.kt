package com.zamolski.kotlinstarter.web

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    embeddedServer(Netty, 8888) {
        routing {
            get("/") {
                call.respondText("Kotlin works!", ContentType.Text.Html)
            }
        }
    }.start(wait = true)
}
