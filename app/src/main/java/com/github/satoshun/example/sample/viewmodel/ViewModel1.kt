package com.github.satoshun.example.sample.viewmodel

interface ViewModel1 {
  fun <T> ViewModelLiveData1<T>.setValue(value: T) {
    setValue(value)
  }

  fun <T> ViewModelLiveData1<T>.postValue(value: T) {
    postValue(value)
  }
}

fun <T> viewModelLiveData1(): ViewModelLiveData1<T> {
  return ViewModelLiveData1()
}
