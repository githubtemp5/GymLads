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


public class Register extends AppCompatActivity {
    private EditText et_name, et_email, et_username, et_password, et_cpassword;
    private String name, email, username, password, cpassword;
    public static ArrayList<String> usernames = new ArrayList<String>();
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
        cancelButton = (Button) findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                cancel();
        }
        });

        regButton = (Button) findViewById(R.id.regButton);
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        
    });}

    public void register() {
        initialise();
        if (!validate()) {
            Toast.makeText(this, "Account registration has failed", Toast.LENGTH_SHORT).show();
        } else {
            onSignupSuccess();
        }
    }

    public void cancel(){
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }

    public void onSignupSuccess() {
        if(usernames.contains(Register.this.et_username.getText().toString())){
            et_username.setError("This username already exists");

        }
        else {
            usernames.add(Register.this.et_username.getText().toString());
            System.out.println(usernames.get(0));
            Intent intent = new Intent(this, MainMenu.class);
            startActivity(intent);
        }

    }

    public boolean validate() {
        boolean valid = true;
        if (name.isEmpty() || name.length() > 32) {
            et_name.setError("Please enter a valid name");
            valid = false;
        }
        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            et_email.setError("Please enter a valid email address");
            valid = false;
        }
        if (username.isEmpty() || username.length() > 20) {
            et_username.setError("Please enter a valid username");
            valid = false;
        }

        if (password.isEmpty() || password.length() > 20) {
            et_password.setError("Please enter a valid password");
            valid = false;
        }
        if (cpassword.isEmpty() || cpassword.length() > 20 || !cpassword.equals(password)) {
            et_cpassword.setError("Please enter a valid Password");
            valid = false;
        }
        if (!termsCheckBox.isChecked()) {
            termsCheckBox.setError("Please accept the terms and conditions");
            valid = false;
        }
        return valid;
    }


    public void initialise(){
        name = et_name.getText().toString().trim();
        email = et_email.getText().toString().trim();
        username = et_username.getText().toString().trim();
        password = et_password.getText().toString().trim();
        cpassword = et_cpassword.getText().toString().trim();
    }
}

