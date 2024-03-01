/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author damtarde
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base = 5; //columnas
        int altura = 3; //filas
        int repb = 3;
        int repa = 2;
        for (int nf = 1; nf <= repa; nf++) {
            for (int filas = 1; filas <= altura; filas++) {
                if (filas < altura || nf == repa) {
                    for (int nc = 1; nc <= repb; nc++) {
                        for (int columnas = 1; columnas <= base; columnas++) {
                            if (columnas < base || nc == repb) {
                                if (filas == 1 || filas == altura || columnas == 1 || columnas == base) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                    }
                    System.out.println("");
                }

            }
        }
    }
}
