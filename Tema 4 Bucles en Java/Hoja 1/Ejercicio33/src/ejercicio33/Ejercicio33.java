/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio33;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        System.out.println("Escribe un número");
        n = teclado.nextInt();
        System.out.println("Numero a calcular = " + n);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("El numero " + n + " es primo");
                break;
            }
            else {
                System.out.println("No es un número primo");
                break;
            }
        }
    }
    
}
