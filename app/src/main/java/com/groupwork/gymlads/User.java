package com.groupwork.gymlads;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by up826133 on 21/02/2018.
 */

//register page with values displayed on teh page
public class                                                                                                                                                                                                                                                                                                           User {
    private String userName;
    private String fullName;
    private String email;
    private int age;
    private String gender;
    private int weight;
    private int height;
    private ArrayList<Plan> userPlans;
// The strings and int that are inputted into the application
    public User(String _userName, String _fullName, String _email, int _age , String _gender, int _weight, int _height){

        userName = _userName;
        fullName = _fullName;
        email = _email;
        age = _age;
        gender = _gender;
        weight = _weight;
        height = _height;
        userPlans = new ArrayList<Plan>();

        }
//returns the username ect to see if valid
    public String getUserName() {
        return userName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public ArrayList<Plan> getUserPlans() {
        return userPlans;
    }
}
