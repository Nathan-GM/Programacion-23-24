/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30;

/**
 *
 * @author Natha
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Debe hacerse la siguiente figura:
        * * * * * * * * *
        * * * *   * * * *
        * * *       * * *
        * *           * *
        *               *
        
         */
        int alto = 5;
        System.out.println("Altura = " + alto);
        for (int altura = 1; altura <= alto; altura++) {
            for (int i = 1; i <= (alto-altura); i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
