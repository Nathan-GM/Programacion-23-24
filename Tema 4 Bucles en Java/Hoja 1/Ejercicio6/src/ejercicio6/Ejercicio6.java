/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Haz un programa que vaya leyendo números y mostrándolos por pantalla hasta
        //que el usuario introduzca un número negativo. En ese momento, el programa mostrará por pantalla
        // el número mayor de cuantos haya visto
        int n;
        int max = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Escribe un número");
            n = teclado.nextInt();
            if (n > max) {
                max = n;
            }
        }
        while (n >= 0);
        System.out.println("El número " + n +  " ha sido negativo");
        System.out.println("El número más alto ha sido " + max);
        System.out.println("Ahora este programa finalizará su ejecución. Hasta luego");
    }
}
