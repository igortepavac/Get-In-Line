package com.feelsgoodman.getinline.dagger.modules;

import com.feelsgoodman.getinline.mvp.interactor.LoginInteractor;
import com.feelsgoodman.getinline.mvp.interactor.impl.LoginInteractorImpl;
import com.feelsgoodman.getinline.mvp.presenter.LoginPresenter;
import com.feelsgoodman.getinline.mvp.presenter.impl.LoginPresenterImpl;
import com.feelsgoodman.getinline.mvp.view.LoginView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by noxqs on 03.04.16..
 */
@Module
public class LoginModule {

    private LoginView view;

    public LoginModule(LoginView view) {
        this.view = view;
    }

    @Provides
    public LoginView provideView(){
        return view;
    }

    @Provides
    public LoginPresenter providePresenter(LoginPresenterImpl impl){
        return impl;
    }

    @Provides
    public LoginInteractor provideInteractor(LoginInteractorImpl impl){
        return impl;
    }
}
