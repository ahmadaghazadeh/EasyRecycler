package com.github.ahmadaghazadeh.sample.ui.onechoose;

import android.arch.lifecycle.ViewModelProvider;

import com.github.ahmadaghazadeh.sample.base.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class OneChooseModule {

    @Provides
    ViewModelProvider.Factory getFactory(OneChooseViewModel model){
        return new ViewModelProviderFactory<>(model);
    }

}

