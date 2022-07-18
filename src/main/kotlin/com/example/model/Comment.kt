package com.example.model

@kotlinx.serialization.Serializable
data class Comment(
    var id_hadis : String,
    var id_forum : String,
    var nama : String,
    var komentar : String,
    var waktu : String
)
