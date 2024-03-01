/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

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
        int n = (int) (Math.random()*10000 + 1);
        //int n = 9929;
        int paquetes6 = 0;
        int paquetes9 = 0;
        int paquetes13 = 0;
        int totalpaquetes = 0;
        System.out.println("¿Puedo comprar " + n + " chocolatinas?");
        for (int i = 0; i <= n / 6; i++) {
            for (int j = 0; j <= n / 9; j++) {
                for (int k = 0; k <= n / 13; k++) {
                    if (i * 6 + j * 9 + k * 13 == n) {
                        paquetes6 = i;
                        paquetes9 = j;
                        paquetes13 = k;
                        totalpaquetes = i + j + k;
                    }
                }
            }
        }
        if (totalpaquetes == 0) {
            System.out.println("No se pueden comprar " + n + " chocolatinas");
        } else {
            System.out.println("Se pueden comprar " + n + " chocolatinas usando " + paquetes6 + " paquetes de 6, " + paquetes9 + " paquetes de 9 y " + paquetes13 + " paquetes de 13");
        }
    }
}

