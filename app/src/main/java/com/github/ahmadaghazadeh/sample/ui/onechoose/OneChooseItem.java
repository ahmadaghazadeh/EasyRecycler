package com.github.ahmadaghazadeh.sample.ui.onechoose;

import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerView;
import com.github.ahmadaghazadeh.sample.BR;
import com.github.ahmadaghazadeh.sample.R;

public class OneChooseItem extends BaseRecyclerView {

    public String text;

    public OneChooseItem(String text) {
        this.text = text;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_one_choose;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    public void onClick(){
        super.onClick();
    }


}
