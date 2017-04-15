package com.example.hapzhu.andrioddemotest;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Created by hapzhu on 2017/4/7.
 *
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
