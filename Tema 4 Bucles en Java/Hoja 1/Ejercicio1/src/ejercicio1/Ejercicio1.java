/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Natha
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=10;
        for (int i=0; i<n; i++) {
            System.out.print(i +1 + " ");
        }
            System.out.print("\n");
        for (int i=0; i<n; i++) {
            System.out.print( (i+1)*2 + " ");
        }
        System.out.print("\n"); 
        for (int i=0; i<n; i++) {
            System.out.print(20 + i * 3 + " ");
        }
        System.out.print("\n");
        for (int i=0; i<n; i++) {
            System.out.print( 10 + i*4 + " ");
        }
        System.out.print("\n");
        for (int i=0; i < n; i++) {
            System.out.print(45 - i*5 + " ");
        }
        System.out.print("\n");
    }
    
}
