package com.example.routes

import com.example.repository.DatabaseFactory
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.getHadistById(
    db: DatabaseFactory
){
    get("/{id}"){
        val id = call.parameters["id"]

        try {
            val hadist = db.getHadistById(id!!)
            call.respond(hadist)

        }catch (e:Exception){
            application.log.error("Failed to get Data",e.message)
        }
    }
}