/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01.ficheros.nathangonzalezmercado;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

/**
 *
 * @author Natha
 */
public class Auxiliar {

    public static void leerPersonas(String ruta) {
        boolean correcto = false;
        while (correcto != true) {
            try {
                File f = new File(ruta);
                Scanner fichero = new Scanner(f);
                fichero.useDelimiter(",");
                System.out.println("-----------------------------");
                while (fichero.hasNext()) {
                    String nombre = fichero.next();
                    String apellido = fichero.next();
                    String email = fichero.next();
                    String genero = fichero.next();
                    String nacimiento = fichero.next();
                    String pais = fichero.next();
                    fichero.nextLine();
                    Persona crea = new Persona(nombre, apellido, email, genero, nacimiento, pais);
                    System.out.println(crea.toString());
                    System.out.println("-----------------------------");
                }
                fichero.close();
                correcto = true;
            } catch (FileNotFoundException FNFE) {
                System.out.println("El fichero no se ha encontrado en la ruta");
                correcto = true;
            }
        }

    }

    public void guardarPersonas(ArrayList personas) {
        Scanner teclado = new Scanner(System.in);
        FileWriter escritura;
        boolean OK = false;
        System.out.print("Introduce la ruta del fichero: ");
        String ruta = teclado.nextLine();
        System.out.print("Introduce el nombre del fichero: ");
        String fichero = teclado.next();
        String localizacion = ruta + "/" + fichero;
        File registrar = new File(localizacion);
        if (registrar.exists()) {
            while (OK == false) {
                System.out.println("El fichero existe, ¿desea sobreescribirlo? (Y - N)");
                String eleccion = teclado.next().toUpperCase();
                if (eleccion.equals("Y")) {
                    System.out.println("Se sobreescribirá el fichero");
                    try {
                        escritura = new FileWriter(registrar, false);
                        for (Iterator recorre = personas.iterator(); recorre.hasNext();) {
                            Persona recorrido = (Persona) recorre.next();
                            escritura.write("" + recorrido.getNombre());
                            escritura.write(",");
                            escritura.write("" + recorrido.getApellido());
                            escritura.write(",");
                            escritura.write("" + recorrido.getEmail());
                            escritura.write(",");
                            escritura.write("" + recorrido.getGenero());
                            escritura.write(",");
                            escritura.write("" + recorrido.getNacimiento());
                            escritura.write(",");
                            escritura.write("" + recorrido.getPais());
                            escritura.write(",");
                            escritura.write("\n");
                        }
                        escritura.close();
                        System.out.println("Fichero escrito correctamente");
                    } catch (IOException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
                    OK = true;
                } else if (eleccion.equals("N")) {
                    System.out.println("No se sobreescribira el fichero");
                    try {
                        escritura = new FileWriter(registrar, true);
                        for (Iterator recorre = personas.iterator(); recorre.hasNext();) {
                            Persona recorrido = (Persona) recorre.next();
                            escritura.write("" + recorrido.getNombre());
                            escritura.write(",");
                            escritura.write("" + recorrido.getApellido());
                            escritura.write(",");
                            escritura.write("" + recorrido.getEmail());
                            escritura.write(",");
                            escritura.write("" + recorrido.getGenero());
                            escritura.write(",");
                            escritura.write("" + recorrido.getNacimiento());
                            escritura.write(",");
                            escritura.write("" + recorrido.getPais());
                            escritura.write(",");
                            escritura.write("\n");
                        }
                        escritura.close();
                        System.out.println("Fichero escrito correctamente");
                    } catch (IOException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
                    OK = true;
                } else {
                    System.out.println("Opción no valida, introduzca 'Y' para sobreescribir o 'N' para mantener lo anterior ");
                }
            }

        }

    }

}
