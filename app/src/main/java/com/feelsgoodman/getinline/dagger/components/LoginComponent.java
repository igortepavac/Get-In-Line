package com.feelsgoodman.getinline.dagger.components;

import com.feelsgoodman.getinline.dagger.modules.LoginModule;
import com.feelsgoodman.getinline.dagger.modules.NetworkModule;

import dagger.Component;

/**
 * Created by noxqs on 03.04.16..
 */
@Component(modules = {
        LoginModule.class,
        NetworkModule.class
})
public interface LoginComponent {

}
