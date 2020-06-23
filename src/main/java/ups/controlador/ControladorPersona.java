/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ups.bdconexion.BDConexion;
import ups.modelo.Persona;

/**
 *
 * @author dilgg
 */
public class ControladorPersona {
    public ControladorPersona() {
    }
    
    public static void crearPersona(Persona persona) {
        try {
            String sql = "INSERT INTO cit_personas (per_cedula,per_nombre,per_apellido,per_fechaNacimiento,per_telefono,per_direccion) VALUES (?,?,?,?,?,?)";
            BDConexion.conectar();
            PreparedStatement sta = BDConexion.getCon().prepareStatement(sql);            
            sta.setString(1, persona.getCedulaPer());
            sta.setString(2, persona.getNombrePer());
            sta.setString(3, persona.getApellidPer());
            sta.setString(4, persona.getFechaNacimientoPer());          
            sta.setString(5, persona.getTelefonoPer());
            sta.setString(6, persona.getDireccionPer());
            sta.executeUpdate();
            sta.close();
            BDConexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar en la base de datos: " + ex.getMessage());
        }
    }
    
    
    public static void modificarPersona(Persona persona) {
        try {
            String actualizar = "UPDATE cit_personas SET per_cedula = ?, per_nombre = ?, per_apellido=?, per_fechaNacimiento = ?, per_telefono = ?, per_direccion = ?   WHERE per_codigo = ?";
            BDConexion.conectar();//conecta
            PreparedStatement sta = BDConexion.getCon().prepareStatement(actualizar);
            sta.setString(1, persona.getCedulaPer());
            sta.setString(2, persona.getNombrePer());
            sta.setString(3, persona.getApellidPer());
            sta.setString(4, persona.getFechaNacimientoPer());          
            sta.setString(5, persona.getTelefonoPer());
            sta.setString(6, persona.getDireccionPer());
            sta.setInt(7, persona.getCodigoPer());
            sta.executeUpdate();//Ejecutar las lineas en la base
            sta.close();
            BDConexion.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }
    
    public static void buscarPersona(String cedula, Persona persona) {
        try {
            String buscarCedula = "SELECT * FROM cit_personas WHERE per_cedula = ? ";
            BDConexion.conectar();
            PreparedStatement sta = BDConexion.getCon().prepareStatement(buscarCedula);
            sta.setString(1, cedula);
            ResultSet res = sta.executeQuery(); //me devuleve y almacena en el result resultset este es el execute
            res.next();

            persona.setCodigoPer(res.getInt("per_codigo"));
            persona.setCedulaPer(res.getString("per_cedula"));
            persona.setNombrePer(res.getString("per_nombre"));
            persona.setApellidPer(res.getString("per_apellido"));
            persona.setDireccionPer(res.getString("per_direccion"));
            persona.setTelefonoPer(res.getString("per_telefono"));           
            persona.setFechaNacimientoPer(res.getString("per_fechaNacimiento"));

            sta.close();
            BDConexion.desconectar();

        } catch (SQLException e) {
            System.out.println("Error al buscar en la Base de Datos: " + e.getMessage());
        }
    }
    
    public static void eliminarPersona(Persona persona) {
        try {
            String eliminar = "DELETE FROM cit_personas WHERE per_codigo = ? ;";
            BDConexion.conectar();//conecta
            PreparedStatement sta = BDConexion.getCon().prepareStatement(eliminar);//devuelve la coneccion y manda el string
            sta.setInt(1, persona.getCodigoPer());
            sta.executeUpdate();//ejecutar
            sta.close();//terminar el ejecutado
            BDConexion.desconectar();//desconectar
        } catch (SQLException ex) {
            System.out.println("Error al eliminar: " + ex.getMessage());
        }
    }
    
    
}

