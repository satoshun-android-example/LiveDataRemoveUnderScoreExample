package com.github.satoshun.example.sample.module

interface ViewModel2 {
  fun <T> ViewModelLiveData2<T>.postValue(value: T) {
    postValue(value)
  }

  fun <T> ViewModelLiveData2<T>.setValue(value: T) {
    setValue(value)
  }
}

fun <T> viewModelLiveData2(): ViewModelLiveData2<T> {
  return ViewModelLiveData2()
}
