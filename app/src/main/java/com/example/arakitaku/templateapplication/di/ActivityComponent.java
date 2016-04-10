package com.example.arakitaku.templateapplication.di;

import com.example.arakitaku.templateapplication.ui.main.activities.MainActivity;

import dagger.Subcomponent;

@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

}
