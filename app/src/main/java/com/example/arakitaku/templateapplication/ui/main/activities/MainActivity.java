package com.example.arakitaku.templateapplication.ui.main.activities;

import android.os.Bundle;
import android.util.Log;

import com.example.arakitaku.templateapplication.R;
import com.example.arakitaku.templateapplication.models.MyModel;
import com.example.arakitaku.templateapplication.ui.common.activities.BaseActivity;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends BaseActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    MyModel myModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getComponent().inject(this);

        myModel.search("DependenciesVersionChecker")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(repositories -> {
                    Log.d(TAG, repositories.toString());
                }, throwable -> {
                    Log.e(TAG, "Search Error", throwable);
                });
    }
}
