/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hora;
        int minuto;
        int segundo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la hora");
        hora = teclado.nextInt();
        System.out.println("Escribe los minutos");
        minuto = teclado.nextInt();
        System.out.println("Escribe los segundos");
        segundo = teclado.nextInt();
        segundo++;
        if (segundo >= 60){
            segundo = 0;
            minuto++;
        } 
        if (minuto >= 60){
                minuto = 0;
                hora++;
        }
        if (hora >= 24)
            hora = 00;
        System.out.println("la hora es: " + hora + ":" + minuto + ":" + segundo );
            
        // TODO code application logic here
    }
    
}
