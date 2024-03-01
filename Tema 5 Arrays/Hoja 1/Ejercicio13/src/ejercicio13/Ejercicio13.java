/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n = 0; //duración array
        System.out.println("Escribe la cantidad de elementos del Array");
        n = teclado.nextInt();
        int v = 0; // valor inicial
        System.out.println("Escribe el valor inicial de la secuencia aritmética");
        v = teclado.nextInt();
        int in = 0; //Incrementos
        System.out.println("Escribe los incrementos");
        in = teclado.nextInt();
        int [] sec = new int [n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                sec [i] = v;
            }
            else {
            sec[i] = v + in;    
            }
            v = sec [i];
        }
        System.out.println("SECUENCIA ARITMETICA");
        for (int i = 0; i < n; i++) {
            System.out.println(i + " posición = " + sec[i]);
        }
        
    }
    
}
