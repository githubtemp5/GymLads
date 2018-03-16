package com.groupwork.gymlads;

import android.app.Activity;//importing the application page 
import android.content.Intent;//importing intent will allow us to switch pages if nessessary 
import android.os.Bundle;//all of the opreating system 
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {// this is the java class which add the functianlity to the start page of the program 
    Button registerPageBtn, loginPageBtn, skipBtn;//which has three once click or tab button 
    @Override

    protected void onCreate(Bundle savedInstanceState) {// this function allow the us to set the home screen when opening the application 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        registerPageBtn = (Button) findViewById(R.id.registerPageBtn);// contstantly checking if the button are click
        registerPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRegBtnClick(); // if it is click on the register page it will take the user to register page 
            }
        });

        loginPageBtn = (Button) findViewById(R.id.loginPageBtn); // login page where it will take the user to login page 
        loginPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoginBtnClick();
            }
        });
        skipBtn = (Button) findViewById(R.id.skipBtn);// skip page allow the user to skip the hassle of entering their detail to use the application 
        skipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSkipBtnClick();
            }
        });
    }
//if the function above get a click and find which is click then the code below will be ran to take to next page 
    public void onRegBtnClick() {
        Intent intent = new Intent(this, Register.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    public void onLoginBtnClick() {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    public void onSkipBtnClick() {
        Intent intent = new Intent(this, MainMenu.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        ProfileActivity.loggedIn = false;
        startActivity(intent);
    }


}
