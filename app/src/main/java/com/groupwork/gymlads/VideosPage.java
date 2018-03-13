package com.groupwork.gymlads;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;


public class VideosPage extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videos;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_page);

        videos = new ArrayList<>();
        videoView = (VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);

        videos.add("Push Up \n Hello this is a description for the exercise");
        videos.add("Pull Up \n This exercise will help you alot for your your upper body strength.");
        videos.add("Cyclying \n This exercise will help you with your abs and legs.");

        adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,videos);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                videoView.suspend();
                switch(position){
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+"/"+R.raw.sample_video_1));
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+"/"+R.raw.sample_video_2));
                }
                videoView.setMediaController(new MediaController(VideosPage.this));
                videoView.requestFocus();
                videoView.start();

            }


        });

    }
}
