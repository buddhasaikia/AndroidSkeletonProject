package com.androidskeleton.module.main;

import com.androidskeleton.di.scope.FragmentScoped;
import com.androidskeleton.di.scope.PerActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityModule {
    @FragmentScoped
    @ContributesAndroidInjector
    abstract MainFragment mainFragment();

    @PerActivity
    @Binds
    abstract MainActivityContract.Presenter mainPresenter(MainActivityPresenter presenter);
}
