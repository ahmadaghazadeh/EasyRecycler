package com.github.ahmadaghazadeh.sample.ui.main;


import android.support.annotation.DrawableRes;

import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerView;
import com.github.ahmadaghazadeh.sample.BR;
import com.github.ahmadaghazadeh.sample.R;

public class ItemSample extends BaseRecyclerView {

    @DrawableRes
    public int drawableId;
    public Class<?> cls;
    public String text;
    public IItemSampleListener itemSampleListener;

    public ItemSample(int drawableId, Class<?> cls, String text, IItemSampleListener itemSampleListener) {
        this.drawableId = drawableId;
        this.cls = cls;
        this.text = text;
        this.itemSampleListener = itemSampleListener;
    }

    public void onClick(){
        if(itemSampleListener!=null){
            itemSampleListener.onClick(this);
        }
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_sample;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    public interface IItemSampleListener{
        void onClick(ItemSample itemSample);
    }
}
