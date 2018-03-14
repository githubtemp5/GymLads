package com.groupwork.gymlads;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.app.Activity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class SessionGUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session_gui);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        ListAdapter planAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, days);
        ListView PlanListView = (ListView) findViewById(R.id.PlanListView);
        PlanListView.setAdapter(planAdapter);

    }

}
