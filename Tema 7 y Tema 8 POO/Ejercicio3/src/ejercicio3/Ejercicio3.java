/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author natgonmer
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ESTADO B3");
        Rectangulo r1 = new Rectangulo(0,0,5,5);
        Rectangulo r2 = new Rectangulo(7,9,2,3);

        /*
        Al aplicar el constructor esto no es necesario al ya aplicarse en el constructor
        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 5;
        r1.y2 = 5;

        r2.x1 = 7;
        r2.y1 = 9;
        r2.x2 = 2;
        r2.y2 = 3;

*/
        
        System.out.println("R1");
        System.out.println("Coordenadas: " + r1.getX1() + " " + r1.getY1() + " " + r1.getX2() + " " + r1.getY2());
        System.out.println("Perimetro: " + (r1.getX1() + r1.getX2() + r1.getY1() + r1.getY2()));
        System.out.println("Area: " + ((r1.getX1() + r1.getX2()) * (r1.getY1() + r1.getY2())));
        System.out.println("");
        System.out.println("R2");
        System.out.println("Coordenadas: " + r2.getX1() + " " + r2.getY1() + " " + r2.getX2() + " " + r2.getY2());
        System.out.println("Perimetro: " + (r2.getX1() + r2.getX2() + r2.getY1() + r2.getY2()));
        System.out.println("Area: " + ((r2.getX1() + r2.getX2()) * (r2.getY1() + r2.getY2())));
    }

}
