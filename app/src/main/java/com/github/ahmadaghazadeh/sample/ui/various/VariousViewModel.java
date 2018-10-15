package com.github.ahmadaghazadeh.sample.ui.various;

import android.arch.lifecycle.MutableLiveData;

import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerView;
import com.github.ahmadaghazadeh.sample.R;
import com.github.ahmadaghazadeh.sample.base.BaseViewModel;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;


public class VariousViewModel extends BaseViewModel<IVariousNavigator>  {

    public MutableLiveData<List<BaseRecyclerView>> list = new MutableLiveData<>();

    @Inject
    public VariousViewModel() {
    }

    public void init() {
        list = new MutableLiveData<>();
        List<BaseRecyclerView> tList=new LinkedList<>();
        tList.add(new TextItem("Ahmad Aghazadeh"));
        tList.add(new TextItem("Arad Aghazadeh"));
        tList.add(new ImageItem(R.drawable.ic_launcher_background));
        tList.add(new ImageItem(R.drawable.ic_launcher_foreground));
        tList.add(new ImageItem(R.drawable.ic_various));
        tList.add(new TextItem("Ahmad Aghazadeh"));
        tList.add(new ImageItem(R.drawable.ic_refresh));
        tList.add(new TextItem("Arad Aghazadeh"));
        list.setValue(tList);
    }


}
