package com.github.satoshun.example.sample.viewmodel

abstract class ViewModel1 {
  protected fun <T> ViewModelLiveData1<T>.setValue(value: T) {
    this.value = value
  }

  protected fun <T> ViewModelLiveData1<T>.postValue(value: T) {
    postValue(value)
  }
}

fun <T> viewModelLiveData1(): ViewModelLiveData1<T> {
  return ViewModelLiveData1()
}
