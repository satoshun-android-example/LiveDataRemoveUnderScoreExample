package com.github.satoshun.example.sample.module

interface ViewModel3 {
  fun <T> ViewModelLiveData3<T>.postValue(value: T) {
    internalPostValue(value)
  }

  fun <T> ViewModelLiveData3<T>.setValue(value: T) {
    internalSetValue(value)
  }
}

fun <T> viewModelLiveData3(): ViewModelLiveData3<T> {
  return ViewModelLiveData3()
}
