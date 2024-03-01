/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author damtarde
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
        /*
        Necesarios:
            1. Alturas
            2. Cantidad de alturas a recoger (n)
            3. Altura minima
            4. Altura máxima
            5. Altura media
        Cuantas personas por encima de la media
        Cuantas personas debajo de media
         */
        //Creación variables y Array
        
        Scanner teclado = new Scanner(System.in);
        int n = 5;
        double min = 3.0;
        double max = 0.0;
        double media = 0.0;
        double sumaalt = 0.0;
        double[] cantidad = new double[n];
        int encima = 0;
        int debajo = 0;
        
        //Primer bucle, elementos del array
        
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce una altura");
            cantidad[i] = teclado.nextDouble();
            if (cantidad[i] < min) {
                min = cantidad[i];
            }
            if (cantidad[i] > max) {
                max = cantidad[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            //System.out.println("La altura de " + i + " es " + cantidad[i] + " metros");
            sumaalt = sumaalt + cantidad[i];
        }
        System.out.println("La altura máxima es " + max);
        System.out.println("La altura minima es " + min);
        media = sumaalt / n;
        System.out.println("La altura media es " + media);
        
        for (int i = 0; i < cantidad.length; i++) {
            if (cantidad[i] > media) {
                encima++;
            }
            if (cantidad[i] < media) {
                debajo++;
            }
        }
        System.out.println("Gente encima de la media " + encima);
        System.out.println("Gente debajo de la media " + debajo);
        
    }

}
