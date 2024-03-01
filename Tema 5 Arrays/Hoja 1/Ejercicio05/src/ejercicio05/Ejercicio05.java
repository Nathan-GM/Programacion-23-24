/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author damtarde
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 20;
        int sumav = 0;
        double media = 0;
        int[] numero = new int[n];
        for (int i = 0; i < n; i++) {
            numero[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + i + " tiene el valor de " + numero[i]);
            sumav = sumav + numero[i];
        }
        media = (double) sumav / n;
        System.out.println("La suma de todo es: " + sumav);
        System.out.println("La media es: " + media);
    }

}
