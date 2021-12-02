package com.example.domain

import com.example.data.ICounterRepository
import javax.inject.Inject

class GetPeopleCountUseCase @Inject constructor(
    val counterRepository: ICounterRepository
) : BaseUseCase<Int> {

    override fun execute(): Int {
        return counterRepository.getPeopleAmount()
    }
}