package com.github.ahmadaghazadeh.easyrecycler;


public class EmptyViewModel extends BaseRecyclerModel {

    public static int layoutId = R.layout.item_empty_view;
    private final EmptyItemViewModelListener mListener;

    public EmptyViewModel(EmptyItemViewModelListener mListener) {
        this.mListener = mListener;
    }

    @Override
    public int getLayoutId() {
        return layoutId;
    }

    public void onRetryClick() {
        if (mListener != null)
            mListener.onRetryClick();
    }

    public interface EmptyItemViewModelListener {

        void onRetryClick();
    }
}
