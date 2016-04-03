package com.feelsgoodman.getinline.activities;

import com.feelsgoodman.getinline.R;

import android.os.Bundle;
import android.view.Menu;

import butterknife.ButterKnife;

/**
 * Created by itepavac on 03/04/16.
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        // TODO: refactor
        getSupportActionBar().setTitle("Lobbies near you");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
