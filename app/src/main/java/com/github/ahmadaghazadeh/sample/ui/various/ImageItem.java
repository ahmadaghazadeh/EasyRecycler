package com.github.ahmadaghazadeh.sample.ui.various;

import android.support.annotation.DrawableRes;

import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerView;
import com.github.ahmadaghazadeh.sample.BR;
import com.github.ahmadaghazadeh.sample.R;

public class ImageItem extends BaseRecyclerView {

    @DrawableRes
    public int ResId;

    public ImageItem(int resId) {
        ResId = resId;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_image;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

}
