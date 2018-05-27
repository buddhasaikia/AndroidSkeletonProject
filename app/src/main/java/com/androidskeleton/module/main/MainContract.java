package com.androidskeleton.module.main;


import com.androidskeleton.module.base.BasePresenter;
import com.androidskeleton.module.base.BaseView;

public interface MainContract {
    interface View extends BaseView<Presenter> {

        void greetings(String message);
    }

    interface Presenter extends BasePresenter<View> {

        void sayHello();
    }
}
