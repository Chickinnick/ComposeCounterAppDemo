package com.example.domain

import com.example.data.ICounterRepository

class DecrementPeopleCountUseCase(val counterRepository: ICounterRepository) : BaseUseCase<Unit> {

    override fun execute() {
        counterRepository.decrement()
    }
}