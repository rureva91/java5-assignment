/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package credentials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author c0643680
 */
public class credentials {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String jdbc = "jdbc:mysql://localhost/product";
            String user = "root";
            String pass = "";

            conn = (Connection) DriverManager.getConnection(jdbc, user, pass);
            
          
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(credentials.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
        
    }
}


