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
        // TODO code application logic here
        int max;
        int cont = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la cantidad de Nº que quieres mostrar");
        max = teclado.nextInt();
        System.out.println("Forma con FOR");
        for (int i = 1; i<=max; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Forma con WHILE");
        while (cont <= max) {
            System.out.print(cont + " "); {
            cont++;
            }
        }
        System.out.println("");
    }
    
}
