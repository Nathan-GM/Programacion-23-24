/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio4 {

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
       
        System.out.println("Escribe numero");
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextInt();
        System.out.println("Escribe otro numero");
        y = teclado.nextInt();
        suma = x + y;
        resta = x - y;
        producto = x * y;
        division = x / y;
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + producto);
        System.out.println("El resultado de la división es: " + division);
    }
    
}
