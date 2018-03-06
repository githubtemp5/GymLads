package com.groupwork.gymlads;

import java.util.ArrayList;

/**
 * Created by mint on 06/03/18.
 */

public class Plan {

    private String planName;
    private Session[] sessions;

    public Plan(String _planName){
        planName = _planName;
        sessions = new Session[7];

    }

    public void setSession(Session s){
        sessions[s.getSessionId()] = s;
    }
}
