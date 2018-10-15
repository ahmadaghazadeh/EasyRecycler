package com.github.ahmadaghazadeh.sample.ui.drag;

import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerView;
import com.github.ahmadaghazadeh.sample.BR;
import com.github.ahmadaghazadeh.sample.R;

public class DragItem extends BaseRecyclerView {

    public String text;

    public DragItem(String text) {
        this.text = text;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_drag;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

}
