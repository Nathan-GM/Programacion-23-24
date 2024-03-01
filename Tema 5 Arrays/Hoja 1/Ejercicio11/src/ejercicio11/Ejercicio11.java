/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author damtarde
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 100;
        int[] derecho = new int[n];
        int[] inverso = new int[n];
        System.out.println("ORDEN CORRECTO");
        for (int i = 0; i < n; i++) {
            derecho[i] = i;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + i + " equivale al número " + derecho[i]);

        }
        System.out.println("");
        System.out.println("ORDEN INVERSO");
        for (int i = n-1; i > 0; i--) {
            inverso[i] = i;
        }

        for (int i = n-1; i >= 0; i--) {
            System.out.println("Orden inverso " + i + " equivale al número " + inverso[i]);
        }
    }
}
