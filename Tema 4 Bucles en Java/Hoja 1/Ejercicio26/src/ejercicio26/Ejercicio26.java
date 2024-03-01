/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author damtarde
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int ancho = 0;
        System.out.println("Escribe las filas");
        ancho = teclado.nextInt();
        for (int i = 1; i <= ancho; i++) {
            for (int j = 1; j <= i*2 -1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
