package com.example.domain

import com.example.data.ICounterRepository

class IncrementPeopleCountUseCase(val counterRepository: ICounterRepository) : BaseUseCase<Unit> {

    override fun execute() {
        counterRepository.increment()
    }
}