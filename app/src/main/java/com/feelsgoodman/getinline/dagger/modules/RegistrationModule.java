package com.feelsgoodman.getinline.dagger.modules;

import com.feelsgoodman.getinline.mvp.interactor.RegisterInteractor;
import com.feelsgoodman.getinline.mvp.interactor.impl.RegisterInteractorImpl;
import com.feelsgoodman.getinline.mvp.presenter.RegisterPresenter;
import com.feelsgoodman.getinline.mvp.presenter.impl.RegisterPresenterImpl;
import com.feelsgoodman.getinline.mvp.view.RegisterView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by noxqs on 04.04.16..
 */
@Module
public class RegistrationModule {

    private RegisterView view;

    public RegistrationModule(RegisterView view) {
        this.view = view;
    }

    @Provides
    public RegisterView provideView() {
        return view;
    }

    @Provides
    public RegisterPresenter providePresenter(RegisterPresenterImpl impl) {
        return impl;
    }

    @Provides
    public RegisterInteractor provideInteractor(RegisterInteractorImpl impl) {
        return impl;
    }
}
