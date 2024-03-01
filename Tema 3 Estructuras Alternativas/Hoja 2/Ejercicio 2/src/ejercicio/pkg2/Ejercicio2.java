/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2;

/**
 *
 * @author damtarde
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lado1;
        int lado2;
        int lado3;
        int area1;
        int area2;
        int area3;
        System.out.println("Cuadrado 1");
        lado1 = (int) (Math.random() * 20 +1);
        System.out.println("Lado: " + lado1);
        area1 = lado1 * lado1;
        System.out.println("Area: " + area1);
        
        System.out.println("Cuadrado 2");
        lado2 = (int) (Math.random() * 20 +1);
        System.out.println("Lado: " + lado2);
        area2 = lado2 * lado2;
        System.out.println("Area: " + area2);
        
        System.out.println("Cuadrado 3");
        lado3 = (int) (Math.random() * 20 +1);
        System.out.println("Lado: " + lado3);
        area3 = lado3 * lado3;
        System.out.println("Area: " + area3);
        
        if (area1 > area2 && area1 > area3) {
            System.out.println("El cuadrado 1 es mayor");
        }
        else if (area2 > area1 && area2 > area3) {
            System.out.println("El cuadrado 2 es mayor");
        }
        else if (area3 > area2 && area3 > area1) {
            System.out.println("El cuadrado 3 es mayor");
        }
        else if (area1 == area2 || area1 == area3 || area2 == area3) {
            System.out.println("Hay más de un cuadrado igual");
        }
    }
    
}
