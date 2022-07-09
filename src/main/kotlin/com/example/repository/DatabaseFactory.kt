package com.example.repository

import com.example.model.Hadist
import org.litote.kmongo.coroutine.CoroutineCollection
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.eq
import org.litote.kmongo.reactivestreams.KMongo
import org.litote.kmongo.setValue


class DatabaseFactory {

    private val client = KMongo.createClient().coroutine
    private val database = client.getDatabase("hadist")
    val userCollection: CoroutineCollection<Hadist> = database.getCollection()


    suspend fun addUser(users: Hadist): Hadist {
        userCollection.insertOne(users)
        return users
    }

    suspend fun getAllUsers():List<Hadist> = userCollection.find().toList()
    suspend fun getHadistById(id_hadist:String):List<Hadist> = userCollection.find(Hadist::id_hadis eq id_hadist).toList()
    suspend fun deleteHadistById(id_hadist: String):Boolean = userCollection.deleteOne(Hadist::id_hadis eq id_hadist).wasAcknowledged()
    suspend fun updateHadistById(hadist: Hadist):Boolean = userCollection.updateOne(Hadist::id_hadis eq hadist.id_hadis,hadist
    )
//        setValue(
//            Hadist::riwayat, riwayat,
//            Hadist::riwayat, riwayat,
//        )
    .wasAcknowledged()

}