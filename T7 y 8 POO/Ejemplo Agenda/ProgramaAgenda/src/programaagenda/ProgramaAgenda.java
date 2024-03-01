/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaagenda;

import java.util.Scanner;

/**
 *
 * @author Natha
 */
public class ProgramaAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Agenda de Nathan");
        boolean fin = false;
        int opcion = 0;

        String nombreBorrar = "";
        String comprobacion = "";
        String buscarNombre = "";

        while (fin != true) {
            System.out.println("¿Qué operación quieres realizar?");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Comprobar si el contacto existe");
            System.out.println("4. Listar contactos");
            System.out.println("5. Buscar contacto");
            System.out.println("6. Finalizar");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.err.println("Añadir");
                    break;
                case 2:
                    System.out.println("Borrar");
                    nombreBorrar = teclado.next();
                    Agenda.eliminarContacto(nombreBorrar);
                    break;
                case 3:
                    System.out.println("Introduce el nombre a comprobar");
                    comprobacion = teclado.next();
                    System.out.println("Se comprobará el nombre " + comprobacion);
                    Agenda.existeContacto(comprobacion);
                    break;
                case 4:
                    System.out.println("Listar");
                    Agenda.listarContacto();
                    break;
                case 5:
                    System.out.println("Buscar");
                    buscarNombre = teclado.next();
                    Agenda.buscaContacto(buscarNombre);
                    break;
                case 6:
                    fin = true;
                    break;
                default:
                    System.err.println("Opción no valida");
            }
            System.out.println("");
        }
        System.out.println("Agenda cerrada");
    }

}
