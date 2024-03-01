/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad02;

/**
 *
 * @author natgonmer
 */
public class Recursividad02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //potensia
        int n = 6; //numero
        int m = 4; //potensia;
        
        System.out.println("El número " + n + " elevado a " + m + " es igual a " + potensia(n, m));
    }
    
    public static int potensia(int n, int m) {
        if (m == 0) {
            return 1;
        }
        else {
            return n * (potensia(n, m-1));
        }
    }
    
}
