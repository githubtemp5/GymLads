package com.groupwork.gymlads;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import java.io.FileReader;
// this is the page where all the pages are linked from the main choice menu 
// when the user click on the picture button they will be let on to the next page 
public class MainMenu extends AppCompatActivity {

    private FileReader fr;
    private ImageButton userProfileButton;
    private ImageButton userPlanButton;
    private ImageButton videoDemButton;
    private ImageButton weightTrackButton;
    private ImageButton perPlanButton;
    //private ImageButton

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);// deploying the listener to check which button are click or or just be stand by mode 
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

        userPlanButton = (ImageButton) findViewById(R.id.personalisedPlanButton);//  user plan button which is linked to the userplan page
        userPlanButton.setOnClickListener(
                new ImageButton.OnClickListener(){
                    @Override
                    public void onClick(View v){
            }
        }
        );

        videoDemButton = (ImageButton) findViewById(R.id.videoDemonButton);//video demo button which is linked to another page 
        videoDemButton.setOnClickListener(                                  //when click on the button it will intent to the next page
                new ImageButton.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(getApplicationContext(), com.groupwork.gymlads.VideosPage.class);
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(i);
                    }
                }
        );

        weightTrackButton = (ImageButton) findViewById(R.id.weightTrackerButton);// weight tracker page is linked to the image button when click on 
        weightTrackButton.setOnClickListener(                                   // when click on the button it will intent to the next page 
                new ImageButton.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(getApplicationContext(), Weight_Tracker.class);
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(i);
                    }
                }
        );

        perPlanButton = (ImageButton) findViewById(R.id.personalisedPlanButton); // perosnalised plan image button which will lead to another page 
        perPlanButton.setOnClickListener(
                new ImageButton.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(getApplicationContext(), SessionGUI.class);
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

