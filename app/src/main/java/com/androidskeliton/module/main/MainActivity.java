package com.androidskeliton.module.main;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.androidskeliton.R;
import com.androidskeliton.module.base.DaggerBaseActivity;

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
