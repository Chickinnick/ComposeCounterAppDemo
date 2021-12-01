package com.example.domain

import com.example.data.ICounterRepository

class GetPeopleCountUseCase(
    val counterRepository: ICounterRepository
) : BaseUseCase<Int> {

    override fun execute(): Int {
        return counterRepository.getPeopleAmount()
    }
}