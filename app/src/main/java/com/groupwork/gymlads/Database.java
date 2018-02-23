package com.groupwork.gymlads;

import android.content.Context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Driver;



/**
 * Created by up826133 on 22/02/2018.
 */

public class Database {

    Scanner myScanner = new Scanner(System.in);
    public static void main(String args[]){
    Database d = new Database();
    d.run();
    }

    public void run(){

        String url = "jdbc:mysql://35.205.75.211:3306/";
        String dbName = "up826133";
        String userName = "android";
        try {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection(url+dbName, userName, "Mysql123");

            Statement st = conn.createStatement("SELECT * FROM TEST");
            ResultSet rs = st.executeQuery(st);
            System.out.println("HERE");
            while(rs.next()){
                System.out.println("here");
                System.out.println(rs.getString("testId"));

            }
            rs.close();
            st.close();
            conn.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
