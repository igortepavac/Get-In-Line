package com.feelsgoodman.getinline.network;

import com.feelsgoodman.getinline.GetInLineApp;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import android.preference.PreferenceManager;

import java.io.IOException;

/**
 * Created by noxqs on 04.04.16..
 */
public class RequestInterceptor implements Interceptor {

    //TODO modify this shizzle, PRONTO
    public static final String LOGIN_URL = "something";

    public static final String TOKEN = "token";

    public static final String SHARED_PREFS_TOKEN = "TOKEN";

    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        Request changedRequest;

        String token = PreferenceManager.getDefaultSharedPreferences(GetInLineApp.getInstance()).getString(SHARED_PREFS_TOKEN, "");

        if (!originalRequest.uri().getPath().equals(LOGIN_URL)) {
            Request.Builder builder = originalRequest.newBuilder();
            HttpUrl changedUrl = originalRequest.httpUrl().newBuilder()
                    .addQueryParameter(TOKEN, token)
                    .build();

            builder.url(changedUrl.toString());
            changedRequest = builder.build();

            return chain.proceed(changedRequest);
        }

        return chain.proceed(originalRequest);
    }

}
