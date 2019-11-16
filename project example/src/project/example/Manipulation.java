/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.example;

import galuh.jdbc.mysql.DB;
import java.sql.SQLException;

/**
 *
 * @author galuh ramaditya
 * 
 */
public class Manipulation {

    /**
     * 
     * !! SET DATABASE NOT DONE HERE `CAUSE WE'VE HAVE DONE IT IN `Main` !!
     */
    
    void display() throws SQLException {
        DB.query("SELECT * FROM tab");

        while (DB.data.next()) {
            String id = DB.data.getString("id");
            String name = DB.data.getString("name");

            System.out.println("id: " + id + ", name: " + name);
        }
    }

    void insert(String name) throws SQLException {
        DB.execute("INSERT INTO tab (name) VALUES('" + name + "')");
    }

    void update(String name, int id) throws SQLException {
        DB.execute("UPDATE tab SET name = '" + name + "' WHERE id = " + id);
    }

    void delete(int id) throws SQLException {
        DB.execute("DELETE FROM tab WHERE id = " + id);
    }
}
