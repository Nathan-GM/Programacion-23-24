/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaquijote;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jabue
 */
public class PruebaQuijote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Lista<Pila> lista = new Lista();
        Pila<String> pila = new Pila();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre de fichero: ");
        String nombreFichero = teclado.nextLine().trim();
        nombreFichero = nombreFichero + ".txt";

        int palabras = leerFichero(nombreFichero, lista, pila);
        System.out.println("Total de palabras: " + palabras);
        lista.listar();
    }

    public static int leerFichero(String nomFich, Lista lista, Pila pila) throws FileNotFoundException {
        // A COMPLETAR POR EL ALUMNO ...
        System.out.println("");
        int total = 0;
        Scanner f = new Scanner(new File(nomFich)).useLocale(Locale.US);
        while (f.hasNext()) {
            String linea = f.nextLine();
            String[] partes = linea.split(" ");
            total += partes.length;
            for (String parte : partes) {
                //System.out.print(parte+" ");
                pila.Crear(parte);
                
            }
            //System.out.println("");
            lista.Crear(pila);
            pila = new Pila();
        }
        f.close();
        return total;
    }
}
