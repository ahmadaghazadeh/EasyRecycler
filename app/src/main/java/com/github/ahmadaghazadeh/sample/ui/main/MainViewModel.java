package com.github.ahmadaghazadeh.sample.ui.main;

import android.arch.lifecycle.MutableLiveData;

import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerView;
import com.github.ahmadaghazadeh.sample.R;
import com.github.ahmadaghazadeh.sample.base.BaseViewModel;
import com.github.ahmadaghazadeh.sample.ui.drag.DragActivity;
import com.github.ahmadaghazadeh.sample.ui.multichoose.MultiChooseActivity;
import com.github.ahmadaghazadeh.sample.ui.onechoose.OneChooseActivity;
import com.github.ahmadaghazadeh.sample.ui.various.VariousActivity;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;


public class MainViewModel extends BaseViewModel<IMainNavigator> implements ItemSample.IItemSampleListener {

    public MutableLiveData<List<BaseRecyclerView>> list = new MutableLiveData<>();

    @Inject
    public MainViewModel() {
    }

    public void init() {
        list = new MutableLiveData<>();
        List<BaseRecyclerView> tList=new LinkedList<>();
        tList.add(new ItemSample(R.drawable.ic_various, VariousActivity.class, "Various Item", this));
        tList.add(new ItemSample(R.drawable.ic_drag_drop, DragActivity.class, "Drag And Drop Item", this));
        tList.add(new ItemSample(R.drawable.ic_one_choose, OneChooseActivity.class, "One Choose Item", this));
        tList.add(new ItemSample(R.drawable.ic_multi_choose, MultiChooseActivity.class, "Multi Choose Item", this));
        list.setValue(tList);
    }

    @Override
    public void onClick(ItemSample itemSample) {
        getNavigator().navigateTo(itemSample.cls);
    }
}
