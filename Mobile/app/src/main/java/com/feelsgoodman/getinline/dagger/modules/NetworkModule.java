package com.feelsgoodman.getinline.dagger.modules;

import com.feelsgoodman.getinline.GetInLineApp;
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
        return GetInLineApp.getInstance().getApiService();
    }
}
