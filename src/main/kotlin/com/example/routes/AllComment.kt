package com.example.routes

import com.example.repository.DatabaseFactory
import com.example.repository.HadistRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllComment(
    db: DatabaseFactory
){
    val hadistRepository : HadistRepository by inject()

    get("/comment"){
        val apiResponse = hadistRepository.getAllHadist()
        try {
            val hadist = db.getAllComment()
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        }catch (e:Exception){
            application.log.error("Failed to register user",e.message)
        }
    }
}