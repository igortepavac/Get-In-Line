package com.feelsgoodman.getinline.activities;

import com.feelsgoodman.getinline.R;
import com.feelsgoodman.getinline.dagger.components.DaggerRegistrationComponent;
import com.feelsgoodman.getinline.dagger.modules.RegistrationModule;
import com.feelsgoodman.getinline.mvp.view.RegisterView;

import android.os.Bundle;

import butterknife.ButterKnife;

public class RegisterActivity extends BaseActivity implements RegisterView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ButterKnife.bind(this);

        DaggerRegistrationComponent.builder()
                .registrationModule(new RegistrationModule(this))
                .build()
                .inject(this);
    }
}
