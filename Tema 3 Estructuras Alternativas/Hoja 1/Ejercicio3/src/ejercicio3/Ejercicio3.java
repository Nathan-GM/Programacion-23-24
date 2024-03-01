/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escribe un número");
        x = teclado.nextInt();
        if (x >= 0)
        {
            System.out.println("El número " + x + " es positivo.");
        }
        else
        {
            System.out.println("El número " + x + " es negativo");
        }
    }
    
}
