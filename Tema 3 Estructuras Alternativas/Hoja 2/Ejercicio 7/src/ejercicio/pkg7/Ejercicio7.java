/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7;
import java.util.Scanner;
/**
 *
 * @author David_Gamer - FX
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anyo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un año");
        anyo = teclado.nextInt();
        if (anyo % 4 == 0 && anyo % 100 != 0 | anyo % 400 == 0) {
            System.out.println("El año " + anyo + " es bisiesto");
        }
        else {
            System.out.println("El año " + anyo + " no es bisiesto");
        }
    }
    
}
