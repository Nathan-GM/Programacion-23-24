/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

/**
 *
 * @author damtarde
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base = 5; //columnas
        int altura = 3; //filas
        int repeticiones = 2;
        for (int cantidad=1; cantidad<=repeticiones; cantidad++) {
            for (int filas=1; filas <= altura; filas++) {
                for(int columnas=1; columnas <= base; columnas++) {
                    if (filas==1 || filas==altura || columnas==1 || columnas==base) {
                        System.out.print("*  ");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
                System.out.println("");
            }
        System.out.println("");
        }
    }
}
