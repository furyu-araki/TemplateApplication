package com.example.arakitaku.templateapplication.ui.common;

import android.app.Application;

import com.example.arakitaku.templateapplication.di.AppComponent;
import com.example.arakitaku.templateapplication.di.AppModule;
import com.example.arakitaku.templateapplication.di.DaggerAppComponent;

/**
 * このアプリケーション
 */
public class MainApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getComponent() {
        return appComponent;
    }
}
