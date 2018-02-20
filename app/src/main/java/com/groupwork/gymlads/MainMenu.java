package com.groupwork.gymlads;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;

public class MainMenu extends AppCompatActivity {  //extends Activity class

    private static final String TAG ="gymladMessage";    //log tag, logs the current state of the activity/app.
    //First calls the method called onCreate when you begin the app
    //might also have onDestroy method so when you close the app, it saves the current data, uploads to the database and so on
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.i(MainMenu.TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MainMenu.TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MainMenu.TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MainMenu.TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MainMenu.TAG, "onStop");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(MainMenu.TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(MainMenu.TAG, "onRestoreInstanceState");
    }

}
