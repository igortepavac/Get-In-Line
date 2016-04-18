package com.feelsgoodman.getinline.dagger.components;

import com.feelsgoodman.getinline.activities.RegisterActivity;
import com.feelsgoodman.getinline.dagger.modules.NetworkModule;
import com.feelsgoodman.getinline.dagger.modules.RegistrationModule;

import dagger.Component;

/**
 * Created by noxqs on 04.04.16..
 */
@Component(modules = {
        NetworkModule.class,
        RegistrationModule.class
})
public interface RegistrationComponent {
        void inject(RegisterActivity activity);
}
