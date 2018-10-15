package com.github.ahmadaghazadeh.sample.di;

import com.github.ahmadaghazadeh.sample.ui.drag.DragActivity;
import com.github.ahmadaghazadeh.sample.ui.drag.DragModule;
import com.github.ahmadaghazadeh.sample.ui.main.MainActivity;
import com.github.ahmadaghazadeh.sample.ui.main.MainModule;
import com.github.ahmadaghazadeh.sample.ui.multichoose.MultiChooseActivity;
import com.github.ahmadaghazadeh.sample.ui.multichoose.MultiChooseModule;
import com.github.ahmadaghazadeh.sample.ui.onechoose.OneChooseActivity;
import com.github.ahmadaghazadeh.sample.ui.onechoose.OneChooseModule;
import com.github.ahmadaghazadeh.sample.ui.various.VariousActivity;
import com.github.ahmadaghazadeh.sample.ui.various.VariousModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity bindMain2Activity();

    @ContributesAndroidInjector(modules = VariousModule.class)
    abstract VariousActivity bindVariousActivity();

    @ContributesAndroidInjector(modules = DragModule.class)
    abstract DragActivity bindDragActivity();


    @ContributesAndroidInjector(modules = OneChooseModule.class)
    abstract OneChooseActivity bindOneChooseActivity();

    @ContributesAndroidInjector(modules = MultiChooseModule.class)
    abstract MultiChooseActivity bindMultiChooseActivity();

}
