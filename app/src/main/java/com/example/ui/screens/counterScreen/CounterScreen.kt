package com.example.ui.screens.counterScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState

@Composable
fun CounterScreen(counterViewModel: CounterViewModel) {
    val peopleAmount = counterViewModel.counter.observeAsState()
    Column {
        Text(text = "People amount: ${peopleAmount.value}")
        Button(onClick = { counterViewModel.increment() }) {
            Text("Inc")
        }
        Button(onClick = { counterViewModel.decrement() }) {
            Text("Dec")
        }
    }
    LaunchedEffect(key1 = 1, block = {
        counterViewModel.init()
    })
}
