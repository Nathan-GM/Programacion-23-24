/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2_ranking_nombres;

import java.util.Scanner;

/**
 *
 * @author Natha
 */
public class Practica2_Ranking_Nombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int opcion = menu(teclado);
        switch (opcion) {
            case 1:
                System.out.print("Introdizca el año: ");
                int anyo = teclado.nextInt();
                teclado.nextLine();
                System.out.print("Introdizca el sexo (M o F): ");
                String sexo = teclado.nextLine().toUpperCase();
                System.out.print("Introdizca el nombre: ");
                String nombre = teclado.nextLine();
                buscar(anyo, sexo, nombre);
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static int menu(Scanner teclado) {
        System.out.println("\tPOPULARIDAD NOMBRE DE BEBES");
        System.out.println("\t\t1.Buscar por Año, Sexo y Nombre");
        System.out.println("\t\t2.Tabla top 5 niños y niñas de cada año");
        System.out.println("\t\t3.10 primeros niños y niñas acumulando los datos de los 10 años (que?)");
        System.out.println("\t\t0.Salir del programa.");
        return teclado.nextInt();
    }

    private static void buscar(int anyo, String sexo, String nombre) {
        
    }
    
}
