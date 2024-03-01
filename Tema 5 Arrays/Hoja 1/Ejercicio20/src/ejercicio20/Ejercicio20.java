/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Natha
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int n = 1000;
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = (int) (Math.random() * 100);
        }
        System.out.println("Escribe un numero");
        num = teclado.nextInt();
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (val[i] == num) {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("El número " + num + " aparece " + contador + " veces");
        }
        else {
            System.out.println("No aparece en el array");
        }
        

    }

}
