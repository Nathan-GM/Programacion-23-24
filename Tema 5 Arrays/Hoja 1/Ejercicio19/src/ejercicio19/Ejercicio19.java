/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections; //preguntar sobre esto
/**
 *
 * @author Natha
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n = 8;
        Integer [] puntuacion = new Integer [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce la puntuación del jugador");
            puntuacion[i] = teclado.nextInt();
        }
        Arrays.sort(puntuacion, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            System.out.println("El jugador " + i + " tiene " + puntuacion[i] + " puntos");
        }
    }
    
}
