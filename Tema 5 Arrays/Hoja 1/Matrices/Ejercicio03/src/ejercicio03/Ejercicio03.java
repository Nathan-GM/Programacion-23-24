/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author damtarde
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        //valor N
        int n = 0;
        System.out.println("Escribe la N");
        n = teclado.nextInt();
        
        //valor M
        int m = 0;
        System.out.println("Escribe la M");
        m = teclado.nextInt();
        
        // Matriz
        int[][] mat = new int[n][m];
        
        //FIlas
        for (int i = 0; i < mat.length; i++) {
            //Columnas
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = n * m;
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.println("");
        }
    }

}
