/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad01;

/**
 *
 * @author natgonmer
 */
public class Recursividad01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //factorial
        int n = 5;
        System.out.println("El factorial de " + n + " es " + factorial(n));
    }
    
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        else {
            return n* factorial(n-1);
        }
    }
    
}
