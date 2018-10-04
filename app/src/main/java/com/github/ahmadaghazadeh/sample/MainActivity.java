package com.github.ahmadaghazadeh.sample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.ahmadaghazadeh.easyrecycler.EasyAdapter;
import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerModel;
import com.github.ahmadaghazadeh.easyrecycler.EmptyViewModel;
import com.github.ahmadaghazadeh.sample.databinding.ActivityMainBinding;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mViewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        EasyAdapter<BaseRecyclerModel> adapter=new EasyAdapter<>();
        List<BaseRecyclerModel> lst=new LinkedList<>();
        lst.add(new ImageItem(1));
        lst.add(new TextItem("Ahmad"));
        lst.add(new ImageItem(2));
        lst.add(new TextItem("Aghazadeh"));
        adapter.init(lst);
        adapter.setEmptyItemViewModelListener(new EmptyViewModel.EmptyItemViewModelListener() {
            @Override
            public void onRetryClick() {
                Toast.makeText(MainActivity.this,"onRetryClick",Toast.LENGTH_LONG).show();
            }
        });
        mViewDataBinding.recycler.setAdapter(adapter);
    }
}
