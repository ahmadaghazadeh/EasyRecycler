package com.github.ahmadaghazadeh.sample.ui.multichoose;

import android.arch.lifecycle.ViewModelProvider;

import com.github.ahmadaghazadeh.sample.base.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class MultiChooseModule {

    @Provides
    ViewModelProvider.Factory getFactory(MultiChooseViewModel model){
        return new ViewModelProviderFactory<>(model);
    }

}

