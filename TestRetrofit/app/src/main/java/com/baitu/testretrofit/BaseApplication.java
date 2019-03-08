package com.baitu.testretrofit;

import android.app.Application;

import com.baitu.testretrofit.network.NetWorkManager;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        NetWorkManager.getInstance().init();
    }
}
