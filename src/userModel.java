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
    int puntosJ = 0;
    int puntosM1 = 0;
    int puntosM2 = 0;

    public boolean verificarUser(String nombre) {
        Connection con = null;
        try {
            con = conexion.getCon();
            // Consulta 
            ps = con.prepareStatement("SELECT * FROM user WHERE nickname = ?");
            // Envia los datos a la consulta
            ps.setString(1, nombre);

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
        return false;
    }

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

        return false;
    }

    public void obtenerPuntos(String nombre) {
        Connection con = null;
        try {
            con = conexion.getCon();
            // Consulta 
            ps = con.prepareStatement("SELECT * FROM puntos WHERE usuario = ?");
            // Envia los datos a la consulta
            ps.setString(1, nombre);

            //Ejecuta el query
            rs = ps.executeQuery();

            // Muestra si la consulta fue exitosa
            if (rs.next()) {
                puntosJ = rs.getInt("puntosUser");
                puntosM1 = rs.getInt("puntosMaquina1");
                puntosM2 = rs.getInt("puntosMaquina2");
            }

        } catch (SQLException ex) {
            Logger.getLogger(userModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updatePuntos(String nombre, int puntosJ, int puntosM1, int puntosM2) {
        Connection con = null;
        try {
            con = conexion.getCon();
            // Consulta 
            ps = con.prepareStatement("UPDATE puntos SET usuario=?, puntosUser=?, puntosMaquina1=?, puntosMaquina2=? WHERE usuario=?");
            // Envia los datos a la consulta
            ps.setString(1, nombre);
            ps.setInt(2, puntosJ);
            ps.setInt(3, puntosM1);
            ps.setInt(4, puntosM2);
            ps.setString(5, nombre);

            //Ejecuta el query
            int res = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(userModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void crearPuntos(String nombre, int puntosJ, int puntosM1, int puntosM2) {
        Connection con = null;
        try {
            con = conexion.getCon();
            // Consulta 
            ps = con.prepareStatement("INSERT INTO puntos (usuario, puntosUser, puntosMaquina1, puntosMaquina2) VALUES (?,?,?,?)");
            // Envia los datos a la consulta
            System.out.println(puntosJ);
            System.out.println(puntosM1);
            System.out.println(puntosM2);
            System.out.println(nombre);
            ps.setString(1, nombre);
            ps.setInt(2, puntosJ);
            ps.setInt(3, puntosM1);
            ps.setInt(4, puntosM2);

            //Ejecuta el query
            int res = ps.executeUpdate();

            // Muestra si la consulta fue exitosa
            if (res > 0) {
                System.out.println("Datos guardados");
            }

        } catch (SQLException ex) {
            Logger.getLogger(userModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
