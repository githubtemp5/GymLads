package com.groupwork.gymlads;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mint on 06/03/18.
 */

public class Session {
    private int sessionId;
    private static String[] validSessionNames;
    private String sessionName;
    private ArrayList<Exercise> exercises;

    public Session(String _sessionName){
        validSessionNames = new String[7];
        sessionName = setSession(_sessionName);
        validSessionNames = new String[]{"mon", "tue", "wed", "thurs", "fri", "sat", "sun"};
        exercises = new ArrayList<Exercise>();
        sessionId = Arrays.asList().indexOf(sessionName);
    }

    public void addExercise(Exercise e){
        exercises.add(e);

    }

    public int getSessionId() {
        return sessionId;
    }

    public static String[] getValidSessionNames() {
        return validSessionNames;
    }

    public String getSessionName() {
        return sessionName;
    }

    public ArrayList<Exercise> getExercises() {
        return exercises;
    }

    public String setSession(String _session){
        if(Arrays.asList(validSessionNames).contains(_session.toLowerCase())){
            _session = _session.toLowerCase();
        }
        else{
            _session = null;
        }
        return _session;
    }
}
