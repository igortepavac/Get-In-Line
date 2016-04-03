package com.feelsgoodman.getinline.dagger.modules;

import com.feelsgoodman.getinline.GetInLineApplication;
import com.feelsgoodman.getinline.network.ApiService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by noxqs on 03.04.16..
 */
@Module
public class NetworkModule {

    @Provides
    public ApiService provideApiService(){
        return GetInLineApplication.getInstance().getApiService();
    }
}
