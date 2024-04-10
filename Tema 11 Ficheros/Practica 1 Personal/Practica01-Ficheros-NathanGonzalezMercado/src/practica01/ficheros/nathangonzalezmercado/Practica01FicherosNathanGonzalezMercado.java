/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica01.ficheros.nathangonzalezmercado;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.util.Iterator;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author Natha
 */
public class Practica01FicherosNathanGonzalezMercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Se crean Scanners, Clases y ficheros necesarios para comenzar el programa
        Auxiliar a = new Auxiliar();
        Scanner teclado = new Scanner(System.in);
        File fichero = new File("prueba2.csv");
        Personal p = new Personal();
        //Se añade un try-catch por si no se localiza el fichero poder continuar la ejecución del programa
        try {
            Scanner leeFichero = new Scanner(fichero);
            leeFichero.useDelimiter(",");
            while (leeFichero.hasNext()) {
                String nombre = leeFichero.next();
                String apellido = leeFichero.next();
                String email = leeFichero.next();
                String genero = leeFichero.next();
                String nacimiento = leeFichero.next();
                String pais = leeFichero.next();
                leeFichero.nextLine();
                Persona pf = new Persona(nombre, apellido, email, genero, nacimiento, pais);
                p.addPersona(pf);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra ningún fichero en la ruta habitual, se iniciara sin fichero");
        } catch (NoSuchElementException NSEE) {
            System.out.println("Error: " + NSEE.getMessage());
        }

        boolean correcto;
        do {
            correcto = false;
            try {
                int opcion = menu(teclado);
                if (opcion < 0 || opcion > 7) {
                    throw new NFDR(opcion);
                }
                System.out.println("");
                switch (opcion) {
                    case 0: //cierra programa
                        System.out.println("Gracias por hacer uso de nuestro programa");
                        correcto = false;
                        break;
                    case 1: //busqueda por pais
                        System.out.print("Introduce el pais a buscar: ");
                        String PB = teclado.nextLine();
                        System.out.println("Se buscaran personas del pais: " + PB);
                        p.personasPais(PB);
                        correcto = true;
                        System.out.println("");
                        break;
                    case 2: //borra por correo
                        System.out.println("Introduce el email de la persona a eliminar");
                        String EB = teclado.next();
                        boolean prueba = p.borrarPorEmail(EB);
                        if (prueba == true) {
                            System.out.println("La persona con email " + EB + " fue eliminada correctamente");
                        } else {
                            System.out.println("No se encontro ninguna persona bajo dicho email.");
                        }
                        correcto = true;
                        System.out.println("");
                        break;
                    case 3: //busqueda por fecha
                        boolean valido = false;
                        while (valido != true) {
                            try {
                                System.out.print("Introduce el día: ");
                                int dia = teclado.nextInt();
                                System.out.print("Introduce el mes: ");
                                String mes = teclado.next();
                                String fnac = dia + "_" + mes;
                                System.out.println("Se mostraran todas las personas con la siguiente fecha de nacimiento: " + fnac);

                                //String fnac = teclado.next();
                                p.personasFNac(fnac);
                                break;
                            } catch (InputMismatchException IME) {
                                System.out.println("Has introducido un valor no válido, introducelo de nuevo");
                                teclado.next();
                            }
                        }
                        correcto = true;
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("Se mostrará la persona más joven");
                        //no se-
                        correcto = true;
                        System.out.println("");
                        break;
                    case 5:
                        String path;
                        String file;
                        boolean bien = false;
                        while (bien == false) {
                            System.out.println("¿El fichero esta en la carpeta del proyecto o fuera? (D - F)");
                            String op = teclado.next().toUpperCase();
                            if (op.equals("D")) {
                                System.out.println("Introduce el nombre del fichero");
                                file = teclado.next();
                                a.leerPersonas(file);
                                bien = true;
                            } else if (op.equals("F")) {
                                System.out.println("Introduce la ruta del fichero");
                                teclado.nextLine();
                                path = teclado.nextLine();
                                System.out.println("A continuación, introduce el nombre del fichero");
                                file = teclado.next();
                                String leer = path + "/" + file;
                                a.leerPersonas(leer);
                                bien = true;
                            } else {
                                System.out.println("No es un valor valido, prueba de nuevo.");
                            }
                        }
                        correcto = true;
                        break;
                    case 6:
                        boolean personasValido = false;
                        while (personasValido == false) {
                            try {
                                System.out.print("Introduce cuantas personas deseas registrar:");
                                int personas = teclado.nextInt();
                                personasValido = true;
                                registrarPersonas(personas, teclado);

                            } catch (InputMismatchException IMEE) {
                                System.out.println("El valor otorgado no corresponde a un número, introduce un número por favor.");
                                teclado.next();
                            }
                            correcto = true;

                        }
                        break;
                    case 7:
                        p.muestraTodo();
                        correcto = true;
                        break;
                }
            } catch (NFDR rango) {
                System.out.println(rango.toString());
                System.out.println("");
                correcto = true;
            } catch (InputMismatchException IME) {
                System.out.println("Has introducido un valor no válido, introducelo de nuevo");
                teclado.next();
                correcto = true;
            }

        } while (correcto != false);

    }

    private static int menu(Scanner teclado) {
        System.out.println("\t1. Mostrar datos por pais");
        System.out.println("\t2. Borrar por email");
        System.out.println("\t3. Mostar datos por cumpleaños");
        System.out.println("\t4. Mostrar persona(s) más joven(es) de todas");
        System.out.println("\t5. Leer personas de otro fichero");
        System.out.println("\t6. Guardar Personas en un fichero csv.");
        System.out.println("\t7. Mostrar todo");
        System.out.println("\t0. Salir");
        return teclado.nextInt();
    }

    public static class NFDR extends Exception {

        private int numero;

        NFDR(int numero) {
            this.numero = numero;
        }

        public String toString() {
            return "El número " + this.numero + " esta fuera de rango";
        }
    }

    public static void registrarPersonas(int personas, Scanner teclado) {
        Auxiliar guardar = new Auxiliar();
        ArrayList<Persona> nuevasPersonas = new ArrayList<>();
        boolean valid = false;
        for (int i = 0; i < personas; i++) {
            String fn = "";
            valid = false;
            System.out.println("\tPERSONA " + i);
            System.out.println("---------------------------------------------");
            System.out.print("\tNombre: ");
            String nom = teclado.next();
            System.out.print("\tApellido: ");
            //teclado.next();
            String ape = teclado.next();
            System.out.print("\tEmail: ");
            String ema = teclado.next();
            System.out.print("\tGénero: ");
            String gen = teclado.next();
            while (valid == false) {
                try {
                    System.out.println("\tFecha Nacimiento: ");
                    System.out.print("\t\tDia: ");
                    int dia = teclado.nextInt();
                    System.out.print("\t\tMes: ");
                    String mes = teclado.next();
                    fn = dia + "_" + mes;
                    valid = true;
                } catch (InputMismatchException noNum) {
                    System.out.println("El dia debe introducirse con número");
                    teclado.next();
                }
            }
            System.out.print("\tPaís: ");
            String pais = teclado.next();
            Persona pnueva = new Persona(nom, ape, ema, gen, fn, pais);
            nuevasPersonas.add(pnueva);
        }
        /*
        System.out.println("Recorrido");
        for (Iterator recorre = nuevasPersonas.iterator(); recorre.hasNext();) {
            Persona recorrido = (Persona) recorre.next();
            System.out.println("Nombre: " + recorrido.getNombre());
        }*/
        
        
        guardar.guardarPersonas(nuevasPersonas);
    }

}
