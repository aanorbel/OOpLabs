package com.aanorbel.studentManagement.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by anorbel on 6/16/16.
 * package com.aanorbel.studentManagement.DAO, project OOPLaps
 * class function
 */
public class DBconnection {
    /**
     * The Conn.
     */
    static Connection conn = null;
    /**
     * The database Url.
     */
    static String url = "jdbc:mysql://localhost:3306/students";
    /**
     * The database Username.
     */
    static String uname = "root";
    /**
     * The database username Password.
     */
    static String password = "root";

    /**
     * Open connection connection to the database.
     *
     * @return the connection
     */
    public static Connection openConnection() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, uname, password);

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());
            System.out.println("Unable to load Driver");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            System.out.println("Sql Connection failure");

        }

        return conn;
    }

    /**
     * Close connection to database.
     */
    public static void closeConnection() {
        try {

            if (conn != null) {
                conn.close();
            }

        } catch (SQLException sqle) {

            System.out.println(sqle);

        }
    }
}
