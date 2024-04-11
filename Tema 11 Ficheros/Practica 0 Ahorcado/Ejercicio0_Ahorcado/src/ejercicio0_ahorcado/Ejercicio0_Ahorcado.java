/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio0_ahorcado;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.Normalizer;

/**
 *
 * @author natgonmer
 */
public class Ejercicio0_Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de Arrays, rutas de fichero y booleanos
        Scanner teclado = new Scanner(System.in);
        boolean cierre = false;
        ArrayList<String> listarPalabras;
        ArrayList<Jugadores> listaJugadores;
        ArrayList<Partidas> listaPartidas;
        String ficheroP = "./src/Recursos/Palabras.txt";
        String ficheroJ = "./src/Recursos/jugadores.txt";
        String ficheroPa = "./src/Recursos/partidas.txt";

        //cargamos los ficheros y los agregamos al arraylist.
        listarPalabras = leerPalabras(ficheroP);
        listaJugadores = leerJugadores(ficheroJ);
        listaPartidas = leerPartidas(ficheroPa);
        //obtenemos una palabra aleatoria de nuestro listado.
        String palabra = obtenerPalabra(listarPalabras);

        while (cierre != true) {
            int opcion = menu(teclado);
            switch (opcion) {
                case 0:
                    System.out.println("Se cierra el programa");
                    cierre = true;
                    break;
                case 1:
                    System.out.println("Por implementar");
                    break;
                case 2:
                    System.out.println("Por implementar");
                    break;
                case 3:
                    System.out.println("Por implementar");
                    break;
                case 4:
                    System.out.println("Por implementar");
                    break;
                case 5:
                    System.out.println("Por implementar");
                    break;
                case 6:
                    System.out.println("Por implementar");
                    break;
                case 7:
                    System.out.println("Por implementar");
                    break;
                case 8:
                    System.out.println("Por implementar");
                    break;
                case 9:
                    System.out.println("Por implementar");
                    break;
            }
        }
    }

    public static int menu(Scanner teclado) {
        System.out.println("\t1. Seleccionar jugadores");
        System.out.println("\t2. Jugar");
        System.out.println("\t3. Elegir palabra");
        System.out.println("\t4. Cambiar fichero de palabras");
        System.out.println("\t5. Ranking (Top 10)");
        System.out.println("\t6. Dar de alta a un jugador");
        System.out.println("\t7. Listar jugadores por orden alfabético");
        System.out.println("\t8. Estadística de todos los jugadores");
        System.out.println("\t9. Asignar puntos por partidas");
        System.out.println("\t0. Cerrar");
        return teclado.nextInt();
    }

    public static ArrayList<String> leerPalabras(String archivo) {
        ArrayList<String> listaPalabras = new ArrayList<>();
        File f = new File(archivo);
        try {
            Scanner leeFichero = new Scanner(f);
            while (leeFichero.hasNext()) {
                String palabra = leeFichero.nextLine();
                listaPalabras.add(palabra);
            }
            System.out.println("Fichero cargado correctamente");
            leeFichero.close();
        } catch (FileNotFoundException error) {
            System.out.println("El fichero no se ha localizado");
            try {
                if (f.createNewFile()) {
                    System.out.println("Se ha creado el fichero " + f.getName());
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return listaPalabras;
    }

    public static ArrayList<Jugadores> leerJugadores(String archivo) {
        ArrayList<Jugadores> listaJugadores = new ArrayList<>();
        try {
            File f = new File(archivo);
            Scanner lector = new Scanner(f);
            while (lector.hasNext()) {
                String linea = lector.nextLine();
                String datos[] = linea.split(";");
                String nombre = datos[0];
                int ganado = Integer.parseInt(datos[1]);
                int perdido = Integer.parseInt(datos[2]);
                int puntos = Integer.parseInt(datos[3]);
                Jugadores nuevo = new Jugadores(nombre, ganado, perdido, puntos);
                listaJugadores.add(nuevo);
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no se ha encontrado");
        }
        return listaJugadores;
    }

    public static ArrayList<Partidas> leerPartidas(String archivo) {
        ArrayList<Partidas> listaPartidas = new ArrayList<>();
        try {
            File f = new File(archivo);
            Scanner lector = new Scanner(f);
            while (lector.hasNext()) {
                String linea = lector.nextLine();
                String datos[] = linea.split(";");
                int np = Integer.parseInt(datos[0]);
                String jugadorPone = datos[1];
                String jugadorAdivina = datos[2];
                String palabra = datos[3];
                String ganador = datos[4];
                Partidas nuevo = new Partidas(np, jugadorPone, jugadorAdivina, palabra, ganador);
                listaPartidas.add(nuevo);
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no se ha encontrado");
        }
        return listaPartidas;
    }

    public static String obtenerPalabra(ArrayList<String> palabras) {
        String palabra = "";
        do {
            int palabraElegida = (int) (Math.random() * palabras.size());
            palabra = palabras.get(palabraElegida);
        } while (palabra.length() < 4);
        return normalizar(palabra);
    }

    public static String normalizar(String palabraSeleccionada) {
        palabraSeleccionada = Normalizer.normalize(palabraSeleccionada, Normalizer.Form.NFD);
        palabraSeleccionada = palabraSeleccionada.replaceAll("[\u0300-\u0301]", "");

        return palabraSeleccionada;
    }

}
