/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Calcula equivalente entre edad humana y perro
        // 2 primeros de perro = 10,5 H
        // los siguientes 1 = 4 H
        double edad;
        double perro = 10.5;
        double edadf = 0;
        double edadp = 0;
        String nombre ="";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la edad");
        edad = teclado.nextDouble();
        System.out.println("¿A quien corresponde la edad? (Perro o Humano)");
        nombre = teclado.next().toLowerCase();
        System.out.println("Es " + nombre + " y tiene " + edad);
        switch (nombre) {
            case "perro" :
                if (edad >= 2) {
                    edadf = (perro * 2) + (edad - 2)*4;
                    System.out.println(edad + " años de perro equivalen a " + edadf + " años humanos");
                }
                else if (edad <= 1) {
                    edadf = perro;
                    System.out.println(edad + " años de perro equivalen a " + edadf + " años humanos");
                }
            break;
            case "humano" :
                if (edad >= 21) {
                    edadf = (21 / perro) + ((edad-21)/4);
                    System.out.println(edad + " años humanos son " + edadf + " años de perro");
                }
                else if ( edad < 21) {
                    edadf = edad / perro;
                    System.out.println(edad + " años humanos son " + edadf + " años de perro");
                }
            break;
            default :
                System.out.println("Debe ser Humano o Perro");
        }
    } 
}
