/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2_ranking_nombres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Natha
 */
public class Practica2_Ranking_Nombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        boolean cierre = false;
        do {
            int opcion = menu(teclado);
            switch (opcion) {
                case 1:
                    System.out.print("Introdizca el año: ");
                    int anyo = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Introdizca el sexo (M o F): ");
                    String sexo = teclado.nextLine().toUpperCase();
                    System.out.print("Introdizca el nombre: ");
                    String nombre = teclado.nextLine();
                    if (sexo.equals("F")) {
                        nombre = nombre + " ";
                    }
                    buscar(anyo, sexo, nombre);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("\t\t\tFEMENINO \t\t\tMasculino");
                    System.out.println("-------------------------------------------------------------------------------------");
                    System.out.println("Año \tRank1 \tRank2 \tRank3 \tRank4 \tRank5 \tRank1 \tRank2 \tRank3 \tRank4 \tRank5");
                    ranking();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("No implementado");
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Gracias por hacer uso de nuestro sistema");
                    cierre = true;
            }
        } while (cierre != true);

    }

    public static int menu(Scanner teclado) {
        System.out.println("\tPOPULARIDAD NOMBRE DE BEBES");
        System.out.println("\t\t1.Buscar por Año, Sexo y Nombre");
        System.out.println("\t\t2.Tabla top 5 niños y niñas de cada año");
        System.out.println("\t\t3.10 primeros niños y niñas acumulando los datos de los 10 años (que?)");
        System.out.println("\t\t0.Salir del programa.");
        return teclado.nextInt();
    }

    private static void buscar(int anyo, String sexo, String nombre) {
        boolean localizado = false;
        String localizacion = "./src/recursos/";
        String fichero = localizacion + "babynamesranking" + anyo + ".txt";
        File f = new File(fichero);
        try {
            Scanner recorreFichero = new Scanner(f);
            while (recorreFichero.hasNext() || localizado != true) {
                String lineaActual = recorreFichero.nextLine();
                String[] datos = lineaActual.split("\t");
                //int posicion = Integer.parseInt(datos[0]);
                String posicion = datos[0];
                String nombreM = datos[1];
                String nombreF = datos[3];
                if (sexo.equals("M")) {
                    if (nombreM.equals(nombre)) {
                        localizado = true;
                        System.out.println(nombre + " está clasificado #" + posicion + " en el año " + anyo);

                    }
                } else if (sexo.equals("F")) {
                    if (nombreF.equals(nombre)) {
                        localizado = true;
                        System.out.println(nombre + " está clasificado #" + posicion + " en el año " + anyo);
                    }
                }

            }
            recorreFichero.close();
            if (localizado == false) {
                System.out.println("El nombre " + nombre + " no esta clasificado en el año " + anyo);
            }
        } catch (FileNotFoundException error) {
            System.out.println("Fichero no encontrado");
        }
    }

    //Sale deforme, probar con una matriz
    private static void ranking() {
        String localizacion = "./src/recursos/";
        for (int anyos = 2010; anyos > 2000; anyos--) {
            String fichero = localizacion + "babynamesranking" + anyos + ".txt";
            File f = new File(fichero);
            String[] datosAnyo = new String[11];
            datosAnyo[0] = "" + anyos;
            try {
                Scanner recorreFichero = new Scanner(f);
                for (int i = 1; i < 6; i++) {
                    String lineaActual = recorreFichero.nextLine();
                    String[] datos = lineaActual.split(" \t");
                    String nombreF = datos[2];
                    datosAnyo[i] = nombreF;
                }
                //datosAnyo[5] = datosAnyo[5] + "\t";
                recorreFichero.close();
                Scanner recorreFicheroM = new Scanner(f);
                for (int i = 6; i < 11; i++) {
                    String lineaActual = recorreFicheroM.nextLine();
                    String[] datos = lineaActual.split("\t");
                    String nombreM = datos[1];
                    datosAnyo[i] = nombreM;
                }
                recorreFicheroM.close();

                for (int i = 0; i < 1; i++) {
                    for (int j = 0; j < datosAnyo.length; j++) {
                        System.out.print(datosAnyo[j] + "\t");
                    }
                    System.out.println("");

                }
                System.out.println("");

            } catch (FileNotFoundException error) {
                System.out.println("Fichero no encontrado");
            }
        }
    }

}
