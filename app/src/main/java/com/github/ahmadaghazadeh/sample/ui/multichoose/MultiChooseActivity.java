package com.github.ahmadaghazadeh.sample.ui.multichoose;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;

import com.github.ahmadaghazadeh.easyrecycler.EasyAdapter;
import com.github.ahmadaghazadeh.sample.BR;
import com.github.ahmadaghazadeh.sample.R;
import com.github.ahmadaghazadeh.sample.base.activity.BaseActivity;
import com.github.ahmadaghazadeh.sample.databinding.ActivityMultiChooseBinding;

import javax.inject.Inject;


public class MultiChooseActivity extends BaseActivity<ActivityMultiChooseBinding, MultiChooseViewModel>
        implements IMultiChooseNavigator {

    EasyAdapter easyAdapter;
    @Inject
    ViewModelProvider.Factory factory;

    @Override
    public MultiChooseViewModel getViewModel() {
        return ViewModelProviders.of(this, factory).get(MultiChooseViewModel.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_multi_choose;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel.setNavigator(this);
        mViewModel.init();
    }




}
