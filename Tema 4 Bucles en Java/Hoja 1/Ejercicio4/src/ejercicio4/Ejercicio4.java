/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author damtarde
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la cantidad de nº que quieres mostrar (se mostraran los pares)");
        n = teclado.nextInt();
        System.out.println("Forma con FOR");
        for (int i = 1; i <= n; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println("");
        int i = 1;
        System.out.println("Forma While");
        while ( i <= n) {
            System.out.print(2 * i + " ");
            i++;
        }
        System.out.println("");
    }

}
