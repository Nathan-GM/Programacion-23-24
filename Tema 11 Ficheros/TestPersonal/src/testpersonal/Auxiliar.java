/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpersonal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.time.LocalTime;

/**
 *
 * @author Natha
 */
//Nathan Gonzalez Mercado
public class Auxiliar {

    /**
     * Método que nos permitirá leer Personas dessde un fichero externo y
     * distinto al nuestro habitual.
     *
     * @param ruta Corresponde a la ruta donde se localiza nuestro fichero.
     */
    public static void leerPersonas(String ruta) {
        boolean correcto = false;
        while (correcto != true) {
            try {
                File f = new File(ruta);//Crearemos un fichero usando la ruta obtenida
                Scanner fichero = new Scanner(f); //Tras ello un scanner que lea el fichero
                fichero.useDelimiter(","); //Usaremos como delimitador comas, que es la forma de separar cada apartado del fichero.
                System.out.println("-----------------------------");
                while (fichero.hasNext()) {
                    String nombre = fichero.next();
                    String apellido = fichero.next();
                    String email = fichero.next();
                    String genero = fichero.next();
                    String nacimiento = fichero.next();
                    String pais = fichero.next();
                    fichero.nextLine();
                    Persona crea = new Persona(nombre, apellido, email, genero, nacimiento, pais); //creamos una persona nueva con los datos almacenados
                    System.out.println(crea.toString());//Y la mostramos por pantalla.
                    System.out.println("-----------------------------");
                }
                fichero.close();//cerramos el Scanner una vez terminada la lectura.
                correcto = true;
            } catch (FileNotFoundException FNFE) {
                //Si no se encuentra ningun fichero atraparemos la excepción para evitar que se cierre el programa.
                System.out.println("El fichero no se ha encontrado en la ruta");
                correcto = true;
            }
        }

    }

    /**
     * Método que nos permitirá guardar un ArrayList de personas en un nuevo
     * fichero. Dicho fichero se registrara dentro del proyecto en /src/Recursos
     * bajo el nombre personal_Fecha_Hora.csv donde Fecha y Hora serán las
     * fechas y horas correspondientes en el momento de creación Fecha sigue la
     * siguiente estructura: DD/MM/AA Hora sigue la siguiente estructura:
     * HH/MM/SS
     *
     * @param personas ArrayList de personas a guardar en el fichero.
     */
    public void guardarPersonas(ArrayList personas) {
        //Creamos un FileWritter para poder escribir en el fichero
        //Así como la fecha y hora actuales
        FileWriter escritura;
        boolean OK = false;
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        //Registramos la ruta donde se guardará el fichero, la cual es /src/Recursos dentro de este proyecto
        String ruta = "./src/Recursos";
        //Y registramos el nombre que tendra nuestro fichero acorde a las instrucciones del ejercicio.
        String fichero = "personal_" + fecha.getDayOfMonth() + "-" + fecha.getMonthValue() + "-" + fecha.getYear() + "_" + hora.getHour() + "-" + hora.getMinute() + "-" + hora.getSecond() + ".csv";
        //Creamos la localización y un Fichero registrar que usará dicha ruta.
        String localizacion = ruta + "/" + fichero;
        File registrar = new File(localizacion);
        try {
            //dado que el fichero no va a existir dado los parametros de fecha hora, crearemos un fichero.
            registrar.createNewFile();
            escritura = new FileWriter(registrar);
            for (Iterator recorre = personas.iterator(); recorre.hasNext();) {
                Persona recorrido = (Persona) recorre.next();
                //Dada la persona en ese momento guardaremos sus datos separados por comas
                //añadiendo finalmente un salto de línea para agregar más personas si fuera necesario.
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
    }
}
