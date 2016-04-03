package com.feelsgoodman.getinline.activities;

import com.easyandroidanimations.library.Animation;
import com.easyandroidanimations.library.SlideInUnderneathAnimation;
import com.feelsgoodman.getinline.R;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {

    @Bind(R.id.splash_app_name)
    TextView splashAppName;

    private static final int SPLASH_DURATION = 2500; // millis

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

        Typeface tFace = Typeface.createFromAsset(getAssets(), "fonts/LobsterTwo.otf");
        splashAppName.setTypeface(tFace);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                new SlideInUnderneathAnimation(splashAppName)
                        .setDirection(Animation.DIRECTION_DOWN)
                        .setDuration(1500)
                        .animate();
            }
        }, 500);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                goToLoginScreen();
            }
        }, SPLASH_DURATION);
    }

    private void goToLoginScreen() {
        finish();
        startActivity(new Intent(this, LoginActivity.class));
    }
}
