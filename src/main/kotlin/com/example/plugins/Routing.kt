package com.example.plugins

import com.example.routes.getAllHadist
import io.ktor.application.*
import io.ktor.routing.*


fun Application.configureRouting() {

    routing {
        getAllHadist()
    }
}
