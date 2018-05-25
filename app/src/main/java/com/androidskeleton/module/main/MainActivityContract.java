package com.androidskeleton.module.main;


import com.androidskeleton.module.base.BasePresenter;
import com.androidskeleton.module.base.BaseView;

public interface MainActivityContract {
    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter<View> {

    }
}
