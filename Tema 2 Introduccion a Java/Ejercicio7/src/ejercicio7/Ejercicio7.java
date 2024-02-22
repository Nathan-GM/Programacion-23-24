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
        int valormilla = 1852;
        int milla;
        int metro;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de millas marinas que tienes");
        milla = teclado.nextInt();
        metro = milla * valormilla;
        System.out.println(milla + " millas marinas son " + metro + " metros");
    }
    
}
