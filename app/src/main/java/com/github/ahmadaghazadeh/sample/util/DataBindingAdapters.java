package com.github.ahmadaghazadeh.sample.util;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;

import com.github.ahmadaghazadeh.sample.R;

public class DataBindingAdapters {

    @BindingAdapter("android:src")
    public static void setImageUri(ImageView view, String imageUri) {
        if (imageUri == null) {
            view.setImageURI(null);
        } else {
            view.setImageURI(Uri.parse(imageUri));
        }
    }

    @BindingAdapter("android:src")
    public static void setImageUri(ImageView view, Uri imageUri) {
        view.setImageURI(imageUri);
    }

    @BindingAdapter("android:src")
    public static void setImageDrawable(ImageView view, Drawable drawable) {
        view.setImageDrawable(drawable);
    }

    @BindingAdapter("android:src")
    public static void setImageResource(ImageView imageView, int resource){
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            imageView.setImageResource(resource);
        } else {
            imageView.setImageResource(R.drawable.ic_dont_support);
        }

    }

}