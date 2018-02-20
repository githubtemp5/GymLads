package com.groupwork.gymlads;

import android.app.Dialog;
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
import android.widget.Button;
import android.widget.EditText;

import java.sql.SQLOutput;

public class ProfileActivity extends AppCompatActivity {  //extends Activity class

    private static final String TAG ="gymladMessage";    //log tag, logs the current
    private EditText fullNameTextBox, emailTextBox, ageTextBox, genderTextBox, weightTextBox, heightTextBox;
    // state of the activity/app.
    //First calls the method called onCreate when you begin the app
    //might also have onDestroy method so when you close the app, it saves the current data, uploads to the database and so on

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        Log.i(ProfileActivity.TAG, "onCreate");

        //Intialising text boxes

        fullNameTextBox = (EditText) findViewById(R.id.fullNameTextBox);

        emailTextBox = (EditText) findViewById(R.id.emailTextBox);

        ageTextBox = (EditText) findViewById(R.id.ageTextBox);

        genderTextBox = (EditText) findViewById(R.id.genderTextBox);

        weightTextBox = (EditText) findViewById(R.id.weightTextBox);

        heightTextBox = (EditText) findViewById(R.id.heightTextBox);


        //Update Details Button
        Button updButton = (Button) findViewById(R.id.updateButton);

        updButton.setOnClickListener(
            new Button.OnClickListener(){
                public void onClick(View v){
        validateDetails();


                }
            }
        );

    }

    public void validateDetails(){
        String fullName = fullNameTextBox.getText().toString();
        String email = emailTextBox.getText().toString();
//        int age = Integer.parseInt(ageTextBox.getText().toString());
        String gender = genderTextBox.getText().toString();
       // int weight = Integer.parseInt(weightTextBox.getText().toString());
       // double height = Double.parseDouble(heightTextBox.getText().toString());

        if(fullName.matches("[aA-zZ]+ ([aA-zZ]+ )*[aA-zZ]+")){
            System.out.println("VALID NAME");
        }

        if(email.matches("[aA0-zZ9.]+@[aA-zZ].[aA-zZ]+(.[aA-zZ]+)*")){
            System.out.println("VALID EMAIL");
        }




    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(ProfileActivity.TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(ProfileActivity.TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(ProfileActivity.TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(ProfileActivity.TAG, "onStop");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(ProfileActivity.TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(ProfileActivity.TAG, "onRestoreInstanceState");
    }

}
