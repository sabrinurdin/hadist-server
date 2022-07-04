package com.example.routes

import com.example.repository.HadistRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllHadist(){
    val hadistRepository : HadistRepository by inject()

    get("/hadist"){
        val apiResponse = hadistRepository.getAllHadist()
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}