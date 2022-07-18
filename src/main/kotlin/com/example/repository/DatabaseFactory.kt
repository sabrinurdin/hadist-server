package com.example.repository

import com.example.model.Comment
import com.example.model.Hadist
import org.litote.kmongo.*
import org.litote.kmongo.coroutine.CoroutineCollection
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.coroutine.insertOne
import org.litote.kmongo.reactivestreams.KMongo
import org.litote.kmongo.util.idValue


class DatabaseFactory {

    private val client = KMongo.createClient().coroutine
    private val database = client.getDatabase("hadist")
    val userCollection: CoroutineCollection<Hadist> = database.getCollection()
    val commentCollection: CoroutineCollection<Comment> = database.getCollection()


    suspend fun addUser(users: Hadist): Hadist {
        userCollection.insertOne(users)
        return users
    }

//    suspend fun addCommentUser(users: Hadist): Hadist {
//        userCollection.insertOne(users.komentar)
//        return users
//    }

    suspend fun addUComment(comment: Comment): Comment {
        commentCollection.insertOne(comment)
        return comment
    }


    suspend fun getAllUsers(): List<Hadist> = userCollection.find().toList()
    suspend fun getAllComment(): List<Comment> = commentCollection.find().toList()
    suspend fun getHadistById(id_hadist: String): List<Hadist> =
        userCollection.find(Hadist::id_hadis eq id_hadist).toList()

    //suspend fun addHadistById(hadist: Comment):Boolean = userCollection.insertOne(Hadist::id_hadis eq hadist.id_hadis,hadist)
    suspend fun deleteHadistById(id_hadist: String): Boolean =
        userCollection.deleteOne(Hadist::id_hadis eq id_hadist).wasAcknowledged()

    suspend fun updateHadistById(hadist: Hadist): Boolean =
        userCollection.updateOne(Hadist::id_hadis eq hadist.id_hadis, hadist)
//        setValue(
//            Hadist::riwayat, riwayat,
//            Hadist::riwayat, riwayat,
//        )
            .wasAcknowledged()

    suspend fun updateKomentarById(hadist: Hadist):Boolean = userCollection.updateMany(filter = Hadist::id_hadis `in` hadist.id_hadis ,
        update = setValue(
            property = Hadist::komentar.allPosOp / Comment::id_hadis,
            value = "${hadist.komentar}"
        )
    ).wasAcknowledged()
}
