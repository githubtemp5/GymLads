package com.groupwork.gymlads;

import android.content.Context;
import android.provider.ContactsContract;


import org.mariadb.jdbc.Driver;

import org.mariadb.jdbc.MariaDbConnection;
import org.mariadb.jdbc.MariaDbStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



/**
 * Created by up826133 on 22/02/2018.
 */

public class Database implements DatabaseInterface {
    public static Scanner myScanner = new Scanner(System.in);
    private Connection conn;
    private String url;
    private String dbName;
    private String username;
    private String password;

    public Database(String _url, String _dbName, String _username, String _password){
        url = _url;
        dbName = _dbName;
        username = _username;
        password = encrypt(_password);
    }


//    public void run(){
//
//
//        try {
//
//            Statement st = conn.createStatement();
//            //PreparedStatement p = new Pr
//           // ResultSet rs = st.executeQuery("SELECT * FROM TEST");
////            System.out.println("HERE");
////            while(rs.next()){
////                System.out.println(rs.getString("testId"));
////
////            }
////            rs.close();
//            st.close();
//            conn.close();
//            conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

    public String encrypt(String pass){
        return pass;
    }




    public void establishConnection(){
        try{
            Class.forName("org.mariadb.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url+dbName, username, password);
            System.out.println("Connection established");
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }




    public ResultSet selectQuery(String query){
        ResultSet rs = null;
        try{
            Statement st = conn.createStatement();
            rs = st.executeQuery(query);

        }catch(Exception e){
            System.out.println("Statement Error");

        }
    return rs;
    }

    public ResultSet selectQuery(String query, String columnName){
    ResultSet rs = null;
        return rs;
    }

    public String insertQuery(String query){

        return query;
    }

    public String updateQuery(String query){

        return query;
    }

    public String deleteQuery(String query){

        return query;
    }



    public static void main(String args[]){
        System.out.println("Enter the password");
        Database databaseInstance = new Database("jdbc:mariadb://35.195.101.184:3306/", "up826133", "up826133", myScanner.nextLine());
        databaseInstance.establishConnection();

        //  ResultSet rs = databaseInstance.selectQuery("SELECT * FROM Test");
    }
}



interface DatabaseInterface{

    void establishConnection();
    //  ResultSet selectQuery(String query);
    // ResultSet selectQuery(String query, String columnName);
    // ResultSet selectQuery(ResultSet rs, String query, String columnName);
    String insertQuery(String query);
    String updateQuery(String query);
    String deleteQuery(String query);

}
