package com.androidskeliton.module.main;


import com.androidskeliton.module.base.BasePresenter;
import com.androidskeliton.module.base.BaseView;

public interface MainActivityContract {
    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter<View> {

    }
}
