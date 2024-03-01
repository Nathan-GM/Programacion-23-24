/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número entero:");
        n = teclado.nextInt();
        int i = 0;
        while (i<=n) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    
}
