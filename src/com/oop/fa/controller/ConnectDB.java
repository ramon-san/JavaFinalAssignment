import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;



public class conectarBD {

    static Connection con;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:8889/ejemploBD?useSSL=no";

    public conectarBD(){

        try{

            Class.forName(driver);
            // Gestiona la conexión a la BD
            con = DriverManager.getConnection(url,user,password);
            if (con != null){
                JOptionPane.showMessageDialog(null, "Se conecto Otoño 2021","Mens",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Código de Error: " + ((SQLException) e).getErrorCode() + "\n" +
                    "SLQState: " + ((SQLException) e).getSQLState() + "\n" +
                    "Mensaje: " + e.getMessage() + "\n");
            System.out.println("NO Se conectó");
        }
    }

    // Desde otra clase probamos  la conexion
    public Connection getConnection(){
        return con;
    }

    public void DesConnection(){
        if(con == null){
            System.out.println("Terminó la conexión");

        }
    }

}
