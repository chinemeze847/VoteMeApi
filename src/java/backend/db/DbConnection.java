/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DbConnection 
{
    private static  String URL ;
    private static  String USERNAME;
    private static  String PASSWORD;
    
    
    public DbConnection()
    {
        URL =  "jdbc:mysql://localhost:3306/futoelectiondb?useSSL=false&serverTimezone=Africa/Lagos";
        USERNAME = "root";
        PASSWORD = "thankgod";
    }
    
    
    public Connection connect() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}
