/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author damtarde
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int p;
        int q;
        System.out.println("Dame el valor de P");
        p = teclado.nextInt();
        System.out.println("Dame el valor de Q");
        q = teclado.nextInt();
        int tamano = q - p + 1;
        System.out.println("Tamaño del array: " + tamano);
        int[] numero = new int[tamano];
        for (int i = 0; i < (tamano); i++) {
            numero[i] = p++;
        }
        for (int i = 0; i < (tamano); i++) {
            System.out.println("Elemento " + i + " tiene el valor de " + numero[i]);

        }
    }

}
