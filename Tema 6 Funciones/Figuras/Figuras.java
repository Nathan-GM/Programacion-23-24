/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    
    public static int calc(int n) {
        
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int qfig = 0;
        int rfig = 0;
        int factorialQfig = 0;
        int facttorialRfig = 0;
        int RQ = 0;
        int resultado = 0;
        System.out.println("¿Cuantas figuras quieres?");
        qfig = teclado.nextInt();
        System.out.println("¿Cuantas figuras quedan? (máximo)");
        rfig = teclado.nextInt();
        System.out.println("¿Cúantas maneras hay de coger " + qfig + " figutas de las " + rfig + " que quedan?");
        
        for (int i = 0; i <= rfig; i++) {
            factorialQfig = calc(qfig);
            facttorialRfig = calc(i);
            RQ = calc(qfig -i);
            resultado = factorialQfig / (facttorialRfig * RQ);
            System.out.println(factorialQfig + "/ (" + facttorialRfig + " - " + RQ + ") = " + resultado);
        }
/*
        factorialQfig = calc(qfig);
        facttorialRfig = calc(rfig);
        RQ = calc((qfig-rfig));
        resultado = factorialQfig / (facttorialRfig * RQ);
        System.out.println("Operacion: " + qfig + "! / " + rfig + "! ( " + rfig + " - " + qfig + ")!" );
        System.out.println(factorialQfig + " / (" + facttorialRfig + " * " + RQ + ")");
        System.out.println("Resultado: " + resultado);
*/
    }
    
}
