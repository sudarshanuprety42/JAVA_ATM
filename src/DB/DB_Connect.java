/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sudarsan
 */
public class DB_Connect {

    String host = "127.0.0.1";
    String driver = "org.postgresql.Driver";
    String URL = "jdbc:postgresql";
    int PORT = 5432;
    String dbName = "SIMU_DB";
    String userName = "postgres";
    String password = "postgre";
    Connection conn = null;

    public DB_Connect() {

    }

    public void connectDatabase() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(URL + "://" + host + ":" + PORT + "/" + dbName, userName, password);

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver error" + ex);
        } catch (SQLException ex) {
            System.out.println("Connection error" + ex);
            if (conn != null) {
                System.out.println("DB connected successfully!!!");
            }

        }
    }

    public void closeDBConnection() {
        if (conn != null) {

            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DB_Connect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
