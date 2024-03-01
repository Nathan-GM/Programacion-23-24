/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a;
        double b;
        double c;
        double x;
        double x1;
        double x2;
        double discriminante = 0;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dame el numero a");
        a = teclado.nextDouble();
        System.out.println("Dame el número b");
        b = teclado.nextDouble();
        System.out.println("Dame el número c");
        c = teclado.nextDouble(); 
        if (a == 0) {
            if (b == 0 && c != 0) {
                // Imposible
                System.out.println("Los números: " + a + " , " + b + " y " + c + " no obtienen solución" );
            }
            else if (b == 0 && c == 0){
                // infinitas soluciones
                System.out.println("Tiene infinitas soluciones");
            }
            else if (b != 0) {
                // primer grado con una solución real
                x = -c/b;
                System.out.println("Se trata de una ecuación de primer grado con solución " + x );
            }
        }
        else if (a != 0) {
            discriminante = (Math.pow(b,2)- (4*a*c));
            System.out.println("El discriminante es " + discriminante);
            if (discriminante == 0) {
                // una solucion real
                x = ((-b) - Math.sqrt(discriminante)) / (2*a);
                System.out.println("Aqui tenemos una unica solución real la cuál es " + x);
            }
            else if (discriminante >= 0) {
                // soluciones reales
                x1 = ((-b) - Math.sqrt(discriminante)) / (2*a);
                x2 = ((-b) + Math.sqrt(discriminante)) / (2*a);
                System.out.println("Las soluciones reales posibles son " + x1 + " y " + x2);
            }
            else {
                // soluciones complejas
                x1 = ((-b) - Math.sqrt(discriminante)) / (2*a);
                x2 = ((-b) + Math.sqrt(discriminante)) / (2*a);
                System.out.println("El resultado de esta ecuación son soluciones complejas");
            }
        }
    }
    
}
