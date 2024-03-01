/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String uno;
        System.out.println("Escribe una cadena");
        uno = teclado.next().toLowerCase();
        String dos;        
        System.out.println("Escribe otra cadena");
        dos = teclado.next().toLowerCase();
        if (uno.equals(dos)) {
            System.out.println("Las 2 Strings coinciden");
        }
        else {
            System.out.println("Las cadenas no coinciden");
        }
        
    }
    
}
