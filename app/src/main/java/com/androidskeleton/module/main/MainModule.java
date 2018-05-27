package com.androidskeleton.module.main;

import com.androidskeleton.di.scope.FragmentScoped;
import com.androidskeleton.di.scope.PerActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainModule {
    @FragmentScoped
    @ContributesAndroidInjector
    abstract MainFragment mainFragment();

    @PerActivity
    @Binds
    abstract MainContract.Presenter mainPresenter(MainPresenter presenter);
}
