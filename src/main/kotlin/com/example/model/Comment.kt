package com.example.model

@kotlinx.serialization.Serializable
data class Comment(
    var id_hadis : Int,
    var id_forum : Int,
    var nama : String,
    var komentar : String,
    var waktu : String
)
