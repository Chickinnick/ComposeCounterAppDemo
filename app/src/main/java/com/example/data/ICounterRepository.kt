package com.example.data

interface ICounterRepository {
    fun increment()
    fun decrement()
    fun getPeopleAmount(): Int
}