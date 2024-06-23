/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.naming.NamingException;

/**
 *
 * @author nguye
 */
public class ConnectionProvider {
    public static Connection getConnection() throws ClassNotFoundException, SQLException, NamingException {
        Connection conn = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:9999;databaseName=pharmacy;";
        conn = DriverManager.getConnection(url, "admin", "4444");
        return conn;  
    } 
}
