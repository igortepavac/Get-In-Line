package com.feelsgoodman.getinline.dagger.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by noxqs on 03.04.16..
 */
@Module
public class HostModule {

    @Provides
    @Singleton
    public String provideBaseUrl() {
        return "http://thedevspot.xyz:420";
    }

}
