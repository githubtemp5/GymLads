package com.groupwork.gymlads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class personalisedPlan extends AppCompatActivity {
//personalised plan where it will have plans for the seven days of the week based on the user 
    private TextView heading1;
    private TextView heading11;
    private TextView heading12;
    private TextView heading13;
    private TextView heading2;
    private TextView heading21;
    private TextView heading22;
    private TextView heading23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalised_plan);

    }
    //These are the updated headings for the excercises.
    public void updateLabels(String day){ 
        heading1 = (TextView) findViewById(R.id.heading1);
        heading11 = (TextView) findViewById(R.id.heading11);
        heading12 = (TextView) findViewById(R.id.heading12);
        heading13 = (TextView) findViewById(R.id.heading13);
        heading2 = (TextView) findViewById(R.id.heading2);
        heading21 = (TextView) findViewById(R.id.heading21);
        heading22 = (TextView) findViewById(R.id.heading22);
        heading23 = (TextView) findViewById(R.id.heading23);

        if(day.equals("mon")){// if statement to choose which plan is going to the user
            heading1.setText("Cardio Exercises");
            heading11.setText("Running 20 minutes");
            heading12.setText("Rowing 20 minutes");
            heading13.setText("Cyclying 20 mins");
            heading2.setText("Circuit Exercises");
            heading21.setText("Star jumps 10 reps 3 sets");
            heading22.setText("Pushups 20 reps of 3 sets");
            heading23.setText("Skipping for 10 mins");

        }
        //This shows the excercises the user must do
        else if (day.equals("tue")){ 
            heading1.setText("Leg Session 3sets of 15 reps");
            heading11.setText("Leg Raises");
            heading12.setText("Squats 3 sets of 15 reps");
            heading13.setText("Leg Press 3 sets of 10 reps");
            heading2.setText("Arm Exercises");
            heading21.setText("Bicep Curls 3 sets of 15 reps");
            heading22.setText("Dips 2 sets of 5 reps");
            heading23.setText("Tricep Pulldown 3 sets of 8 reps");

        }
    }
}
