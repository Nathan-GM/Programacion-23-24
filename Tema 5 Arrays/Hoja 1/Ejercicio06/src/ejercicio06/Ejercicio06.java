/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author damtarde
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int m;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica tamaño");
        n = teclado.nextInt();
        System.out.println("Indica el valor de M");
        m = teclado.nextInt();
        int[] cantidad = new int[n];
        for (int i = 0; i < n; i++) {
            cantidad[i] = m;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + i + " tiene el valor de " + cantidad[i]);
        }
    }
}
