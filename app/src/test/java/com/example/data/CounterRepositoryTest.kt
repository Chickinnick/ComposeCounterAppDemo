package com.example.data

import org.junit.Assert
import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class CounterRepositoryTest {

    lateinit var counterRepository: CounterRepository

    @Before
    fun setUp() {
    }

    @Test
    fun increment() {
        counterRepository = CounterRepository()
        counterRepository.increment()
        val peopleAmount = counterRepository.getPeopleAmount()
        assertEquals(peopleAmount, 1)
    }

    @Test
    fun decrement() {
        counterRepository = CounterRepository(2)
        counterRepository.decrement()
        val peopleAmount = counterRepository.getPeopleAmount()
        assertEquals(peopleAmount, 1)
    }
}