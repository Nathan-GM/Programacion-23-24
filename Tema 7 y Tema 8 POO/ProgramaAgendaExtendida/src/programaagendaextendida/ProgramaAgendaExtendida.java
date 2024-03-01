/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaagendaextendida;

import java.util.Scanner;

/**
 *
 * @author natgonmer
 */
public class ProgramaAgendaExtendida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContactoPersona c1 = new ContactoPersona("Amicia", 123456789, "12-Abril");
        ContactoEmpresa c2 = new ContactoEmpresa("Focus", 1234567891, "www.focus.com");
        
        Agenda.contactos.add(c1);
        Agenda.contactos.add(c2);
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Agenda de Nathan");
        //Booleano que indica el final del programa.
        //Opción del switch del menu
        boolean fin = false;
        int opcion = 0;

        //Variables necesarias para enviar a los metodos
        String nombrecrear = "";
        int telefonocrear = 0;
        String cumpleañoscrear = "";
        String paginaweb = "";
        String nombreBorrar = "";
        String comprobacion = "";
        String buscarNombre = "";
        int opcionCrear = 0;
        boolean opcionCorrecta = true;

        while (fin != true) {
            System.out.println("¿Qué operación quieres realizar?");
            System.out.println("1. Añadir contacto (Funciona)");
            System.out.println("2. Eliminar contacto (No funciona, depende del 5)");
            System.out.println("3. Comprobar si el contacto existe (Funciona)");
            System.out.println("4. Listar contactos (Funciona)");
            System.out.println("5. Buscar contacto(No funciona, devuelve index -1)");
            System.out.println("6. Finalizar");
            System.out.println("");
            System.out.print("Opción Deseada: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1: //Añadir
                    while (opcionCorrecta != false) {
                        System.out.println("¿Que tipo de contacto deseas añadir? (1. Persona | 2. Empresa");
                        opcionCrear = teclado.nextInt();
                        switch (opcionCrear) {
                            case 1: //Persona
                                System.out.println("Introduce el nombre de la persona");
                                nombrecrear = teclado.next();
                                System.out.println("Introduce telefono");
                                telefonocrear = teclado.nextInt();
                                System.out.println("Introduce la fecha de nacimiento");
                                cumpleañoscrear = teclado.next();
                                if (Agenda.existeContacto(nombrecrear) == false) {
                                    Contacto creado = new ContactoPersona(nombrecrear, telefonocrear, cumpleañoscrear);
                                    Agenda.añadirContacto(creado);
                                    System.out.println("Contacto añadido correctamente");
                                } else {
                                    System.err.println("Ya tienes un contacto con ese nombre");
                                }
                                opcionCorrecta = false;
                                break;

                            case 2: //Empresa
                                System.out.println("Introduce el nombre de la empresa");
                                nombrecrear = teclado.next();
                                System.out.println("Introduce telefono");
                                telefonocrear = teclado.nextInt();
                                System.out.println("Introduce la página web");
                                paginaweb = teclado.next();
                                if (Agenda.existeContacto(nombrecrear) == false) {
                                    Contacto creado = new ContactoEmpresa(nombrecrear, telefonocrear, paginaweb);
                                    Agenda.añadirContacto(creado);
                                    System.out.println("Contacto añadido correctamente");
                                } else {
                                    System.err.println("Ya tienes un contacto con ese nombre");
                                }
                                opcionCorrecta = false;

                                break;
                            default:
                                System.err.println("No es una opción valida");
                                opcionCorrecta = true;
                        }

                    }
                    /*
                    System.out.println("Introduce nombre");
                    nombrecrear = teclado.next();
                    System.out.println("Introduce telefono");
                    telefonocrear = teclado.nextInt();
                    if (Agenda.existeContacto(nombrecrear) == false) {
                        Contacto creado = new Contacto(nombrecrear, telefonocrear);
                        Agenda.añadirContacto(creado);
                        System.out.println("Contacto añadido correctamente");
                    } else {
                        System.err.println("Ya tienes un contacto con ese nombre");
                    }
                     */
                    break;
                case 2: //Eliminar
                    System.out.println("Introduce el nombre del contacto a eliminar:");
                    nombreBorrar = teclado.next();
                    Agenda.eliminarContacto(nombreBorrar);
                    if (Agenda.existeContacto(nombreBorrar) == false) {
                        System.out.println("El contacto " + nombreBorrar + " se ha eliminado correctamente");
                    } else {
                        System.out.println("Ocurrio un problema al eliminar el contacto " + nombreBorrar);
                    }

                    break;
                case 3: //Existe / No existe
                    System.out.println("Introduce el nombre a comprobar");
                    comprobacion = teclado.next();
                    System.out.println("Se comprobará el nombre " + comprobacion);
                    if (Agenda.existeContacto(comprobacion) == true) {
                        System.err.println("El contacto " + comprobacion + " ya existe en tu agenda");
                    } else {
                        System.out.println("El contacto " + comprobacion + " no existe en tu agenda");
                    }
                    break;
                case 4: //Listar contactos
                    System.out.println("Listar");
                    Agenda.listarContacto();
                    break;
                case 5: //Buscar Contacto
                    System.out.println("Introduce el nombre del usuario que deseas saber su posición");
                    buscarNombre = teclado.next();
                    System.out.println("El nombre " + buscarNombre + " se encuentra en la posición " + Agenda.buscaContacto(buscarNombre));
                    break;
                case 6: //Fin programa
                    fin = true;
                    break;
                default: //Opción defecto si no es ninguno de los indicados.
                    System.err.println("Opción no valida");
            }
            System.out.println("");
        }
        System.out.println("Agenda cerrada");
    }

}
