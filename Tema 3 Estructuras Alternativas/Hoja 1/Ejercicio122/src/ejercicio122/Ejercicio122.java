/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio122;
import java.util.Scanner;
/**
 *
 * @author Natha
 */
public class Ejercicio122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        int mes;
        int anyo;
        int diasfeb = 28;
        int maxdias = 31;
        boolean valido;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escribe el dia");
        dia = teclado.nextInt();
        System.out.println("Escribe el mes");
        mes = teclado.nextInt();
        System.out.println("Escribe el año");
        anyo = teclado.nextInt();
        if (anyo % 4 == 0 && anyo % 100 !=0 || anyo % 400 == 0) {
            System.out.println("Año bisiesto");
            diasfeb = 29;
         }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            maxdias = 30;
        }
        else if (mes == 2) {
            maxdias = diasfeb;
        }
        else {
            maxdias = 31;
        }
        if (mes >=1 && mes <=12) {
            if (dia >= 1 && dia <=maxdias) {
                valido = true;
            }
            else {
                valido = false;
            }
        }
        else {
            valido = false;
        }
        if (valido) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anyo +" es valida");
        }
        else {
            System.out.println("Esta no es una fecha valida");
        }
    }
    
}
