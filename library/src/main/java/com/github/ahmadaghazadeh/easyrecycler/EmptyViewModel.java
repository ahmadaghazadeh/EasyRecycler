package com.github.ahmadaghazadeh.easyrecycler;


import com.github.ahmadaghazadeh.easyrecycler.BR;

public class EmptyViewModel extends BaseRecyclerView {

    public static int layoutId = R.layout.item_empty_view;
    private final EmptyItemViewModelListener mListener;

    public EmptyViewModel(EmptyItemViewModelListener mListener) {
           this.mListener = mListener;
    }

    @Override
    public int getLayoutId() {
        return layoutId;
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    public void onRetryClick() {
        if (mListener != null)
            mListener.onRetryClick();
    }

    public interface EmptyItemViewModelListener {
        void onRetryClick();
    }
}
