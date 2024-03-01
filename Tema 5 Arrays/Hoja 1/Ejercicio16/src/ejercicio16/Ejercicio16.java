/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Natha
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
        int v = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr, v);
            v= v+1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + i + " equivale a " + arr[i]);

        }
    }

}
