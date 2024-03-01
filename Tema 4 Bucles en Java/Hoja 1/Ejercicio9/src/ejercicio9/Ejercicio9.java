/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int suma = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la cantidad de nº naturales que quieres sumar");
        n = teclado.nextInt();
        System.out.println("Forma FOR");
        for (int i=0; i<=n; i++) {
            suma = suma + i;
        }
        System.out.println(suma +" suma de nº naturales");
        System.out.println("Forma WHILE");
        int i = 0;
        suma = 0;
            while (i<=n) {
            suma = suma + i;
            i++;
        }
        System.out.println(suma +" suma de nº naturales"); 
       
    }
    
}
