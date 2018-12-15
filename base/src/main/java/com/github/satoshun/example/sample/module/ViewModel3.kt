package com.github.satoshun.example.sample.module

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer

abstract class ViewModel3 {
  protected fun <T> ViewModelLiveData3<T>.postValue(value: T) {
    internalPostValue(value)
  }

  protected fun <T> ViewModelLiveData3<T>.setValue(value: T) {
    internalSetValue(value)
  }
}

fun <T> ViewModelLiveData3<Event<T>>.observe(owner: LifecycleOwner, block: ((T) -> Unit)) {
  observe(owner, Observer {
    it.onNotHandled(block)
  })
}

fun <T> viewModelLiveData3(): ViewModelLiveData3<T> {
  return ViewModelLiveData3()
}
