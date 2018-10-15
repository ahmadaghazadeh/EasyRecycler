package com.github.ahmadaghazadeh.sample.ui.multichoose;

import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerView;
import com.github.ahmadaghazadeh.sample.BR;
import com.github.ahmadaghazadeh.sample.R;

public class MultiChooseItem extends BaseRecyclerView {

    public String text;

    public MultiChooseItem(String text) {
        this.text = text;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_multi_choose;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    public void onClick(){
        super.onClick();
    }


}
