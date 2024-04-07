/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg01;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author natgonmer
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        boolean correcto;
        do {
            correcto = false;
            try {
                int opcion = menu(teclado);
                if (opcion < 0 || opcion > 5) {
                    throw new NumeroFueraDeRango(opcion);
                }
                System.out.println("");
                switch (opcion) {
                    case 0:
                        System.out.println("Salir");
                        correcto = false;
                        break;
                    case 1:
                        System.out.println("Cargar Fichero");
                        break;
                    case 2:
                        System.out.println("Guardando Fichero");
                        break;
                    case 3:
                        System.out.println("Se buscará un nombre");
                        break;
                    case 4:
                        System.out.println("Se guardará un nuevo nombre");
                        break;
                    case 5:
                        System.out.println("Se eliminará el nombre");
                        break;
                }
            } catch (NumeroFueraDeRango nfdr) {
                System.out.println(nfdr.toString());
                correcto = true;
            }
            catch (InputMismatchException algo) {
                System.out.println("El valor introducido no es un número, introduce de nuevo.");
                teclado.next();
                correcto = true;
            }
            System.out.println("");
        } while (correcto != false);

    }

    private static int menu(Scanner teclado) {
        System.out.println("Menu de Agenda de Nathan");
        System.out.println("----------------------");
        System.out.println("1.- Cargar Fichero Agenda");
        System.out.println("2.- Guardar Fichero Agenda");
        System.out.println("3.- Buscar Nombre");
        System.out.println("4.- Insertar Nuevo Nombre");
        System.out.println("5.- Eliminar Nombre");
        System.out.println("0.- Salir");
        System.out.print("Seleccione [0..5] :");
        return teclado.nextInt();
    }

}
