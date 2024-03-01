/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x;
        double resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame la x");
        x = teclado.nextInt();
        if (x > 0) {
            resultado = Math.pow(x, 3) - Math.pow(x,2) + 6;
            System.out.println("F(" + x + ") es igual a " + resultado);
        }
        else if (x == 0) {
            resultado = -5;
            System.out.println("F(" + x + ") es igual a " + resultado);
        }
        else if (x < 0) {
            resultado = Math.sqrt(Math.abs((Math.pow(x, 3))-x));
            System.out.println("F("+ x + ") es igual a " + resultado);
        }
    }
}
