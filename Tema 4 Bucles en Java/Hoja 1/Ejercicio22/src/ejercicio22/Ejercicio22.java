/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

/**
 *
 * @author damtarde
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base = 5; //columnas
        int altura = 4; //filas
        int repeticiones = 2; //veces
        for (int filas = 1; filas <= altura; filas++) {
            for (int vez=1; vez<=repeticiones; vez++) {
            for (int columnas = 1; columnas <= base; columnas++) {
                    if (filas == 1 || filas == altura || columnas == 1 || columnas == base) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }    
            }                
            System.out.println("");
        }
    }
}
