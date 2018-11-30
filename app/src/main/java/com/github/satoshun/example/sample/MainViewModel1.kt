package com.github.satoshun.example.sample

import com.github.satoshun.example.sample.viewmodel.ViewModel1
import com.github.satoshun.example.sample.viewmodel.viewModelLiveData1

class MainViewModel1 : ViewModel1 {
  val userName = viewModelLiveData1<String>()

  fun test() {
    userName.setValue("test")
    userName.postValue("test2")
  }
}
