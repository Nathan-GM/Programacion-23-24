/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio37;

/**
 *
 * @author Natha
 */
public class Ejercicio37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int i;
        int j;
        for (numero = 10; numero < 20; numero++) {
            for (i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    j = numero / i;
                    System.out.println("numero , '=', i, ' x ', j");
                    System.out.println(numero + " = " + i   *  j);
                    break;
                }
                else {
                    System.out.println(numero + " es un número primo");
                }
            }
        }

    }

}
