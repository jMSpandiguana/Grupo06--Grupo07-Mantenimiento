/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.bdconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author UserR
 */
public class BDConexion {
 
    private static Connection con = null;

    public static void conectar() {
        try {
            //PostgreSQL            
            //con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UnidadEducativa","postgres","root");
            //MYSQL
            con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Citas_Medicas_Mater","root","root");
            if (con != null) {
                System.out.println("Conexión exitosa");
            } else {
                System.out.println("Conexión fallida");
            }
        } catch (SQLException e) {
            System.out.println("Error de Conexión: " + e.getMessage());
        }
    }
    
    public static void desconectar() {
        if (con != null) {
            try {
                con.close();
                System.out.println("Desconectado");
            } catch (SQLException e) {
                System.out.println("Error al Desconectar: " + e.getMessage());
            }
        }
    }

    public static Connection getCon() {
        return con;
    }
}
