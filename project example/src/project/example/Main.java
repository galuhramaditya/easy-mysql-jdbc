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
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // only once init
        DB.setDatabase("test");
        
        
        
        // -----------------------------------------------
        Manipulation manipulate = new Manipulation();
        
        manipulate.display();
        
        manipulate.insert("galuh");        
        manipulate.display();
        
        manipulate.update("galuh", 3);
        manipulate.display();
        
        manipulate.delete(10);
        manipulate.display();
    }
    
}
