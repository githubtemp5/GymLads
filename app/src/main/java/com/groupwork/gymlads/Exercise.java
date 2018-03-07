package com.groupwork.gymlads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mint on 06/03/18.
 */

public class Exercise {
    private String exerciseName;
    private int exerciseId;
    private int exerciseSets;
    private int exerciseReps;
    private String exerciseInfo;
    private String exerciseGroup;
    private ArrayList<String> validGroups;
    public Exercise(String _name, int _id, int _sets, int _reps, String _info, String _group){
            exerciseName = _name;
            exerciseId = _id;
            exerciseSets = _sets;
            exerciseReps = _reps;
            exerciseInfo = _info;
            exerciseGroup = setExerciseGroup(_group);

            validGroups = new ArrayList<String>();
            validGroups.add("cardio");
            validGroups.add("chest");
            validGroups.add("arms");
            validGroups.add("legs");
    }

    public String setExerciseGroup(String _group){
        if(validGroups.contains(_group)){
            _group = _group.toLowerCase();
        }
        else{
            _group = null;
        }
        return _group;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public int getExerciseId() {
        return exerciseId;
    }

    public int getExerciseSets() {
        return exerciseSets;
    }

    public int getExerciseReps() {
        return exerciseReps;
    }

    public String getExerciseInfo() {
        return exerciseInfo;
    }
}
