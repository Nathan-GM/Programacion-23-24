/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int y;
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int arribax;
        int abajox;
        int arribay;
        int abajoy;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe valores para las variables: A, B, C, D, E y F");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        e = teclado.nextInt();
        f = teclado.nextInt();
        arribax = (c*e)-(b*f);
        abajox = (a*e)-(b*d);
        if (abajox == 0){
            System.out.println("No se puede calcular la x");
        }
        else {
            x = arribax / abajox;
            System.out.println("X es igual a: " + x);
        }
        arribay = (a*f) - (c*d);
        abajoy = (a*e) - (b*d);
        if (abajoy == 0) {
            System.out.println("No se puede calcular la y");
        }
        else {
            y = arribay / abajoy;
            System.out.println("Y es igual a " + y);
        }
    }
    
}
