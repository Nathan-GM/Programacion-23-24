/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Haz un programa que muestre la tabla de multiplicar de un número 
        //introducido por teclado por el usuario.
        int n;
        int max =10;
        int mult = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el número del que quieres sacar la tabla de multiplicar");
        n = teclado.nextInt();
        for(int i=0; i <=max; i++) {
            mult = i*n;
            System.out.print(mult + " ");
        }
        System.out.println("");
    }
    
}
