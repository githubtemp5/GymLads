package com.groupwork.gymlads;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.VideoView;

import java.util.ArrayList;

/**
 * Created by up826133 on 15/03/2018.
 */
//this is a listview pf the videos
public class Weight_Tracker extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videos;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_tracker);
    }
}
