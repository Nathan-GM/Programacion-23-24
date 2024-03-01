/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Arrays;

/**
 *
 * @author Natha
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=30;
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random()*10);
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + i + " equivale a " + arr[i]);
        }
    }
    
}
