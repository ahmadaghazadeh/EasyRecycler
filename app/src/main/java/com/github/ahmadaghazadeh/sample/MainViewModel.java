package com.github.ahmadaghazadeh.sample;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public MutableLiveData<String> code = new MutableLiveData<>();
}
