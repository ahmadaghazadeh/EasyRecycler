package com.github.ahmadaghazadeh.sample.ui.onechoose;

import android.arch.lifecycle.MutableLiveData;

import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerView;
import com.github.ahmadaghazadeh.sample.base.BaseViewModel;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;


public class OneChooseViewModel extends BaseViewModel<IOneChooseNavigator>  {

    public MutableLiveData<List<BaseRecyclerView>> list = new MutableLiveData<>();

    @Inject
    public OneChooseViewModel() {
    }

    public void init() {
        list = new MutableLiveData<>();
        List<BaseRecyclerView> tList=new LinkedList<>();
        tList.add(new OneChooseItem( "Item 1"));
        tList.add(new OneChooseItem( "Item 2"));
        tList.add(new OneChooseItem( "Item 3"));
        tList.add(new OneChooseItem( "Item 4"));
        list.setValue(tList);
    }


}
