/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioprueba;

/**
 *
 * @author damtarde
 */
public class Ejercicioprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Dado n aleatorio entre 1 y 20 se pide realizar un programa que muestre los N primeros cuadrados perfectos que sean impares
        // N =1 -> 1
        // N = 3 -> 1 9 25
        // N = 6 -> 1 9 25 49 81 121
        int n = 0;
        n = (int) (Math.random()*20+1);
        int cont = 0;
        int i = 1;
        System.out.println("Los cuadrados perfectos impares de " + n + " son:");
        while (cont < n) {
            if (i * i % 2 != 0) {
                cont++;
                System.out.print(i * i + " ");
            }
            i++;

        }
        System.out.println("");
    }

}
