/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author damtarde
 */
import java.util.Scanner;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lado;
        int area;
        System.out.println("Escribe un numero");
        Scanner teclado = new Scanner(System.in);
        
        lado = teclado.nextInt();
        
        area = lado * lado;
        
        System.out.println("Area:" + area);
    }
    
}
