package com.github.ahmadaghazadeh.sample.ui.onechoose;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;

import com.github.ahmadaghazadeh.easyrecycler.EasyAdapter;
import com.github.ahmadaghazadeh.sample.BR;
import com.github.ahmadaghazadeh.sample.R;
import com.github.ahmadaghazadeh.sample.base.activity.BaseActivity;
import com.github.ahmadaghazadeh.sample.databinding.ActivityOneChooseBinding;

import javax.inject.Inject;


public class OneChooseActivity extends BaseActivity<ActivityOneChooseBinding, OneChooseViewModel>
        implements IOneChooseNavigator {

    EasyAdapter easyAdapter;
    @Inject
    ViewModelProvider.Factory factory;

    @Override
    public OneChooseViewModel getViewModel() {
        return ViewModelProviders.of(this, factory).get(OneChooseViewModel.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_one_choose;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel.setNavigator(this);
        mViewModel.init();
    }




}
