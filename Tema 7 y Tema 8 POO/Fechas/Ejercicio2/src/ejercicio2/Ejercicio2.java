/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author natgonmer
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String fn = "";
        int nDias = 0;
        System.out.println("Introduce la fecha (DD/MM/AAAA)");
        fn = teclado.nextLine();
        System.out.println("Intrdocue el número de dias");
        nDias = teclado.nextInt();

        String fecha[] = fn.split("/");
        int dia = Integer.parseInt(fecha[0]);
        int mes = Integer.parseInt(fecha[1]);
        int anyo = Integer.parseInt(fecha[2]);

        LocalDate fechaIntroducida = LocalDate.of(anyo, mes, dia);

        System.out.println("Que quieres hacer? (1. Sumar | 2. Restar)");
        {
            int opcion = teclado.nextInt();
            LocalDate resultado;
            switch (opcion) {
                case 1:

                    System.out.println("La fecha tras sumar " + nDias + " dias a la fecha " + fn + " es:");
                    resultado = fechaIntroducida.plusDays(nDias);
                    System.out.println("\tDias: " + resultado.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    break;
                case 2:

                    System.out.println("La fecha tras restar " + nDias + " dias a la fecha " + fn + " es:");
                    resultado = fechaIntroducida.minusDays(nDias);
                    System.out.println("\tDias: " + resultado.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    break;
            }
        }

    }

}
