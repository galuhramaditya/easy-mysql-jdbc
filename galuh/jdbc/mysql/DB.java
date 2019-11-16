/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galuh.jdbc.mysql;

/**
 *
 * Make the MySQL JDBC easier
 * <p>
 * <b>## Add MySQL JDBC Driver First!<b>
 * </p>
 *
 * @author galuhramaditya
 */
public class DB extends Connection {

    private static final java.sql.Connection conn = Connection.DB();

    /**
     * MySql data Container
     * <p>
     * <b>Example for access data:</b>
     * <pre>
     * DB.data.getString("id");
     * </pre>
     * </p>
     *
     * @return ResulSet data
     */
    public static java.sql.ResultSet data;

    /**
     * Get data from MySQL
     * <p>
     * <b>Example for get data:</b>
     * <pre>
     * while (DB.data.next()) {
     *      String id = DB.data.getString("id");
     * }
     * </pre>
     * </p>
     *
     * @param query MySQL syntax
     */
    public static void query(String query) throws java.sql.SQLException {
        java.sql.Statement stm = conn.createStatement();
        DB.data = stm.executeQuery(query);
    }

    /**
     * Execute query to manipulating MySQL datas
     *
     * @param query MySQL syntax
     */
    public static void execute(String query) throws java.sql.SQLException {
        java.sql.PreparedStatement pst = conn.prepareStatement(query);
        pst.execute();
    }
}
