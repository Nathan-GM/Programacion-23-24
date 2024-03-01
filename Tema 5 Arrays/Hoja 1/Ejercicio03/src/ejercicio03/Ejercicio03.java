/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

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
        int n = 10;
        int[] numero = new int[n];
        int max = 0;
        int min = n;
        for (int i = 0; i < n; i++) {
            numero[i] = (int) (Math.random() * 10);
            if (numero[i] > max) {
                max = numero[i];
            }
            if (numero[i] < min) {
                min = numero[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + i + " tiene el valor de " + numero[i]);
        }

        System.out.println("El valor maximo es " + max);
        System.out.println("El valor minimo es " + min);
    }

}
