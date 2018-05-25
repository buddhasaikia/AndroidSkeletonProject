package com.androidskeleton.module.main;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.androidskeleton.R;
import com.androidskeleton.module.base.DaggerBaseActivity;

public class MainActivity extends DaggerBaseActivity{


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
