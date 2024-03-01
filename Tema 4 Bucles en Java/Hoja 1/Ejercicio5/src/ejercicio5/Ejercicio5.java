/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Haz un programa que vaya leyendo números y mostrándolos por pantalla hasta
        //que el usuario introduzca un número negativo. En ese momento, el programa mostrará un
        //mensaje de despedida y finalizará su ejecución.
        int n;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Escribe un número");
            n = teclado.nextInt();
        }
        while (n >= 0);
        System.out.println("El número " + n +  " ha sido negativo");
        System.out.println("Ahora este programa finalizará su ejecución. Hasta luego");
    }
    
}
