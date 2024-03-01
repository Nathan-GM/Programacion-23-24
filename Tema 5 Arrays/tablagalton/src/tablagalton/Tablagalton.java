/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablagalton;

import java.util.Scanner;

/**
 *
 * @author Natha
 */
public class Tablagalton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //BOLAS
        int n = 0; //cantidad de bolas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de bolas");
        n = teclado.nextInt(); // introducir bolas por teclado

        //SLOTS
        int ranuras = 0; // slots en los que cae la bola
        System.out.println("Introduce el número de slots");
        ranuras = teclado.nextInt(); //introducir ranuras por teclado

        //creación de array de slots
        int[] slots = new int[ranuras];

        //bucle que hara que se repita para cada bola
        for (int i = 0; i < n; i++) {
            //contador de las bolas que cae en un slot
            int cbolas = 0;
            // bucle que hará que dicha bola pase por todos los slots
            for (int j = 0; j <(ranuras - 1); j++) {
                // 50 / 50 de si va derecha o izquierda
                if ((int) (Math.random()*2) >= 1) {
                    cbolas++;
                }
            }
            slots[cbolas]++;

        }
        for (int i = 0; i < ranuras; i++) {
            System.out.println("El slot " + i + " tiene " + slots[i] + " bolas");
        }
    }

}
