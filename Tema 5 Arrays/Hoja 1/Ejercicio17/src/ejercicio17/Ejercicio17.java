/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Natha
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n = 10;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Escribe un valor");
            arr1[i] = teclado.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Escribe un valor AR2");
            arr2[i] = teclado.nextInt();
        }
        if (Arrays.equals(arr1,arr2)) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("Son distintos");
        }
    }
}
