/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author galuhramaditya
 */
public class DB {
    private static final Connection conn = Connecting.DB();
    public static ResultSet sql;
    
    public static void setSql(String sql) throws SQLException {
        // set ResultSet with sql syntax
        Statement stm = conn.createStatement();
        DB.sql = stm.executeQuery(sql);
        
        /**
        while (DB.sql.next()) {
            get field with DB.sql
        }
        */
    }
    
    public static void execute(String sql) throws SQLException {
        // execute sql syntax
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
    }
}
