package com.example.versusscoreapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var counter = MutableLiveData<Int>()
    var counterTwo = MutableLiveData<Int>()

    init {
        counter.value =0
        counterTwo.value = 0
    }
    fun count(){
        counter.value = (counter.value)?.plus(1)
    }
    fun countTwo(){
        counterTwo.value =(counterTwo.value)?.plus(1)
    }
}