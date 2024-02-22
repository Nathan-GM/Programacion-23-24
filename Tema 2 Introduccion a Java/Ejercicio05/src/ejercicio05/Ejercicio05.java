/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;
import java.util.Scanner;
/**
 *
 * @author damtarde
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce radio");
        Scanner teclado = new Scanner(System.in);
        int radio;
        radio = teclado.nextInt();
        double area;
        double circunferencia;
        double volumen;
        area = Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;
        volumen = (4.0 / 3) * Math.PI * Math.pow(radio, 3);
        System.out.println("Area es " + area);
        System.out.println("Circunferencia es " + circunferencia);
        System.out.println("Volumen es " + volumen);
    }
    
}
