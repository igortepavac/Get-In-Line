package com.feelsgoodman.getinline;

import com.feelsgoodman.getinline.dagger.components.DaggerAppComponent;
import com.feelsgoodman.getinline.network.ApiService;

import android.app.Application;

import javax.inject.Inject;

/**
 * Created by itepavac on 03/04/16.
 */
public class GetInLineApplication extends Application {

    protected static GetInLineApplication instance;

    @Inject
    ApiService apiService;

    public static GetInLineApplication getInstance() {
        return instance;
    }

    public static void setInstance(GetInLineApplication instance) {
        GetInLineApplication.instance = instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setInstance(this);

        DaggerAppComponent.create().inject(this);
    }

    public ApiService getApiService() {
        return apiService;
    }
}