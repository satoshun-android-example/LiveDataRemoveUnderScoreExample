package com.github.satoshun.example.sample.module

abstract class ViewModel3 {
  protected fun <T> ViewModelLiveData3<T>.postValue(value: T) {
    internalPostValue(value)
  }

  protected fun <T> ViewModelLiveData3<T>.setValue(value: T) {
    internalSetValue(value)
  }
}

fun <T> viewModelLiveData3(): ViewModelLiveData3<T> {
  return ViewModelLiveData3()
}
