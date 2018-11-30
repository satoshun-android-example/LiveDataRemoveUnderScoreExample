package com.github.satoshun.example.sample.viewmodel;

import androidx.lifecycle.LiveData;

public class ViewModelLiveData1<T> extends LiveData<T> {
  @Override
  protected void postValue(T value) {
    super.postValue(value);
  }

  @Override
  protected void setValue(T value) {
    super.setValue(value);
  }
}
