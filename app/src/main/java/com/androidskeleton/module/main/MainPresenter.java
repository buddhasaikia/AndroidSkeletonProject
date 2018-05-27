package com.androidskeleton.module.main;

import com.androidskeleton.di.scope.PerActivity;

import javax.inject.Inject;

@PerActivity
public class MainPresenter implements MainContract.Presenter {
    private MainContract.View view;

    @Inject
    public MainPresenter() {
    }

    @Override
    public void sayHello(){
        view.greetings("Hello! I am presenter at your service!");
    }

    @Override
    public void takeView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void dropView() {
        view = null;
    }
}
