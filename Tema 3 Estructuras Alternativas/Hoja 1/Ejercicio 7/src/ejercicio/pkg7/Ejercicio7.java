/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int nota;
        System.out.println("Escribe la nota:");
        nota = teclado.nextInt();
        if (nota < 3){
            System.out.println("Muy deficiente");
        }
        else if (nota < 5) {
            System.out.println("Insuficiente");
        }
        else if (nota <= 6) {
            System.out.println("Bien");
        }
        else if (nota < 9) {
            System.out.println("Notable");
        }
        else if (nota <= 10) {
            System.out.println("Sobresaliente");
        }
        else if (nota > 10) {
            System.out.println("La nota debe ser un número entre el 1 y el 10");
        }
    }
    
}
