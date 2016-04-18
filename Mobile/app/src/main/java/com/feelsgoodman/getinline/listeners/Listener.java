package com.feelsgoodman.getinline.listeners;

/**
 * Created by noxqs on 04.04.16..
 */
public interface Listener<Type> {

    void onSuccess(Type type);

    void onFailure(String message);

}
