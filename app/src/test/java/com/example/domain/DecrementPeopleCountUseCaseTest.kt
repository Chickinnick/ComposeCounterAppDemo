package com.example.domain

import com.example.data.ICounterRepository
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class DecrementPeopleCountUseCaseTest {
    lateinit var decrementPeopleCountUseCase: DecrementPeopleCountUseCase

    @Mock
    lateinit var repository: ICounterRepository

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        decrementPeopleCountUseCase = DecrementPeopleCountUseCase(repository)
    }

    @Test
    fun execute() {
        decrementPeopleCountUseCase.execute()
        Mockito.verify(repository, Mockito.times(1)).decrement()
    }


}