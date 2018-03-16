package com.groupwork.gymlads;

/**
 * Created by mint on 06/03/18.
 */
// exercise class where this will allow the user to update information from their profile 

// private class variable to be used in this class 
public class Exercise {
    private String exerciseName;
    private int exerciseId;
    private int exerciseSets;
    private int exerciseReps;
    private String exerciseInfo;
    public Exercise(String _name, int _id, int _sets, int _reps, String _info){
            exerciseName = _name;
            exerciseId = _id;
            exerciseSets = _sets;
            exerciseReps = _reps;
            exerciseInfo = _info;
    }
//get method to get exercise name 
  
    public String getExerciseName() {
        return exerciseName;
    }
//get method to get exercise id 
    public int getExerciseId() {
        return exerciseId;
    }

    public int getExerciseSets() {
        return exerciseSets;
    }

    public int getExerciseReps() {
        return exerciseReps;
    }
    // exercise page 

    public String getExerciseInfo() {
        return exerciseInfo;
    }
}
