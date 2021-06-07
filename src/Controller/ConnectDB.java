/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Admin88
 */
public class ConnectDB {
    private  String url ;
    private Connection connection;
    private Statement state;
    

    public ConnectDB() {
        this.url ="jdbc:mysql://localhost:3306/management_tour?zeroDateTimeBehavior=convertToNull" ;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection  = DriverManager.getConnection(this.url,"root","");
            this.state = connection.createStatement();
            
        } catch (Exception e) {
            System.out.println("Connect DB fail!");
        }
    }

    public String getUrl() {
        return url;
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getState() {
        return state;
    }
    
}
