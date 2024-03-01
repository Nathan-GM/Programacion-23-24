/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int y;
        int z;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número");
        x = teclado.nextInt();
        System.out.println("Escribe otro número");
        y = teclado.nextInt();
        System.out.println("Escribe un último número");
        z = teclado.nextInt();
        if (x > y && x > z){
            if (y > z){
                System.out.println("El númerox " + x + " es mayor quey " + y + " y " + z);
            }
            else {
                System.out.println("El númerox " + x + " es mayor quez " + z + " y " + y);
            }
        }
        if (y > x && y > z){
            if (x > z){
                System.out.println("El númeroy " + y + " es mayor quex " + x + " y " + z);
            }
            else {
                System.out.println("El númeroy " + y + " es mayor quez " + z + " y " + x);
            }
        }
        
        if (z > x && z > y)
        if (x > y){
                System.out.println("El númeroz " + z + " es mayor quex " + x + " y " + y);
            }
            else {
                System.out.println("El númeroz " + z + " es mayor quey " + y + " y " + x);
            }
        }
    }
