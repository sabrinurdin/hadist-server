package com.example.di

import com.example.repository.HadistRepository
import com.example.repository.HadistRepositoryImp
import org.koin.dsl.module

val koinModule = module {
    single<HadistRepository> {
        HadistRepositoryImp()
    }
}