package com.example.routes

import com.example.model.Comment
import com.example.model.Hadist
import com.example.repository.DatabaseFactory
import com.example.repository.HadistRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.insertComment(
    db: DatabaseFactory
){
    val hadistRepository : HadistRepository by inject()

    post("/comment"){
        val apiResponse = call.receive<Comment>()

        try {
            val hadist = db.addUComment(apiResponse)
            call.respond(
                message = hadist,
                status = HttpStatusCode.OK
            )

        }catch (e:Exception){
            application.log.error("Failed to register user",e.message)
        }
    }
}