package com.github.ahmadaghazadeh.easyrecycler;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.LinkedList;
import java.util.List;


public class EasyAdapter<T extends BaseRecyclerModel> extends RecyclerView.Adapter<EasyAdapter.ViewHolder> {

    private List<T> list;
    private EmptyViewModel.EmptyItemViewModelListener emptyItemViewModelListener;

    public EasyAdapter() {
        this.list = new LinkedList<>();
    }

    public EasyAdapter(List<T> list) {
        this.list = list;
        notifyDataSetChanged();

    }

    public void setEmptyItemViewModelListener(EmptyViewModel.EmptyItemViewModelListener emptyItemViewModelListener) {
        this.emptyItemViewModelListener = emptyItemViewModelListener;
    }

    public void init(List<T> list1) {
        this.list = list1;
        notifyDataSetChanged();
    }

    public void insertList(List<T> list1) {
        this.list.addAll(0, list1);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (list.isEmpty()) {
            return EmptyViewModel.layoutId;
        } else {
            return list.get(position).getLayoutId();
        }
    }

    @Override
    public int getItemCount() {
        if (list.size() == 0)
            return 1;
        else return list.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        try {
            ViewDataBinding bind = DataBindingUtil.bind(LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false));
            return new ViewHolder<>(bind);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (list.size() != 0) {
            final T model = list.get(position);
            holder.getBinding().setVariable(BR.viewModel, model);
        } else {
            EmptyViewModel emptyViewModel = new EmptyViewModel(emptyItemViewModelListener);
            holder.getBinding().setVariable(BR.viewModel, emptyViewModel);
        }
        holder.getBinding().executePendingBindings();
    }

    public static class ViewHolder<V extends ViewDataBinding> extends RecyclerView.ViewHolder {
        private V v;

        ViewHolder(V v) {
            super(v.getRoot());
            this.v = v;
        }

        public V getBinding() {
            return v;
        }
    }

}