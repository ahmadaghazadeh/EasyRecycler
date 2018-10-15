package com.github.ahmadaghazadeh.sample.ui.drag;

import android.arch.lifecycle.MutableLiveData;

import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerView;
import com.github.ahmadaghazadeh.sample.R;
import com.github.ahmadaghazadeh.sample.base.BaseViewModel;
import com.github.ahmadaghazadeh.sample.ui.various.VariousActivity;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;


public class DragViewModel extends BaseViewModel<IDragNavigator>  {

    public MutableLiveData<List<BaseRecyclerView>> list = new MutableLiveData<>();

    @Inject
    public DragViewModel() {
    }

    public void init() {
        list = new MutableLiveData<>();
        List<BaseRecyclerView> tList=new LinkedList<>();
        tList.add(new DragItem( "Item 1"));
        tList.add(new DragItem( "Item 2"));
        tList.add(new DragItem( "Item 3"));
        tList.add(new DragItem( "Item 4"));
        //list.setValue(tList);
        getNavigator().initItems(tList);
    }


}
