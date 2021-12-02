package com.example.di

import com.example.data.CounterRepository
import com.example.data.ICounterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {
    @Provides
    @Singleton
    fun bindCounterRepository(): ICounterRepository {
        return CounterRepository(0,10)
    }
}