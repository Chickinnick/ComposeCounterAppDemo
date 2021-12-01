package com.example.data

class CounterRepository(var amountOfPeople: Int = 0) {

    fun increment() {
        amountOfPeople = amountOfPeople.inc()
    }

    fun decrement() {
        amountOfPeople = amountOfPeople.dec()
    }

    fun getPeopleAmount(): Int {
        return amountOfPeople
    }
}