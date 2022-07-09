package com.example.routes

import com.example.model.Hadist
import com.example.repository.DatabaseFactory
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.routing.application

fun Route.updateHadist(
    db: DatabaseFactory
) {
    put("/hadist/update_hadist"){
        val hadist = call.receive<Hadist>()
        try {
            val response = db.updateHadistById(hadist)
                call.respond(
                    message = response,
                    status = HttpStatusCode.OK
                )
        }catch (e:Exception){
            application.log.error("Failed to update Data",e.message)
        }
    }
}