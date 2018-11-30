package com.github.satoshun.example.sample.module

abstract class ViewModel2 {
  protected fun <T> ViewModelLiveData2<T>.postValue(value: T) {
    postValue(value)
  }

  protected fun <T> ViewModelLiveData2<T>.setValue(value: T) {
    setValue(value)
  }
}

fun <T> viewModelLiveData2(): ViewModelLiveData2<T> {
  return ViewModelLiveData2()
}
