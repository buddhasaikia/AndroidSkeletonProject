package com.androidskeleton.di.module;


import com.androidskeleton.di.scope.PerActivity;
import com.androidskeleton.module.main.MainActivity;
import com.androidskeleton.module.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivity();
}
