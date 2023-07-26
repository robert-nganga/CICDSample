package com.example.myapplication

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class AgeViewModel : ViewModel() {

    var age by mutableStateOf("")
        private set

    fun getAge(yob: Int) {
        age = (2023 - yob).toString()
    }
}