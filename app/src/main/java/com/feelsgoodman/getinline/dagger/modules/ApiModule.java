package com.feelsgoodman.getinline.dagger.modules;

import com.feelsgoodman.getinline.network.ApiService;
import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by noxqs on 03.04.16..
 */
@Module
public class ApiModule {

    @Provides
    @Singleton
    public ApiService provideApiService(String baseUrl, OkHttpClient okHttpClient) {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create());

        return builder.build().create(ApiService.class);
    }
}
