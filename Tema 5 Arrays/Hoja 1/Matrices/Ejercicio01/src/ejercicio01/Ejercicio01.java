/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author damtarde
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        int[][] mat = new int[n][n];
        int cont = 1;
        //filas
        for (int i = 0; i < mat.length; i++) {

            //columnas
                for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = cont++;
                    System.out.printf("%4d",mat[i][j]);
            }
            System.out.println("");
        }
    }
}
