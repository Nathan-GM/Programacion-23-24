/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el número entero:");         
        n = teclado.nextInt();
        for (int i = 1; i<=n; i++) {
            if (i % 3!=0) {
                System.out.println(i);
            }
        }
    }
    
}
