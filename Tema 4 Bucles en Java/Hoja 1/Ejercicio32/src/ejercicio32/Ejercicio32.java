/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Dado 10 deberá devolver 3.628.800
        Scanner teclado = new Scanner(System.in);
        int factorial = 1;
        int n = 0;
        System.out.println("Escribe el número del que queremos factorial");
        n = teclado.nextInt();
        System.out.println("Queremos el factorial de " + n);
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + n + " es " + factorial );
        
    }
    
}
