package com.groupwork.gymlads;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.VideoView;

public class ProfileActivity extends AppCompatActivity {  //extends Activity class

    private static final String TAG ="gymladMessage";    //log tag, logs the current
    private EditText fullNameTextBox, emailTextBox, ageTextBox, weightTextBox, heightTextBox;
    private Spinner genderDropdown;
    private Button updButton;
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

        fullNameTextBox = findViewById(R.id.fullNameTextBox);

        emailTextBox = findViewById(R.id.emailTextBox);

        ageTextBox = findViewById(R.id.ageTextBox);

        genderDropdown = findViewById(R.id.genderList);

        weightTextBox = findViewById(R.id.weightTextBox);

        heightTextBox = findViewById(R.id.heightTextBox);


        //Adding the specified options for the dropdown to the Spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.gender_list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderDropdown.setAdapter(adapter);



        //Update Details Button
        updButton = findViewById(R.id.updateButton);

        updButton.setOnClickListener(
            new Button.OnClickListener(){
                public void onClick(View v){
                    retrieveAndValidateDetails();
                    Intent a = new Intent(getApplicationContext(), VideosPage.class);
                    a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(a);

                }
            }
        );

    }
    public void retreiveAndDisplayInfoFromDB(){


    }

    public void uploadDetailsToTheDB(){


    }

    //This methood grabs the user details currently displayed in the userGUI and if any changes are made to it, provides an option to update the information in the database.
    public boolean retrieveAndValidateDetails(){
        boolean fullNameCheck=false;
        boolean emailCheck=false;
        boolean ageCheck=false;
        boolean weightCheck=false;
        boolean heightCheck = false;
        String fullName, email, ageString, weightString, heightString;

        int age=0;
        int weight=0;
        double height = 0;

        fullName = fullNameTextBox.getText().toString();
        email = emailTextBox.getText().toString();

        ageString = ageTextBox.getText().toString();
        if(!ageString.equals("")){
            age = Integer.parseInt(ageString);
        }

        String gender = genderDropdown.getSelectedItem().toString();

        weightString = weightTextBox.getText().toString();
        if(!weightString.equals("")){
            weight = Integer.parseInt(weightString);
        }

        heightString = heightTextBox.getText().toString();
        if(!heightString.equals("")){
            height = Double.parseDouble(heightString);
        }


       // double height = Double.parseDouble(heightTextBox.getText().toString());

        if(fullName.matches("[a-zA-Z]+ ([a-zA-Z]+ )*[a-zA-Z]+")){
            System.out.println("VALID NAME");
            fullNameCheck = true;
        }

        if(email.matches("[a-zA-Z0-9]+(.[a-zA-Z0-9]+)*@[a-zA-Z].[a-zA-Z]+(.[a-zA-Z]+)*")){
            System.out.println("VALID EMAIL");
            emailCheck = true;
        }

        if(age>=15 && age<=150){
            System.out.println("VALID AGE");
            ageCheck = true;
        }
        System.out.println(gender);

        if(weight>=35 && weight<=1000){
            System.out.println("VALID WEIGHT");
            weightCheck = true;

        }
        if(height >= 54 && height<=260){
            System.out.println("VALID HEIGHT");
            heightCheck = true;
        }

        //if all the input checks are valid then it returns a true value otherwise a false.
        System.out.println(fullNameCheck && emailCheck && ageCheck && weightCheck && heightCheck);
        return fullNameCheck && emailCheck && ageCheck && weightCheck && heightCheck;






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