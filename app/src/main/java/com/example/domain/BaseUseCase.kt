package com.example.domain

interface BaseUseCase <T>{
    fun execute() : T
}