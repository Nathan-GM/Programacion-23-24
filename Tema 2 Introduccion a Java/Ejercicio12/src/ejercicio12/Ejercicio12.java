/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float r;
        float u;
        float a;
        float n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el valor del primer termino");
        a = teclado.nextInt();
        System.out.println("Escribe la cantidad de terminos");
        n = teclado.nextInt();
        System.out.println("Escribe el termino enesimo");
        u = teclado.nextInt();
        r = (u - a) / (n-1);
        System.out.println("La razón entre dos terminos es = " + r);
        System.out.println("Ahora en lugar de calcular la razon, se calculara el enesimo termino");
        System.out.println("En esta ocasión, el primer termino será 1, la cantidad de terminos 87 y la razón será de 3");
        a = 1;
        n = 87;
        r = 3;
        u = a + (n-1) * r;
        System.out.println("U = " + u);
    }
    
}
