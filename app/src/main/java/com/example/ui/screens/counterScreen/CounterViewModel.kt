package com.example.ui.screens.counterScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.domain.DecrementPeopleCountUseCase
import com.example.domain.GetPeopleCountUseCase
import com.example.domain.IncrementPeopleCountUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CounterViewModel
@Inject constructor(
    private val incrementPeopleCountUseCase: IncrementPeopleCountUseCase,
    private val decrementPeopleCountUseCase: DecrementPeopleCountUseCase,
    private val getPeopleCountUseCase: GetPeopleCountUseCase,
) : ViewModel() {

    val counter: MutableLiveData<Int> = MutableLiveData<Int>(0)

    fun init() {
        val result = getPeopleCountUseCase.execute()
        counter.value = result
    }

    fun increment() {
        try {
            incrementPeopleCountUseCase.execute()
            val result = getPeopleCountUseCase.execute()
            counter.value = result
        } catch (e: Exception) {

        }
    }

    fun decrement() {
        decrementPeopleCountUseCase.execute()
        val result = getPeopleCountUseCase.execute()
        counter.value = result
    }
}