/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int horas;
        double tarifan = 20;
        double tarifae = tarifan * 1.5;
        double salario = 0;
        double impuestos = 0.0;
        double totalimp = 0.0;
        double salarion;
        System.out.println("Escriba la cantidad de horas trabajadas");
        horas = teclado.nextInt();
        if (horas > 35){
            salario = salario + (horas - 35) * tarifae;
            salario = salario + (35 * tarifan);
        }
        else {
            salario = salario + (horas * tarifan);
        }
        if (salario > 900){
            impuestos = (salario - 900)*45/100;
            impuestos = impuestos + (400*25/100);
            totalimp = impuestos;
        }
        else if (salario > 500) {
            impuestos = impuestos + ((salario - 500) * 25/100);
            totalimp = totalimp + impuestos;
        }
    salarion = salario - totalimp;
    System.out.println("El salario bruto es de: " + salario);
    if (totalimp >= 1){
        System.out.println("Los impuestos son: " + totalimp);
    }
    else{
        System.out.println("Este trabajador no paga impuestos");
    }
    System.out.println("El salario neto es: " + salarion);
    }
}
