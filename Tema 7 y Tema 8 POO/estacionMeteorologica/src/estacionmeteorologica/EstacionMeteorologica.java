/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionmeteorologica;

import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author IEUser
 */
public class EstacionMeteorologica {

    //Nathan Gonzalez Mercado
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // A COMPLETAR POR EL ALUMNO ...
        
        
        Scanner teclado = new Scanner(System.in);
        //Creamos una string en la que introduciremos el nombre del fichero
        String nombreFichero = "";
        System.out.print("Introduce el nombre del fichero y su extension: ");
        nombreFichero = teclado.nextLine();
        //String nombreFichero = "datos.txt";
        //Creamos el objeto GestorMeteo usando el nombre del fichero escrito anteriormente.
        GestorMeteo gestor = new GestorMeteo(nombreFichero);

        //Mostraremos los datos en su estado original
        System.out.println("Se muestra los Datos:");
        gestor.mostrar();
        
        //A continuación se mostrará la fecha en la que hizo mayor temperatura
        System.out.println("--------------------------");
        Momento temp = gestor.mayorTemp();
        System.out.println("La temperatura mas alta:");
        System.out.println("\tMes: " + temp.getMes());
        System.out.println("\tDia: " + temp.getDia());
        System.out.println("\tHora: " + temp.getHora());
        System.out.println("--------------------------");
        //Aquí introduciremos el mes a comprobar pluviosidad
        System.out.print("Introduce el mes a comprobar su pluviosidad media: ");
        int mes = teclado.nextInt();
        //System.out.println("");
        //int mes = 10;
        //Asignamos al double PM el valor que nos devuelve la pluviosidad media del mes 
        double pm = gestor.pluvioMedia(mes);
        //Para acto seguido mostrarla
        System.out.println("En el mes " + mes + " hubo una pluviosidad media de " + pm);
        System.out.println("--------------------------");
        
        //Por ultimo se ordenara de forma temporal las medidas y acto seguido se mostraran
        System.out.println("A continuación se ordenaran temporalmente");
        gestor.ordenarPorMomento();
        gestor.mostrar();
        
    }

}
