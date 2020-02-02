import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 57302
 */
public class database {

    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/domino";

    public static Connection conector() {
        // Reseteamos a null la conexion a la bd
        con = null;
        try {
            Class.forName(driver);
            // Nos conectamos a la bd
            con = (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa
            if (con != null) {
                System.out.println("Conexion establecida");
            }
        } // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion" + e);
        }
        return con;
    }
    
    
    static Connection getCon(){
        return con;
    }

}
