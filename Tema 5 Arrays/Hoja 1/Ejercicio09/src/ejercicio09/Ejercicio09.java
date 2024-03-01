/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

import java.util.Scanner;

/**
 *
 * @author damtarde
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int r = 0;
        int n = 100;
        int[] numero = new int[n];
        for (int i = 0; i < n; i++) {
            numero[i] = (int) (Math.random() * 10 + 1);
        }

        System.out.println("Escribe un número");
        r = teclado.nextInt();
        for (int i = 0; i < n; i++) {
            if (r == numero[i]) {
                System.out.println("El número " + r + " aparece en la posición " + i);
            }
        }
    }

}
