package com.groupwork.gymlads;

import android.content.Context;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by up826133 on 22/02/2018.
 */

public class Database {

    public static void main(String argws[]){
        String url = "jdbc:mysql:http://up826133.myvm.port.ac.uk/";
        String dbName = "up826133";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url+dbName,userName,password);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
