package com.oop.fa.model.DBMS;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:8889/FinalAssignment?useSSL=no";

    /**
     * This function creates a connection to the DB with the values given to the attributes in this class.
     *
     */
    public ConnectDB(){
        try{
            Class.forName(driver);
            // Manage the connection to the DB.
            conn = DriverManager.getConnection(url,user,password);
            if (conn != null) {
                System.out.println("The DB was opened successfully");
                JOptionPane.showMessageDialog(null, "Connected to the DB", "Mens", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error code: " + ((SQLException) e).getErrorCode() + "\n" +
                    "SLQState: " + ((SQLException) e).getSQLState() + "\n" +
                    "Message: " + e.getMessage() + "\n");
            System.out.println("Not connected");
        }
    }

    /**
     * This function closes the connection to the DB we opened with ConnectDB.
     *
     */
    public void closeConnection() {
        try {
            conn.close();
            System.out.println("The DB was closed successfully.\n");
        } catch (SQLException e){
            System.out.println("Error closing the DB.\n");
        };
    }
}