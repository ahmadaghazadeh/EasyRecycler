package com.github.ahmadaghazadeh.sample.ui.various;

import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerView;
import com.github.ahmadaghazadeh.sample.BR;
import com.github.ahmadaghazadeh.sample.R;

public class TextItem extends BaseRecyclerView {
    public TextItem(String text) {
        this.text = text;
    }

    public String text;
    @Override
    public int getLayoutId() {
        return R.layout.item_text;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }
}
