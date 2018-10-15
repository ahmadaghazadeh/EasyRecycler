package com.github.ahmadaghazadeh.sample.ui.drag;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.github.ahmadaghazadeh.easyrecycler.AdapterMode;
import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerView;
import com.github.ahmadaghazadeh.easyrecycler.EasyAdapter;
import com.github.ahmadaghazadeh.easyrecycler.helper.ItemTouchHelperCallback;
import com.github.ahmadaghazadeh.easyrecycler.helper.OnStartDragListener;
import com.github.ahmadaghazadeh.sample.BR;
import com.github.ahmadaghazadeh.sample.R;
import com.github.ahmadaghazadeh.sample.base.activity.BaseActivity;
import com.github.ahmadaghazadeh.sample.databinding.ActivityDragBinding;

import java.util.List;

import javax.inject.Inject;


public class DragActivity extends BaseActivity<ActivityDragBinding, DragViewModel>
        implements IDragNavigator, OnStartDragListener {

    EasyAdapter easyAdapter;
    @Inject
    ViewModelProvider.Factory factory;
    private ItemTouchHelper mItemTouchHelper;

    @Override
    public DragViewModel getViewModel() {
        return ViewModelProviders.of(this, factory).get(DragViewModel.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_drag;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        easyAdapter = new EasyAdapter(AdapterMode.DragDrop);
        mViewModel.setNavigator(this);
        mViewDataBinding.recyclerView.setAdapter(easyAdapter);
        ItemTouchHelper.Callback callback = new ItemTouchHelperCallback(easyAdapter);
        mItemTouchHelper = new ItemTouchHelper(callback);
        mItemTouchHelper.attachToRecyclerView(mViewDataBinding.recyclerView);
        easyAdapter.setDragStartListener(this);
        mViewModel.init();
    }

    @Override
    public void onStartDrag(RecyclerView.ViewHolder viewHolder) {
        mItemTouchHelper.startDrag(viewHolder);
    }

    @Override
    public void initItems(List<BaseRecyclerView> list) {
        easyAdapter.init(list);
    }
}
