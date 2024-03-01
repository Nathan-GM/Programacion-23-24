/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;

/**
 *
 * @author Natha
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio;
        double altura;
        double acirc;
        double arect;
        double atotal;
        double vol;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el radio del cilindro");
        radio = teclado.nextDouble();
        System.out.println("Escribe la altura del cilindro");
        altura = teclado.nextDouble();
        
        acirc = 2 * Math.PI * Math.pow(radio, 2);
        arect = 2 * Math.PI * radio * altura;
        atotal = acirc + arect;
        vol = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("Area total: " + atotal);
        System.out.println("Volumen: " + vol);
    }
    
}
