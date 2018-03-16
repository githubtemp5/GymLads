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
// video class
// this class bind the videos and xml files together to have pleasant viewing of the video
//

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

        videos.add("Squat \n Benefits: Building leg muscles including hamstrings. \n Risks: Way result in lower back pain.");
        videos.add("Sit up \n Benefits:This exercise will help you alot for your your upper body strength. \n Risks: Full sit-ups may cause back pain and arching of the lower back, increasing the risk of back injury.");
        videos.add("Cyclying \n This exercise will help you with your abs and legs.");
//using the listview to check any of the listed item is clicked if it is clicked then display the assigned video 
        adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,videos);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                videoView.suspend();
                if(position==0){
                    videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+"/"+R.raw.video_squat));
                }
                else if(position==1){
                    videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+"/"+R.raw.video_sit_up));
                }
                else if(position==2){

                }

                videoView.setMediaController(new MediaController(VideosPage.this));
                videoView.requestFocus();
                videoView.start();
// giving the user control over the video so they can pause or fast foward it 
            }


        });

    }
}
