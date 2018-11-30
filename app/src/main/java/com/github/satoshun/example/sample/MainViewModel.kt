package com.github.satoshun.example.sample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MainViewModel {
  private val _userName = MutableLiveData<String>()
  val userName: LiveData<String> = _userName

  fun update() {
    _userName.value = "test"
    _userName.postValue("test2")
  }
}

fun main() {
  val viewModel = MainViewModel()

  // compile error
//  viewModel.userName.postValue("")

  viewModel.update()
  viewModel.userName.observeForever { }
}
