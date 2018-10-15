package com.github.ahmadaghazadeh.sample.ui.multichoose;

import android.arch.lifecycle.MutableLiveData;

import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerView;
import com.github.ahmadaghazadeh.sample.base.BaseViewModel;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;


public class MultiChooseViewModel extends BaseViewModel<IMultiChooseNavigator>  {

    public MutableLiveData<List<BaseRecyclerView>> list = new MutableLiveData<>();

    @Inject
    public MultiChooseViewModel() {
    }

    public void init() {
        list = new MutableLiveData<>();
        List<BaseRecyclerView> tList=new LinkedList<>();
        tList.add(new MultiChooseItem( "Item 1"));
        tList.add(new MultiChooseItem( "Item 2"));
        tList.add(new MultiChooseItem( "Item 3"));
        tList.add(new MultiChooseItem( "Item 4"));
        list.setValue(tList);
    }


}
