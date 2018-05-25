package com.androidskeleton.module.main;

import com.androidskeleton.di.scope.PerActivity;

import javax.inject.Inject;

@PerActivity
public class MainActivityPresenter implements MainActivityContract.Presenter {
    private MainActivityContract.View view;

    @Inject
    public MainActivityPresenter() {
    }

    @Override
    public void takeView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void dropView() {
        view = null;
    }
}
