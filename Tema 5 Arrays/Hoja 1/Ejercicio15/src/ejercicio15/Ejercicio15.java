/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n = 0; // tamaño array
        System.out.println("Escribe el valor de n");
        n = teclado.nextInt();
        int m = 0; // valores array
        System.out.println("Escribe el valor de m");
        m = teclado.nextInt();
       int [] arr = new int [n];
       Arrays.fill(arr,m);
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + i + " equivale a " + arr[i]);
        }
    }
    
}
