package com.example.plugins

import com.example.model.Hadist
import com.example.repository.DatabaseFactory
import com.example.routes.*
import io.ktor.application.*
import io.ktor.routing.*


fun Application.configureRouting() {

    val databaseFactory = DatabaseFactory()
    //val hadist = Hadist()

    routing {
        root()
        getAllHadist(databaseFactory)
        insertHadist(databaseFactory)
        getHadistById(databaseFactory)
        updateHadist(databaseFactory)
    }
}
