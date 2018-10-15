package com.github.ahmadaghazadeh.sample.ui.drag;


import com.github.ahmadaghazadeh.easyrecycler.BaseRecyclerView;
import com.github.ahmadaghazadeh.sample.base.activity.IActivityNavigator;

import java.util.List;

public interface IDragNavigator extends IActivityNavigator {
    void initItems(List<BaseRecyclerView> list);
}
