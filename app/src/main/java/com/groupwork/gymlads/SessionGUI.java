package com.groupwork.gymlads;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.app.Activity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.Toast;
// this graphical user interface will display the workout details of the plan which is session 

public class SessionGUI extends AppCompatActivity {

    public static String currentlySelected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session_gui);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        ListAdapter planAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, days);
        ListView PlanListView = (ListView) findViewById(R.id.PlanListView);
        PlanListView.setAdapter(planAdapter);

        PlanListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                // using the if statement to check if any item is selected on the list 

                if(position==0){
                    currentlySelected = "mon";
                    Intent i = new Intent(getApplicationContext(), PersonalisedPlan.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(i);
                }
                else if(position==1){
                    currentlySelected = "tue";
                    Intent i = new Intent(getApplicationContext(), PersonalisedPlan.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(i);
                }
            }
    });

    }
}
