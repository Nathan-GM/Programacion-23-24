/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     * Ejercicio 1 -> Crear programa que pida una String por teclado y luego muestre cada palabra de la cadena en linea distintas
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String texto;
        System.out.println("Introduce una cadena de texto");
        texto = teclado.nextLine();
        System.out.println("");
        String[] palabras = texto.split(" ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
    
}
