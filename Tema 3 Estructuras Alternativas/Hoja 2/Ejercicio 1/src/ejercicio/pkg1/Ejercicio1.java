/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;
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
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        x = teclado.nextInt();
        System.out.println("El número es " + x);
        if (x % 2 == 0 && x >= 0) {
            System.out.println("Número Par");
        }
        else if (x % 2 != 0 && x > 0){
            System.out.println("Número Impar");
        }
        else {
            System.out.println("No es un número entero positivo");
        }
    }
    
}
