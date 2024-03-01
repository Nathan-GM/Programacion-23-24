/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author damtarde
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
        int [] [] mat = new int [n] [n];
        
        //filas
        for (int i = 0; i < mat.length; i++) {
            //columnas
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (i+1) * (j+1);
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.println("");
        }
    }
    
}
