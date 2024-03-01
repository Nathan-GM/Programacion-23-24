/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x = 1; //si es 1 es igual a e que es igual a = 2.71 2.72 2.81
        double n; //aproximación
        double suma = 0;
        double factorial = 1;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escribe hasta donde quieres calcular");
        n = teclado.nextInt();
        for (int i = 0; i<=n; i++) {
            factorial = 1;
            for (int j = 1; j<=i; j++) {
                factorial = factorial * j;
            }
            //System.out.println(factorial);
            suma = suma + (Math.pow(x,i) / factorial);
        }
        System.out.println("Resultado es " + suma);
    }
    
}
