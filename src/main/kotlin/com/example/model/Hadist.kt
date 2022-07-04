package com.example.model

@kotlinx.serialization.Serializable
data class Hadist(
    var id_hadis: Int,
    var artinya: String,
    var hadis: String,
    var nomor: String,
    var riwayat: String,
    var komentar: List<Comment> = emptyList()
)