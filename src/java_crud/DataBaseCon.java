/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aysha
 */
public class DataBaseCon {
    public static Connection connect() throws SQLException{
        Connection Conn = null;
        try {
            String url = "jdbc:mysql://localhost:3307/java_crud";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conn = DriverManager.getConnection(url, user, password);
            return Conn;
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseCon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    
    
    
        
    
}
}