package com.feelsgoodman.getinline.activities;

import com.feelsgoodman.getinline.R;
import com.feelsgoodman.getinline.dagger.components.DaggerLoginComponent;
import com.feelsgoodman.getinline.dagger.modules.LoginModule;
import com.feelsgoodman.getinline.mvp.view.LoginView;

import android.content.Intent;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by itepavac on 03/04/16.
 */
public class LoginActivity extends BaseActivity implements LoginView {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        DaggerLoginComponent.builder()
                .loginModule(new LoginModule(this))
                .build()
                .inject(this);
    }

    @OnClick(R.id.btn_login)
    public void loginClicked() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @OnClick(R.id.btn_register)
    public void registerClicked() {
        startActivity(new Intent(this, RegisterActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
