package com.github.ahmadaghazadeh.sample.ui.various;

import android.arch.lifecycle.ViewModelProvider;

import com.github.ahmadaghazadeh.sample.base.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class VariousModule {

    @Provides
    ViewModelProvider.Factory getFactory(VariousViewModel model){
        return new ViewModelProviderFactory<>(model);
    }

}

