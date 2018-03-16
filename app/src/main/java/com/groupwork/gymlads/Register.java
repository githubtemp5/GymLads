package com.groupwork.gymlads;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Patterns;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A register screen that allows the user to create a account
 */
public class Register extends AppCompatActivity {
    private EditText et_name, et_email, et_username, et_password, et_cpassword;
    private String name, email, username, password, cpassword;
    public static ArrayList<String> usernames = new ArrayList<String>();
    public static ArrayList<String> passwords = new ArrayList<String>();
    Button regButton;
    Button cancelButton;
    CheckBox termsCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et_name = (EditText) findViewById(R.id.name);
        et_email = (EditText) findViewById(R.id.email);
        et_username = (EditText) findViewById(R.id.username);
        et_password = (EditText) findViewById(R.id.password);
        et_cpassword = (EditText) findViewById(R.id.cpassword);
        termsCheckBox = (CheckBox) findViewById(R.id.termsCheckBox);
//runs the cancel function when button is clicked
        cancelButton = (Button) findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                cancel();
        }
        });
//runs the register function when button is clicked
        regButton = (Button) findViewById(R.id.regButton);
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }

    });}

    /**
 * This function displays a error message if the user inputs fail to validate. If it validates it runs the signup sucess function.
 */
    public void register() {
        initialise();
        if (!validate()) {
            Toast.makeText(this, "Account registration has failed", Toast.LENGTH_SHORT).show();
        } else {
            onSignupSuccess();
        }
    }

    /**
 * A function which changes the activity to the home screen when the button is pressed
 */
    public void cancel(){
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
/**
 * Checks the username doesn't already exist. If both the username and password are valid they are added to storage arrays.
 */
    public void onSignupSuccess() {
        if(usernames.contains(Register.this.et_username.getText().toString())){
            et_username.setError("This username already exists");

        }
        else {
            usernames.add(Register.this.et_username.getText().toString());
            System.out.println(usernames.get(0));
            passwordArray();
            //clears fields once username and password are stored in the array.
            et_username.setText(null);
            et_password.setText(null);
            et_name.setText(null);
            et_email.setText(null);
            et_cpassword.setText(null);
            termsCheckBox.setChecked(false);
            //swaps the activity to the main menu
            Intent intent = new Intent(this, MainMenu.class);
            startActivity(intent);
        }

    }
/**
 * Adds valid password to array
 */
    public void passwordArray(){
        passwords.add(Register.this.et_password.getText().toString());
        System.out.println(passwords.get(0));
    }
/**
 * Checks fields are not left empty and they dont exceed the maximum specified length
 */
    public boolean validate() {
        boolean valid = true;
        if (name.isEmpty() || name.length() > 32) {
            et_name.setError("Please enter a valid name");
            valid = false;
        }
        //checks email address is formatted correctly
        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            et_email.setError("Please enter a valid email address");
            valid = false;
        }
        //checks username does not exceed maximumm length
        if (username.isEmpty() || username.length() > 20) {
            et_username.setError("Please enter a valid username");
            valid = false;
        }

        if (password.isEmpty() || password.length() > 20) {
            et_password.setError("Please enter a valid password");
            valid = false;
        }
        //checks cpassword is the same as the original password entered
        if (cpassword.isEmpty() || cpassword.length() > 20 || !cpassword.equals(password)) {
            et_cpassword.setError("Please enter a valid Password");
            valid = false;
        }
        //checks terms and conditions box is checked and displays error mesage if not
        if (!termsCheckBox.isChecked()) {
            termsCheckBox.setError("Please accept the terms and conditions");
            valid = false;
        }
        return valid;
    }

//puts inputs into a useable format
    public void initialise(){
        name = et_name.getText().toString().trim();
        email = et_email.getText().toString().trim();
        username = et_username.getText().toString().trim();
        password = et_password.getText().toString().trim();
        cpassword = et_cpassword.getText().toString().trim();
    }
}

