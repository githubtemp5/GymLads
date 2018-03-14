package com.groupwork.gymlads;

/**
 * Created by mint on 06/03/18.
 */

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