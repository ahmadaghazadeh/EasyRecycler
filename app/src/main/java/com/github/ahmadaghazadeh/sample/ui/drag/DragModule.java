package com.github.ahmadaghazadeh.sample.ui.drag;

import android.arch.lifecycle.ViewModelProvider;

import com.github.ahmadaghazadeh.sample.base.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class DragModule {

    @Provides
    ViewModelProvider.Factory getFactory(DragViewModel model){
        return new ViewModelProviderFactory<>(model);
    }

}

