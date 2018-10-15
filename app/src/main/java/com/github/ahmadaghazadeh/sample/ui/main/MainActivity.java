package com.github.ahmadaghazadeh.sample.ui.main;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;

import com.github.ahmadaghazadeh.sample.BR;
import com.github.ahmadaghazadeh.sample.R;
import com.github.ahmadaghazadeh.sample.base.activity.BaseActivity;
import com.github.ahmadaghazadeh.sample.databinding.ActivityMainBinding;

import javax.inject.Inject;


public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel>
        implements IMainNavigator {

    @Inject
    ViewModelProvider.Factory factory;


    @Override
    public MainViewModel getViewModel() {
        return ViewModelProviders.of(this, factory).get(MainViewModel.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel.setNavigator(this);
        mViewModel.init();
    }



    @Override
    public void navigateTo(Class<?> cls) {
        Intent intent=new Intent(this,cls);
        startActivity(intent);
    }
}
