/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.controlador;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ups.modelo.Persona;

/**
 *
 * @author fernandosanchez
 */
public class ControladorPersonaIT {
    
    public ControladorPersonaIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of crearPersona method, of class ControladorPersona.
     */
    @Test
    public void testCrearPersona() {
        System.out.println("crearPersona");
        Persona persona = new Persona();
        persona.setCedulaPer("010");
        persona.setNombrePer("Jose");
        persona.setApellidPer("Pandiguna");
        persona.setFechaNacimientoPer("10/10/1996");
        persona.setDireccionPer("Colegio Borja");
        persona.setTelefonoPer("090909090");
        ControladorPersona.crearPersona(persona);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarPersona method, of class ControladorPersona.
     */
    @Test
    public void testModificarPersona() {
        System.out.println("modificarPersona");
        Persona persona = new Persona();
        persona.setCedulaPer("010");
        persona.setNombrePer("Miguel");
        persona.setApellidPer("Pandiguna");
        persona.setFechaNacimientoPer("10/10/1996");
        persona.setDireccionPer("Colegio Borja");
        persona.setTelefonoPer("090909090");
        ControladorPersona.modificarPersona(persona);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPersona method, of class ControladorPersona.
     */
    @Test
    public void testBuscarPersona() {
        System.out.println("buscarPersona");
        String cedula = "010";
        Persona persona = new Persona();
        ControladorPersona.buscarPersona(cedula, persona);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPersona method, of class ControladorPersona.
     */
    @Test
    public void testEliminarPersona() {
        System.out.println("eliminarPersona");
        Persona persona = new Persona();
        persona.setCodigoPer(3);
        persona.setCedulaPer("010");
        persona.setNombrePer("Miguel");
        persona.setApellidPer("Pandiguna");
        persona.setFechaNacimientoPer("10/10/1996");
        persona.setDireccionPer("Colegio Borja");
        persona.setTelefonoPer("090909090");
        ControladorPersona.eliminarPersona(persona);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
