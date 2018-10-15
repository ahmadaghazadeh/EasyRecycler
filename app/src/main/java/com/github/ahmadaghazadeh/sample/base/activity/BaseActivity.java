package com.github.ahmadaghazadeh.sample.base.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatDelegate;
import android.widget.Toast;

import com.github.ahmadaghazadeh.sample.base.BaseViewModel;

import dagger.android.support.DaggerAppCompatActivity;


public abstract class BaseActivity<T extends ViewDataBinding, V extends BaseViewModel> extends DaggerAppCompatActivity {

    public static final int MULTIPLE_PERMISSIONS = 101;
    public static final String PERMISSION_DIALOG = "PERMISSION_DIALOG";
    public static final String ERROR_DIALOG = "ERROR_DIALOG";

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    protected T mViewDataBinding;
    protected V mViewModel;


    public abstract V getViewModel();

    public abstract int getBindingVariable();

    @LayoutRes
    public abstract int getLayoutId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        performDataBinding();
    }

    public void handleError(Throwable throwable) {
        Toast.makeText(this, throwable.getMessage(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    private void performDataBinding() {
        mViewDataBinding = DataBindingUtil.setContentView(this, getLayoutId());
        this.mViewModel = mViewModel == null ? getViewModel() : mViewModel;
        mViewDataBinding.setVariable(getBindingVariable(), mViewModel);
        mViewDataBinding.setLifecycleOwner(this);

    }


}
