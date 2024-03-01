/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        int c;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un lado");
        a = teclado.nextInt();
        System.out.println("Escribe el segundo lado");
        b = teclado.nextInt();
        System.out.println("Escribe el tercer lado");
        c = teclado.nextInt();
        if (a < b+c && b < a+c && c < a+b) {
            if(a==b && b==c && a==c) {
                System.out.println("Este es un triangulo equilátero");
            }
            else if (a!=b && b!=c && a!=c) {
                System.out.println("Este triangulo es escaleno");
            }
            else if (a==b || b==c || a==c) {
                System.out.println("Este triangulo es isósceles");
            }
        }
        else {
            System.out.println("Con estos números no se puede formar un triangulo");
        }
    }
    
}
