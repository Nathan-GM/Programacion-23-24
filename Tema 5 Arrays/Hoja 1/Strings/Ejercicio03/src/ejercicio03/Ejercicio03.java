/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);        
        String nom = "";
        System.out.println("Escribe el nombre");
        nom = teclado.nextLine();
        String ap1 = "";
        System.out.println("Escribe el primer apellido");
        ap1 = teclado.nextLine();
        String ap2 = "";
        System.out.println("Escribe el segundo apellido");
        ap2 = teclado.nextLine();
        String fin = nom.substring(0,3).toUpperCase() + ap1.substring(0,3).toUpperCase() + ap2.substring(0,3).toUpperCase();
        System.out.println(fin);

    }
    
}
