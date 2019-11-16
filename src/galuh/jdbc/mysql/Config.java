/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galuh.jdbc.mysql;

/**
 * Config the MySQL connection
 *
 * <p>
 * <b>## Only once config or not at all! reconfig is not required</b>
 * <small>*except you need more</small>
 * </p>
 *
 * <p>
 * <b>Default:</b>
 * <pre>
 *      host        : localhost
 *      port        : 3306
 *      database    :
 *      username    : root
 *      password    :
 * </pre>
 * </p>
 *
 * @author galuh ramaditya
 */
class Config {

    protected static String host = "localhost";
    protected static int port = 3306;
    protected static String database = "";
    protected static String username = "root";
    protected static String password = "";

    /**
     * Set the MySQL host
     *
     * <p>
     * <b>## Only once config or not at all! reconfig is not required</b>
     * <small>*except you need more</small>
     * </p>
     *
     * @param host Default is `localhost`
     */
    public static void setHost(String host) {
        Config.host = host;
    }

    /**
     * Set the MySQL port
     *
     * <p>
     * <b>## Only once config or not at all! reconfig is not required</b>
     * <small>*except you need more</small>
     * </p>
     *
     * @param port Default is `3306`
     */
    public static void setPort(int port) {
        Config.port = port;
    }

    /**
     * Set the MySQL database
     *
     * <p>
     * <b>## Only once config or not at all! reconfig is not required</b>
     * <small>*except you need more</small>
     * </p>
     *
     * @param database Default is ``
     */
    public static void setDatabase(String database) {
        Config.database = database;
    }

    /**
     * Set the MySQL username
     *
     * <p>
     * <b>## Only once config or not at all! reconfig is not required</b>
     * <small>*except you need more</small>
     * </p>
     *
     * @param username Default is `root`
     */
    public static void setUsername(String username) {
        Config.username = username;
    }

    /**
     * Set the MySQL password
     *
     * <p>
     * <b>## Only once config or not at all! reconfig is not required</b>
     * <small>*except you need more</small>
     * </p>
     *
     * @param password Default is ``
     */
    public static void setPassword(String password) {
        Config.password = password;
    }
}
