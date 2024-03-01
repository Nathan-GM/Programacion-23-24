/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String estado = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Que edad tiene?");
        edad = teclado.nextInt();
        if (edad < 28) {
            System.out.println("El cliente es joven");
        }
        else if (edad > 28 && edad < 50) {
            System.out.println("El cliente es de edad media");
        }
        else if (edad > 50) {
            System.out.println("El cliente es de edad avanzada");
        }
        System.out.println("¿Cuál es el estado de salud?");
        estado = teclado.next().toLowerCase();
        switch (estado) {
            case "enfermo" :
                if (edad < 28) {
                    System.out.println("El cliente es joven, enfermo y debe pagar 120€");
                }
                else if (edad > 28 && edad < 50) {
                    System.out.println("El cliente es de edad media, enfermo y debe pagar 140€");
                }
                else if (edad > 50) {
                    System.out.println("No se admiten personas de edad avanzada.");
                }
            break;
            case "sano":
                if (edad < 28) {
                    System.out.println("El cliente es joven y sano, por lo que deberá pagar 100€");
                }
                else if (edad > 28 && edad < 50) {
                    System.out.println("El cliente es de edad media y sano, por lo que deberá pagar 120€");
                }
                else if (edad > 50) {
                    System.out.println("El cliente es de edad avanzada y deberá pagar 140€");
                }
            break;
            default:
                System.out.println("El estado de salud debe de ser Sano o Enfermo");
        }
    }
    
}
