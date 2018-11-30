package com.github.satoshun.example.sample

import com.github.satoshun.example.sample.module.ViewModel3
import com.github.satoshun.example.sample.module.viewModelLiveData3

class MainViewModel3 : ViewModel3 {
  val userName = viewModelLiveData3<String>()

  fun update() {
    userName.setValue("test")
    userName.postValue("test2")
  }
}

fun main3() {
  val viewModel = MainViewModel3()

  // compile error
//  viewModel.userName.setValue("")

  viewModel.update()
  viewModel.userName.observeForever { }
}
