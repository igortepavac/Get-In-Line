package com.feelsgoodman.getinline.dagger.components;

import com.feelsgoodman.getinline.GetInLineApplication;
import com.feelsgoodman.getinline.dagger.modules.ApiModule;
import com.feelsgoodman.getinline.dagger.modules.AppContextModule;
import com.feelsgoodman.getinline.dagger.modules.ClientModule;
import com.feelsgoodman.getinline.dagger.modules.HostModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by noxqs on 03.04.16..
 */
@Component(modules = {
        AppContextModule.class,
        HostModule.class,
        ClientModule.class,
        ApiModule.class,
})
@Singleton

public interface AppComponent {

    void inject(GetInLineApplication app);
}
