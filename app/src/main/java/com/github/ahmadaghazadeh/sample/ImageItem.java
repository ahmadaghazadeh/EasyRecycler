package com.github.ahmadaghazadeh.sample;

import android.support.annotation.DrawableRes;

import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerModel;

public class ImageItem extends BaseRecyclerModel {

    @DrawableRes
    public int ResId;

    public ImageItem(int resId) {
        ResId = resId;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_image;
    }

}
