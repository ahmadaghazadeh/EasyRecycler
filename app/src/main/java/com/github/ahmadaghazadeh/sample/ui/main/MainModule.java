package com.github.ahmadaghazadeh.sample.ui.main;

import android.arch.lifecycle.ViewModelProvider;

import com.github.ahmadaghazadeh.sample.base.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    ViewModelProvider.Factory getFactory(MainViewModel model){
        return new ViewModelProviderFactory<>(model);
    }

}

