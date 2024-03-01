/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author damtarde
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // NUMERO VARIADO
        // Se considera variado si no tiene dos dígitos iguales consecutivos en su representación en base 10
        // Realizar un programa que dado un número nos diga si es o no variado

        int n = 4920;
        int ninicio = n;
        int c1 = 0;
        int c2 = 0;
        boolean variado = true;
        System.out.println("El número es " + n);
        c1 = n % 10;
        n = n / 10;
        while (n > 0)  {
            System.out.println("C1 = " + c1);
            c2 = n % 10;
            System.out.println("C2 = " + c2);
            if (c1 == c2) {
                variado = false;
                break;
            }
            else {
                variado = true;
            }
            c1 = c2;
            System.out.println("");
            n = n / 10;
        }
        if (variado == false) {
            System.out.println("El número " + ninicio +" no es variado");
        }
        else {
            System.out.println("El número " + ninicio + " es variado");
        }

    }

}
