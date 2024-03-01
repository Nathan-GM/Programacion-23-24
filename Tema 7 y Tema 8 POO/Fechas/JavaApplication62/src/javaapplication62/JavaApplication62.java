/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication62;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author natgonmer
 */
public class JavaApplication62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String fecha = "";
        System.out.println("Introduce tu fecha de nacimiento (DD/MM/AAAA)");
        fecha = teclado.nextLine();
        
        String[]partesFecha = fecha.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);
        int anyo = Integer.parseInt(partesFecha[2]);
        
        LocalDate fn = LocalDate.of(anyo, mes, dia);
        
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fn, ahora);
        
        System.out.println("Usted nacio hace:");
        System.out.println("\tAños: " + periodo.getYears());
        System.out.println("\tMeses: " + periodo.getMonths());
        System.out.println("\tDias: " + periodo.getDays());
        
    }
    
}
