/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String frase;
        System.out.println("Escribe una frase");
        frase = teclado.nextLine().toLowerCase().replaceAll("\\s", "");
        String frase1 = "";
        
        for (int i = frase.length()-1; i >= 0; i--) {
            frase1 = frase1 + frase.charAt(i);
        }
        System.out.println(frase1);
        if (frase1.equals(frase)) {
            System.out.println("Son palindromo");
        }
        else {
            System.out.println("No son palindromos");
        }
        
    }
    
}
