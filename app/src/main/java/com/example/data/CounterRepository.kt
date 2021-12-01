package com.example.data

class CounterRepository(var amountOfPeople: Int = 0,
                        val maxPeopleValue : Int = Int.MAX_VALUE) : ICounterRepository {

    override fun increment() {
        if (amountOfPeople < maxPeopleValue) {
            amountOfPeople = amountOfPeople.inc()
        } else {
            throw MaxPeopleReachedException()
        }
    }

    override fun decrement() {
        amountOfPeople = amountOfPeople.dec()
    }

    override fun getPeopleAmount(): Int {
        return amountOfPeople
    }
}

class MaxPeopleReachedException : Exception()