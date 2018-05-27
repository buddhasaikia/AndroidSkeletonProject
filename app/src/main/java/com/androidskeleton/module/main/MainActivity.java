package com.androidskeleton.module.main;


import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.androidskeleton.R;
import com.androidskeleton.module.base.DaggerBaseActivity;
import com.androidskeleton.util.ActivityUtils;

public class MainActivity extends DaggerBaseActivity
        implements MainFragment.OnFragmentInteractionListener {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainFragment mainFragment = MainFragment.newInstance();
        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), mainFragment, R.id.container);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
