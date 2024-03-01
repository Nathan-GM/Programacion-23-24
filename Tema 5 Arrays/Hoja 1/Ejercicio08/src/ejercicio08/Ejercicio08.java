/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        double r = 0.0;
        int n = 100;
        double [] numero = new double[n];
        for (int i = 0; i < n; i++) {
            numero[i] = (Math.random());
        }
        System.out.println("Introduce un numero real (Entre 0.0 y 1.0)");
        r = teclado.nextDouble();
        for (int i = 0; i < n; i++) {
           if (r <= numero [i]) {
               contador++;
           }
        }
        System.out.println("Hay " + contador + " numeros superiores o iguales al tuyo");
    }

}
