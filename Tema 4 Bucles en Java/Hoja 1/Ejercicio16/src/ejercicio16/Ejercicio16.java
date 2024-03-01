/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un número");
        n = teclado.nextInt();
        for (int j=0; j<=n; j++) {
            for (int i=1; i <=(n-j); i++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }  
    }
    
}
