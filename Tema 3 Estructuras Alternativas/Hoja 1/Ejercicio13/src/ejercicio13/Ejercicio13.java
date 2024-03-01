/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
/**
 *
 * @author Natha
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x;
        double y;
        double z;
        x = (int) (Math.random()* 10) + 1;
        y = (int) (Math.random()* 10) + 1;
        z = (int) (Math.random()* 10) + 1;
        if (x > y && x > z) {
            if (y > z) {
                System.out.println(x + ", " + y + ", " + z);
            }
            else{
                System.out.println(x + ", " + z + ", " + y);
            }
        }
        else if (y > x && y > z) {
            if (x > z) {
                System.out.println(y + ", " + x + ", " + z);
            }
            else {
                System.out.println(y + ", " + z + ", " + x);
            }
        }
        else if (z > x && z > y) {
            if (x > y) {
                System.out.println(z + ", " + x + ", " + y);
            }
            else {
                System.out.println(z + ", " + y + ", " + x);
            }
        }
    }
    
}
