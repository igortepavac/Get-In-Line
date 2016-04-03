package com.feelsgoodman.getinline.dagger.modules;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by noxqs on 03.04.16..
 */
@Module
public class ClientModule {

    @Provides
    @Singleton
    public OkHttpClient provideClient() {
        OkHttpClient client = new OkHttpClient();
        //client.interceptors().add(new RequestInterceptor());
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        client.interceptors().add(interceptor);
        client.setReadTimeout(250, TimeUnit.SECONDS);
        client.setWriteTimeout(250, TimeUnit.SECONDS);
        client.setConnectTimeout(250, TimeUnit.SECONDS);

        return client;
    }
}
