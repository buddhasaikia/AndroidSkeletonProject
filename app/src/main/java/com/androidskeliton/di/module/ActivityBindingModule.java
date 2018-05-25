package com.androidskeliton.di.module;


import com.androidskeliton.di.scope.PerActivity;
import com.androidskeliton.module.main.MainActivity;
import com.androidskeliton.module.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivity();
}
