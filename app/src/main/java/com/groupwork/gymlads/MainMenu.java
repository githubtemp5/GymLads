package com.groupwork.gymlads;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import java.io.FileReader;

public class MainMenu extends AppCompatActivity {

    private FileReader fr;
    private ImageButton userProfileButton;
    private ImageButton userPlanButton;
    private ImageButton videoDemButton;
    //private ImageButton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        //initialise();
        userProfileButton = (ImageButton) findViewById(R.id.userProfileButton);
        userProfileButton.setOnClickListener(
                new ImageButton.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getApplicationContext(), com.groupwork.gymlads.ProfileActivity.class);
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(i);
                    }
                }
        );

        userPlanButton = (ImageButton) findViewById(R.id.personalisedPlanButton);
        userPlanButton.setOnClickListener(
                new ImageButton.OnClickListener(){
                    @Override
                    public void onClick(View v){
            }
        }
        );

        videoDemButton = (ImageButton) findViewById(R.id.videoDemonButton);
        videoDemButton.setOnClickListener(
                new ImageButton.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(getApplicationContext(), com.groupwork.gymlads.VideosPage.class);
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(i);
                    }
                }
        );
    }

//    public void initialise (){
//        try {
//
//            // open input stream test.txt for reading purpose.
//            BufferedReader br = new BufferedReader("test.txt");
//            String line = null;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//        Exercise pushUps = new Exercise("Push Ups", 0, 3, 15, "");
//
//    }



}

