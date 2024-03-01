/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ancho = 0;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escribe el ancho");
        ancho = teclado.nextInt();
        for (int j = 1; j <= ancho; j++) {
            for (int i = 1; i <= j ; i++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

}
