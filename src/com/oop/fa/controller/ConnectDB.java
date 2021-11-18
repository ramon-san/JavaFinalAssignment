package com.oop.fa.controller;

<<<<<<< HEAD:src/com/oop/fa/controller/ConnectDB.java
=======
import javax.swing.JOptionPane;



>>>>>>> 9969166f52f6ec354fb2a262618b7b0549eeaaa6:src/com/oop/fa/controller/connectDB
public class ConnectDB {

    static Connection con;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:8889/finalProject?useSSL=no";

    public ConnectDB(){

        try{

            Class.forName(driver);
            // Manages the connection to the database
            con = DriverManager.getConnection(url,user,password);
            if (con != null){
                JOptionPane.showMessageDialog(null, "The database has been connected.","Mens",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error code: " + ((SQLException) e).getErrorCode() + "\n" +
                    "SLQState: " + ((SQLException) e).getSQLState() + "\n" +
                    "Message: " + e.getMessage() + "\n");
            System.out.println("Did not connect.");
        }
    }

    // We test the connection in another class
    public Connection getConnection(){
        return con;
    }

    public void DesConnection(){
        if(con == null){
            System.out.println("Connection finished");

        }
    }

}
