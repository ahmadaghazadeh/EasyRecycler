package com.github.ahmadaghazadeh.sample.ui.various;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;

import com.github.ahmadaghazadeh.sample.BR;
import com.github.ahmadaghazadeh.sample.R;
import com.github.ahmadaghazadeh.sample.base.activity.BaseActivity;
import com.github.ahmadaghazadeh.sample.databinding.ActivityVariousBinding;

import javax.inject.Inject;


public class VariousActivity extends BaseActivity<ActivityVariousBinding, VariousViewModel>
        implements IVariousNavigator {

    @Inject
    ViewModelProvider.Factory factory;


    @Override
    public VariousViewModel getViewModel() {
        return ViewModelProviders.of(this, factory).get(VariousViewModel.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_various;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel.setNavigator(this);
        mViewModel.init();
    }


}
