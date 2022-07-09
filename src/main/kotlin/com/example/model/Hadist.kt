package com.example.model

import org.bson.codecs.pojo.annotations.BsonId

@kotlinx.serialization.Serializable
data class Hadist(
    var id_hadis: String,
    var artinya: String,
    var hadis: String,
    var nomor: String,
    var riwayat: String,
    var komentar: List<Comment> = emptyList()
)