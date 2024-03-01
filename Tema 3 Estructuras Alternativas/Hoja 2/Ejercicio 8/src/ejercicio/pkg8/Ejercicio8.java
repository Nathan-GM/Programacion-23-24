/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8;
import java.util.Scanner;
/**
 *
 * @author David_Gamer - FX
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        int mes;
        int anyo;
        int maxdias;
        boolean valido;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un día");
        dia = teclado.nextInt();
        System.out.println("Introduce un mes");
        mes = teclado.nextInt();
        System.out.println("Introduce un año");
        anyo = teclado.nextInt();
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            maxdias = 30;
        }
        else if (mes == 2) {
            maxdias = 28;
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
