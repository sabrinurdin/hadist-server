package com.example.repository

import com.example.model.Hadist

interface HadistRepository {
    val hadist: List<Hadist>
    suspend fun getAllHadist(): List<Hadist>
}