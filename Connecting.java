/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author galuhramaditya
 */
public class Connecting {
        
        private static final String host      = "localhost:3306";
        private static final String database  = "";
        private static final String username  = "root";
        private static final String password  = "";
        
        private static Connection mysql;
        public static Connection DB() {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                String url  = "jdbc:mysql://" + Connecting.host + "/" + Connecting.database + "?useSSL=false";
                mysql       = DriverManager.getConnection(url, Connecting.username, Connecting.password);
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, e, "Connecting Failed", 1);
            }
            return mysql;
        }
}
