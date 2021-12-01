package com.example.data

class CounterRepository(var amountOfPeople: Int = 0,
                        val maxPeopleValue : Int = Int.MAX_VALUE) {

    fun increment() {
        if (amountOfPeople < maxPeopleValue) {
            amountOfPeople = amountOfPeople.inc()
        } else {
            throw MaxPeopleReachedException()
        }
    }

    fun decrement() {
        amountOfPeople = amountOfPeople.dec()
    }

    fun getPeopleAmount(): Int {
        return amountOfPeople
    }
}

class MaxPeopleReachedException : Exception()