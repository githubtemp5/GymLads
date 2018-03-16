package com.groupwork.gymlads;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText usernameBox;
    private EditText passwordBox;
    private TextView errorLabel;
//vaidate information of the user for the login 

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton = (Button) findViewById(R.id.signingInButton);
        usernameBox = (EditText) findViewById(R.id.username_text_box);
        passwordBox = (EditText) findViewById(R.id.login_password_box);
        errorLabel = findViewById(R.id.error_Label);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = LoginActivity.this.usernameBox.getText().toString();
                String password = LoginActivity.this.passwordBox.getText().toString();

                for (String user:Register.usernames){
                    if(user.equals(username)){
                        int index = Register.usernames.indexOf(user);
                        if(password.equals(Register.passwords.get(index))){
                            errorLabel.setText("");

                            Intent i = new Intent(getApplicationContext(), com.groupwork.gymlads.MainMenu.class);
                            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(i);
                        }
                        else{
                            errorLabel.setText("Invalid email or password");

                        }
                    }


                }


            }
        });
    }
}
