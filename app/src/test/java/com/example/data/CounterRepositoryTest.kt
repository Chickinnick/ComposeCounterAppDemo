package com.example.data

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
        counterRepository = CounterRepository(0, 10)
        counterRepository.increment()
        val peopleAmount = counterRepository.getPeopleAmount()
        assertEquals(peopleAmount, 1)
    }

    @Test
    fun decrement() {
        counterRepository = CounterRepository(2, 10)
        counterRepository.decrement()
        val peopleAmount = counterRepository.getPeopleAmount()
        assertEquals(peopleAmount, 1)
    }


    @Test(expected = MaxPeopleReachedException::class)
    fun maxAmountTest() {
        counterRepository = CounterRepository(10, 10)
        counterRepository.increment()
    }
}