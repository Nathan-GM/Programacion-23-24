/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Scanner;

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
        int conta = 0;
        int conte = 0;
        int conti = 0;
        int conto = 0;
        int contu = 0;
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.println("Escribe una frase");
        frase = teclado.nextLine().toLowerCase();
        //System.out.println(frase);

        for (int i = 0; i < frase.length(); i++) {
            //System.out.println(frase.charAt(i));
            switch (frase.charAt(i)) {
                case 'a':
                    conta++;
                    break;
                case 'e':
                    conte++;
                    break;
                case 'i':
                    conti++;
                    break;
                case 'o':
                    conto++;
                    break;
                case 'u':
                    contu++;
                    break;
            }
        }
        System.out.println("Nº de A = " + conta);
        System.out.println("Nº de E = " + conte);
        System.out.println("Nº de I = " + conti);
        System.out.println("Nº de O = " + conto);
        System.out.println("Nº de U = " + contu);
    }

}
