/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

import java.util.Scanner;

/**
 *
 * @author damtarde
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ancho = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el ancho");
        ancho = teclado.nextInt();
        for (int i = 0; i < ancho; i++) {
            for (int j = 1; j <= ancho - i; j++) {
                System.out.print(j +" ");
            }
            System.out.println("");
        }
    }

}
