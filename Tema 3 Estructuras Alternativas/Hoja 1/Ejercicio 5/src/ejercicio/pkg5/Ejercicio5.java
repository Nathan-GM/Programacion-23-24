/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int y;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número");
        x = teclado.nextInt();
        System.out.println("Escribe otro número");
        y = teclado.nextInt();
        if ( x == y)
        {
            System.out.println("Los números son iguales");
        }
        else if (x > y)
        {
            System.out.println(x + " es mayor que " + y);
        }
        else
        {
            System.out.println(y + " es mayor que " + x);
        }
    }
    
}
