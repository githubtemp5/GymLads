package com.groupwork.gymlads;

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

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static class RegisterGui extends AppCompatActivity {
        private EditText et_name, et_email, et_username, et_password, et_cpassword;
        private String name, email, username, password, cpassword;
        Button regButton;
        CheckBox termsCheckBox;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register_gui2);
            et_name = (EditText) findViewById(R.id.name);
            et_email = (EditText) findViewById(R.id.email);
            et_username = (EditText) findViewById(R.id.username);
            et_password = (EditText) findViewById(R.id.password);
            et_cpassword = (EditText) findViewById(R.id.cpassword);
            termsCheckBox = (CheckBox) findViewById(R.id.termsCheckBox);
            regButton = (Button) findViewById(R.id.regButton);
            regButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    register();
                }
            });
        }

        public void register() {
            initialise();
            if (!validate()) {
                Toast.makeText(this, "Account registration has failed", Toast.LENGTH_SHORT).show();
            } else {
                onSignupSuccess();
            }
        }

        public void onSignupSuccess() {

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
}
