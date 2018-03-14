package com.groupwork.gymlads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    Button registerPageBtn, loginPageBtn, skipBtn;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        registerPageBtn = (Button) findViewById(R.id.registerPageBtn);
        registerPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRegBtnClick();
            }
        });

        loginPageBtn = (Button) findViewById(R.id.loginPageBtn);
        loginPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoginBtnClick();
            }
        });
        skipBtn = (Button) findViewById(R.id.skipBtn);
        skipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSkipBtnClick();
            }
        });
    }

    public void onRegBtnClick() {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
    public void onLoginBtnClick() {
        Intent intent = new Intent(this, Session.class);
        startActivity(intent);
    }
    public void onSkipBtnClick() {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }


}
