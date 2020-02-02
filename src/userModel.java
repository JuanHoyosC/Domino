import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 57302
 */
public class userModel {

    database conexion;
    PreparedStatement ps;
    ResultSet rs;

    public boolean guardarUser(String nombre, String contraseña) {
        Connection con = null;
        try {
            con = conexion.getCon();
            
            // Consulta 
            ps = con.prepareStatement("INSERT INTO user (nickname, contraseña) VALUES (?,?)");
            
            // Envia los datos a la consulta
            ps.setString(1, nombre);
            ps.setString(2, contraseña);
            
            // Ejecuta la consulta
            int res = ps.executeUpdate();

            // Si es mayor a 0 la consulta fue exitosa
            if (res > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(userModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(nombre + " " + contraseña);

        return false;
    }

    public boolean buscarUser(String nombre, String contraseña) {
        Connection con = null;
        try {
            con = conexion.getCon();
            // Consulta 
            ps = con.prepareStatement("SELECT * FROM user WHERE nickname = ? and contraseña = ?");
            // Envia los datos a la consulta
            ps.setString(1, nombre);
            ps.setString(2, contraseña);
            
            //Ejecuta el query
            rs = ps.executeQuery();
            
            // Muestra si la consulta fue exitosa
            if (rs.next()) {
                
                return true;
                
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(userModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(nombre + " " + contraseña);

        return false;
    }
}
