/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número");
        dia = teclado.nextInt();
        switch (dia) {
            case 1:
                System.out.println("El dia " + dia + " corresponde al lunes");
            break;
            case 2:
                System.out.println("El dia " + dia + " corresponde al Martes");
            break;
            case 3: 
                System.out.println("El dia " + dia + " corresponde al Miércoles");
            break;
            case 4:
                System.out.println("El dia " + dia + " corresponde al Jueves");
            break;
            case 5:
                System.out.println("El dia " + dia + " corresponde al Viernes");
            break;
            case 6:
                System.out.println("El dia " + dia + " corresponde al Sábado");
            break;
            case 7:
                System.out.println("El dia " + dia + " corresponde al Domingo");
            break;
            default:
                System.out.println("Este número no corresponde a ningún dia de la semana");
        }
    }
    
}
