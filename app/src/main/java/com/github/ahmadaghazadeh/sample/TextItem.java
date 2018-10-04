package com.github.ahmadaghazadeh.sample;

import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerModel;

public class TextItem extends BaseRecyclerModel {
    public TextItem(String text) {
        this.text = text;
    }

    public String text;
    @Override
    public int getLayoutId() {
        return R.layout.item_text;
    }

}
