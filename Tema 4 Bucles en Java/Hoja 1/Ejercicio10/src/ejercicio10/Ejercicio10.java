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
        // TODO code application logic here
        double n;
        double suma = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el número N");
        n = teclado.nextInt();
        
        System.out.println("Serie 1.5");
        for (double i = 1; i <= n; i++) {
            suma = suma + (1/i);
        }
        System.out.println("Resultado: " + suma);
        System.out.println("");
        System.out.println("Serie 1.6");
        suma = 0;
        for (double i = 1; i<=n; i++) {
            suma = suma + Math.pow(i, 2);
        }
        System.out.println("Resultado: " + suma);
        System.out.println("");
        System.out.println("Serie 1.7");
        suma = 0;
        for (double i = 1; i<=n; i++) {
            suma = suma + (1/Math.pow(2, i));
        }
        System.out.println("Resultado: " + suma);
        System.out.println("");
        System.out.println("Serie 1.8");
        suma = 0;
        for (double i=1; i<=n; i++) {
            suma = suma + (i/Math.pow(2,i));
        }
        System.out.println("Resultado: " + suma);
    }
    
}
