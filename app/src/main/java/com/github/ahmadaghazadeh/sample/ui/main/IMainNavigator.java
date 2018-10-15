package com.github.ahmadaghazadeh.sample.ui.main;


import com.github.ahmadaghazadeh.sample.base.activity.IActivityNavigator;

public interface IMainNavigator extends IActivityNavigator {
     void navigateTo(Class<?> cls);
}
