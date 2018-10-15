package com.github.ahmadaghazadeh.sample.base;

import android.arch.lifecycle.ViewModel;

import java.lang.ref.WeakReference;


public abstract class BaseViewModel<N extends INavigator> extends ViewModel {

    private WeakReference<N> mNavigator;

    public N getNavigator() {
        return mNavigator.get();
    }

    public void setNavigator(N navigator) {
        this.mNavigator = new WeakReference<>(navigator);
    }

}
