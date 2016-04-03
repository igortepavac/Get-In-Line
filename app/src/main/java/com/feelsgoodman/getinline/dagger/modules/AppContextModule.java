package com.feelsgoodman.getinline.dagger.modules;

import com.feelsgoodman.getinline.GetInLineApplication;

import android.content.Context;
import android.content.res.Resources;

import dagger.Module;
import dagger.Provides;

/**
 * Created by noxqs on 03.04.16..
 */
@Module
public class AppContextModule {

    @Provides
    public Context provideContext() {
        return GetInLineApplication.getInstance();
    }

    @Provides
    public Resources provideResources(Context context) {
        return context.getResources();
    }
}
