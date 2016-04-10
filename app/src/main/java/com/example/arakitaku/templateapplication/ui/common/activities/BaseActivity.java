package com.example.arakitaku.templateapplication.ui.common.activities;

import android.support.v7.app.AppCompatActivity;

import com.example.arakitaku.templateapplication.di.ActivityComponent;
import com.example.arakitaku.templateapplication.di.ActivityModule;
import com.example.arakitaku.templateapplication.ui.common.MainApplication;

/**
 * このアプリケーションに属すActivityが基本的に継承するActivity
 */
public class BaseActivity extends AppCompatActivity {

    private ActivityComponent activityComponent;

    public ActivityComponent getComponent() {
        if (activityComponent == null) {
            MainApplication application = (MainApplication) getApplication();
            activityComponent = application.getComponent().plus(new ActivityModule(this));
        }
        return activityComponent;
    }

}
