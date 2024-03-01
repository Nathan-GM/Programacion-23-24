/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Natha
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=10;
        for (int i=1; i <= n; i++){
            System.out.print(i*i + " ");
        }
        System.out.println("");
        for (int i=1; i <=n; i++) {
            System.out.print(i*i + 1 +" ");
        }
        System.out.println("");
        for (int i=1; i <=n; i++) {
            System.out.print((int)Math.pow(i+1,3) + " ");
        }
        System.out.println("");
        for (int i=1; i<=n; i++) {
            System.out.print(i*(i+1) +" ");
        }
        System.out.println("");
        for(int i=1; i<=n; i++) {
            System.out.print((int) Math.pow(10,(i-1)) +" ");
        }
        System.out.println("");
        for (int i=1; i<=n; i++) {
            System.out.print(1 / Math.pow(10,i-1)  + " ");
        }
        System.out.println("");
        for (int i=1; i<=n; i++) {
            System.out.print((int)Math.pow(-1,i) + " ");
        }
        System.out.println("");
    }
    
}
