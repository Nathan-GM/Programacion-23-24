/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author damtarde
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n = 10;
        int[] valor = new int[n];
        boolean fin = false;
        String opcion;
        do {
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            opcion = teclado.nextLine().toLowerCase();
            switch (opcion) {
                case "a":
                    for (int i = 0; i < n; i++) {
                        System.out.println("Elemento " + i + " tiene el valor de " + valor[i]);
                    }
                    System.out.println("");
                    fin = false;
                    break;
                case "b":
                    for (int i = 0; i < n; i++) {
                        int p;
                        System.out.println("Introduce la posición");
                        p = teclado.nextInt();
                        System.out.println("Introduce valor");
                        valor[p] = teclado.nextInt();   
                    }
                    System.out.println("Valores Actualizados");
                    System.out.println("");
                    fin = false;
                    break;
                case "c":
                    fin = true;
                    break;
                default:
                    System.out.println("Esa letra no corresponde a ninguna orden, introduce una de las indicadas");
            }

        } while (fin == false);
    }

}
