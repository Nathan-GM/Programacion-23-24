/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int y;
        int suma;
        int resta;
        int producto;
        int division;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Di un número");
        x = teclado.nextInt();
        System.out.println("Escribe otro número");
        y = teclado.nextInt();
        suma = x + y;
        System.out.println("La suma de dichos números es " + suma);
        resta = x - y;
        System.out.println("La resta de dichos números es " + resta);
        producto = x * y;
        System.out.println("La multiplicación de dichos números es " + producto);
        if (y == 0)
        {
            System.out.println("No se puede dividir " + x + " entre 0");
            
        }
        else
        {
            division = x / y;
            System.out.println("El resultado de la división es " + division);
        }
    }
    
}
