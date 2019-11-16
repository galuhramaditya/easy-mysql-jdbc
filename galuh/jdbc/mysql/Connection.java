/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galuh.jdbc.mysql;

import javax.swing.JOptionPane;

/**
 * Make connection to MySQL
 *
 * <p>
 * <b>## Config the connection first!</b>
 * </p>
 *
 * @author galuhramaditya
 */
class Connection extends Config {

    private static java.sql.Connection mysql;

    protected static java.sql.Connection DB() {
        try {
            java.sql.DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = String.format("jdbc:mysql://%s:%s/%s?useSSL=false", Config.host, Config.port, Config.database);
            mysql = java.sql.DriverManager.getConnection(url, Config.username.toString(), Config.password.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Connecting Failed", 1);
        }
        return mysql;
    }
}
