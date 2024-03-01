/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author damtarde
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 20;
        int sumapos = 0;
        int sumaneg = 0;
        int signo;
        int[] numero = new int[n];
        for (int i = 0; i < n; i++) {
            numero[i] = (int) (Math.random() * 10);
            signo = (int) (Math.random() * 2);
            if (signo == 0) { //positivo
                numero[i] = numero[i];
            } else { //negativo
                numero[i] = numero[i] * (-1);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Elemento: " + i + " tiene el valor de: " + numero[i]);
            if (numero[i] > 0) {
                sumapos = sumapos + numero[i]; //cada vez que repita el bucle sumapos se suma al nºi
            }
            else {
                sumaneg = sumaneg + numero[i];
            }
        }
        System.out.println("La suma de los positivos es: " + sumapos);
        System.out.println("La suma de los negativos es: " + sumaneg);

    }

}
