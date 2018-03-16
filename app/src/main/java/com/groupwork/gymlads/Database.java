package com.groupwork.gymlads;

import android.content.Context;
import android.provider.ContactsContract;


//import org.mariadb.jdbc.Driver;

//import org.mariadb.jdbc.MariaDbConnection;
//import org.mariadb.jdbc.MariaDbStatement;
//this file of java is where we are trying to establish connection to the database where weill be storing user information
//which are important to our application 
//
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.*;
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
//encrypting the data when passing that data to the database to check if it is vaild 
    
    public String encrypt(String pass){
        return pass;
    }

    public void establishConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url+dbName, username, password);

            System.out.println("Connection established");
        }
        catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }



//query design, which will check the data in the database
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



    public static void main(String args[]) throws SQLException {

        System.out.println("Enter the password");
        Database databaseInstance = new Database("jdbc:mysql://localhost:0/", "uni", "root", myScanner.nextLine());
        databaseInstance.establishConnection();
        ResultSet rs = databaseInstance.selectQuery("SELECT * FROM Test");

//        MysqlDataSource ds = new MysqlDataSource();
//        ds.setDatabaseName("uni");
//        ds.setUser("root");
//        ds.setPassword("Mysql123");
//        ds.setServerName("localhost");
//        ds.setPort(3306);
//        Connection connection = ds.getConnection();
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
