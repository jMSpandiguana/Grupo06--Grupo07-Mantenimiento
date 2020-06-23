/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.vista;

import java.util.InputMismatchException;
import java.util.Scanner;
import ups.controlador.ControladorPersona;
import ups.modelo.Persona;

/**
 *
 * @author fernandosanchez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Persona persona = new Persona();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        boolean salir1 = false;
        boolean salir2 = false;
        int opcion, opcions, opcions1 = 0;

        while (!salir) {

            System.out.println(" *-*-*-* Ingresar Persona *-*-*-*");
            System.out.println("1. Crear Persona");
            System.out.println("2. Modificar Persona");
            System.out.println("3. Buscar Persona");
            System.out.println("4. Eliminar Persona");

            System.out.println("5. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("Ingrese su Cédula");
                        persona.setCedulaPer(sn.next());
                        System.out.println("Ingrese sus Nombres");
                        persona.setNombrePer(sn.next());
                        System.out.println("Ingrese us Apellidos");
                        persona.setApellidPer(sn.next());
                        System.out.println("Ingrese su Fecha Nacimiento");
                        persona.setFechaNacimientoPer(sn.next());
                        System.out.println("Ingrese su Dirección");
                        persona.setDireccionPer(sn.next());
                        System.out.println("Ingrese su Teléfono");
                        persona.setTelefonoPer(sn.next());                       
                        ControladorPersona.crearPersona(persona);
                        break;
                    case 2:
                        System.out.println("Ingrese la cedula para buscar a la persona que desea modificar");
                        ControladorPersona.buscarPersona(sn.next(), persona);
                        System.out.println("Selecciones lo que sea cambiar");

                        while (!salir1) {

                            System.out.println("1. Cedula : " +persona.getCedulaPer());
                            System.out.println("2. Nombres : "+persona.getNombrePer());
                            System.out.println("3. Apellidos : "+persona.getApellidPer());
                            System.out.println("4. Dirección : "+persona.getDireccionPer());
                            System.out.println("5. Teléfono : "+persona.getTelefonoPer());
                            System.out.println("6. Fecha Nacimiento : "+persona.getFechaNacimientoPer());
                            System.out.println("7. Finalizar Cambios");

                            try {

                                System.out.println("Escribe una de las opciones");
                                opcions = sn.nextInt();

                                switch (opcions) {
                                    case 1:
                                        System.out.println("Ingrese el nuevo número cédula");
                                        persona.setCedulaPer(sn.next());
                                        persona.setCedulaPer(persona.getCedulaPer());
                                        persona.setApellidPer(persona.getApellidPer());
                                        persona.setDireccionPer(persona.getDireccionPer());
                                        persona.setTelefonoPer(persona.getTelefonoPer());
                                        persona.setFechaNacimientoPer(persona.getFechaNacimientoPer());
                                        ControladorPersona.modificarPersona(persona);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese sus nuevos nombres:");
                                        persona.setCedulaPer(persona.getCedulaPer());
                                        persona.setNombrePer(sn.next());
                                        persona.setApellidPer(persona.getApellidPer());
                                        persona.setDireccionPer(persona.getDireccionPer());
                                        persona.setTelefonoPer(persona.getTelefonoPer());
                                        persona.setFechaNacimientoPer(persona.getFechaNacimientoPer());
                                        ControladorPersona.modificarPersona(persona);;
                                        break;
                                    case 3:
                                        System.out.println("Ingrese sus nuevos apellidos:");
                                        persona.setCedulaPer(persona.getCedulaPer());
                                        persona.setCedulaPer(persona.getCedulaPer());
                                        persona.setApellidPer(sn.next());
                                        persona.setDireccionPer(persona.getDireccionPer());
                                        persona.setTelefonoPer(persona.getTelefonoPer());
                                        persona.setFechaNacimientoPer(persona.getFechaNacimientoPer());
                                        ControladorPersona.modificarPersona(persona);;
                                        break;
                                    case 4:
                                        System.out.println("Ingrese la nueva dirección:");
                                        persona.setCedulaPer(persona.getCedulaPer());
                                        persona.setCedulaPer(persona.getCedulaPer());
                                        persona.setApellidPer(persona.getApellidPer());
                                        persona.setDireccionPer(sn.next());
                                        persona.setTelefonoPer(persona.getTelefonoPer());
                                        persona.setFechaNacimientoPer(persona.getFechaNacimientoPer());
                                        ControladorPersona.modificarPersona(persona);;
                                        break;
                                    case 5:
                                        System.out.println("Ingrese el nuevo numeró de teléfono");
                                        persona.setCedulaPer(persona.getCedulaPer());
                                        persona.setCedulaPer(persona.getCedulaPer());
                                        persona.setApellidPer(persona.getApellidPer());
                                        persona.setDireccionPer(persona.getDireccionPer());
                                        persona.setTelefonoPer(sn.next());
                                        persona.setFechaNacimientoPer(persona.getFechaNacimientoPer());
                                        ControladorPersona.modificarPersona(persona);;
                                        break;
                                    case 6:
                                        System.out.println("Ingrese la nueva Fecha Nacimiento");
                                        persona.setCedulaPer(persona.getCedulaPer());
                                        persona.setCedulaPer(persona.getCedulaPer());
                                        persona.setApellidPer(persona.getApellidPer());
                                        persona.setDireccionPer(persona.getDireccionPer());
                                        persona.setTelefonoPer(persona.getTelefonoPer());
                                        persona.setFechaNacimientoPer(sn.next());
                                        ControladorPersona.modificarPersona(persona);
                                        break;   
                                    case 7:
                                        salir1 = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 7");
                                }
                            } catch (InputMismatchException s) {
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        }

                        break;
                    case 3:

                        System.out.println("Ingrese la cedula para buscar a la persona");
                        ControladorPersona.buscarPersona(sn.next(), persona);
                        System.out.println("Cédula : " + persona.getCedulaPer());
                        System.out.println("Nombres : " + persona.getNombrePer());
                        System.out.println("Apellidos : " + persona.getApellidPer());
                        System.out.println("Dirección : " + persona.getDireccionPer());
                        System.out.println("Teléfono : " + persona.getTelefonoPer());
                        System.out.println("Fecha Nacimiento : " + persona.getFechaNacimientoPer());
                        break;
                    case 4:
                        System.out.println("Ingrese la cedula para buscar a la persona que desea eliminar");
                        ControladorPersona.buscarPersona(sn.next(), persona);
                        System.out.println("Cédula : " + persona.getCedulaPer());
                        System.out.println("Nombres : " + persona.getNombrePer());
                        System.out.println("Apellidos : " + persona.getApellidPer());
                        System.out.println("Dirección : " + persona.getDireccionPer());
                        System.out.println("Teléfono : " + persona.getTelefonoPer());
                        System.out.println("Fecha Nacimiento : " + persona.getFechaNacimientoPer());
                        System.out.println("Si desea eliminar precione 1 o 2 si no desea eliminar ");
                        while (!salir2) {
                        try {

                                System.out.println("Escribe una de las opciones");
                                opcions1 = sn.nextInt();
                                
                                switch (opcions1) {
                                    case 1:
                                        ControladorPersona.eliminarPersona(persona);
                                        salir2 = true;
                                        break;
                                    case 2:
                                        salir2 = true;
                                        break;                           
                                }
                        } catch (InputMismatchException w) {
                                System.out.println("Debes insertar un número");
                                sn.next();    
                        }
                        
                        }
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

}
