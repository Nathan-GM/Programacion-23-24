/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base; //columnas
        int altura; //filas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame la base");
        base = teclado.nextInt();
        System.out.println("Dime la altura");
        altura = teclado.nextInt();
        for (int filas=1; filas<=altura; filas++){
            for (int columna=1;columna<=base; columna++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
