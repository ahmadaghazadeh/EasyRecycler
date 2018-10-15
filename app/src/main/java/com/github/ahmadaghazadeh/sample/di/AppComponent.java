package com.github.ahmadaghazadeh.sample.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityBuilderModule.class
})
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    void inject(BaseApp app);

    @Override
    void inject(DaggerApplication application);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder getApp(Application application);

        AppComponent build();
    }
}
