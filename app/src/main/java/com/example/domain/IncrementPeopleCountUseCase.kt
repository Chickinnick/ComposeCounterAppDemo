package com.example.domain

import com.example.data.ICounterRepository
import javax.inject.Inject

class IncrementPeopleCountUseCase @Inject constructor(val counterRepository: ICounterRepository) : BaseUseCase<Unit> {

    override fun execute() {
        counterRepository.increment()
    }
}