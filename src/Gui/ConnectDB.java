package Gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author aamir
 */

public class ConnectDB {   
    //JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/QalinBank";
    
    //Database credentials 
    static final String USER = "root";
    static final String PASS = "";
    Connection conn = null;
    public static Connection dbConnector(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        } catch (Exception ex) {
            return null;
        }
    }   
    
}
