package com.github.satoshun.example.sample.module

import androidx.lifecycle.LiveData

class ViewModelLiveData3<T> : LiveData<T>() {
  internal fun internalPostValue(value: T) {
    postValue(value)
  }

  internal fun internalSetValue(v: T) {
    value = v
  }
}
