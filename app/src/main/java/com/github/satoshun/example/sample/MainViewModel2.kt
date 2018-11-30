package com.github.satoshun.example.sample

import com.github.satoshun.example.sample.module.ViewModel2
import com.github.satoshun.example.sample.module.viewModelLiveData2

class MainViewModel2 : ViewModel2 {
  val userName = viewModelLiveData2<String>()

  fun test() {
    userName.setValue("test")
    userName.postValue("test2")
  }
}