/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testpersonal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Nathan Gonzalez Mercado
 */
public class TestPersonal {

    //Nathan Gonzalez Mercado
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Se crea teclado, el fichero a utilizar y objetos para llamar a auxiliar y personal
        Auxiliar aux = new Auxiliar();
        Scanner teclado = new Scanner(System.in, "UTF-8");
        File fichero = new File("./src/Recursos/personal.csv");
        Personal p = new Personal();
        //Se añade un try-catch por si no se localiza el fichero poder continuar la ejecución del programa
        try {
            //Leeremos el fichero utilizando UTF-8 para que se nos permita el uso de teclas como Ñ correctamente.
            //E iremos almacenando cada persona en el arrayList de personal.
            Scanner leeFichero = new Scanner(fichero, "UTF-8");
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
            leeFichero.close();
            System.out.println("Fichero " + fichero.getName() + " cargado correctamente");
            //Deberemos tener en cuenta distintos errores al leer el fichero
            //Como son que no se localice el fichero o que el valor de alguna persona sea nulo.
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra ningún fichero en la ruta habitual, se iniciara sin fichero");
        } catch (NoSuchElementException NSEE) {
            System.out.println("Error: " + NSEE.getMessage());
        }
        boolean finalizar; //Crearemos el booleano finalizar para indicar cuando el programa terminara
        do {
            finalizar = false;
            //Añadimos el try para que al elegir una opcion en el menu controlar errores
            //Como sería que estes fuera del rango permitido o introducir un valor no valido como por ejemplo una letra.
            try {
                int opcion = menu(teclado);
                if (opcion < 0 || opcion > 7) {
                    throw new NFDR(opcion);
                }
                System.out.println("");
                switch (opcion) {
                    case 0: //cierra programa
                        System.out.println("Gracias por hacer uso de nuestro programa");
                        finalizar = false;
                        break;
                    case 1: //busqueda por pais
                        teclado.nextLine();
                        System.out.print("Introduce el pais a buscar: ");
                        String PB = teclado.nextLine();
                        System.out.println("Se buscaran personas del pais: " + PB);
                        p.personasPais(PB);
                        finalizar = true;
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
                        finalizar = true;
                        System.out.println("");
                        break;
                    case 3: //busqueda por fecha
                        boolean valido = false;
                        while (valido != true) {
                            try {
                                System.out.print("Introduce el día: ");
                                int dia = teclado.nextInt();
                                System.out.print("Introduce el mes (palabra): ");
                                String mes = teclado.next().toLowerCase();
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
                        finalizar = true;
                        System.out.println("");
                        break;

                    case 4:
                        System.out.println("Se mostrará la persona más joven");
                        p.personaJoven();
                        finalizar = true;
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
                                aux.leerPersonas(file);
                                bien = true;
                            } else if (op.equals("F")) {
                                System.out.println("Introduce la ruta del fichero");
                                teclado.nextLine();
                                path = teclado.nextLine();
                                System.out.println("A continuación, introduce el nombre del fichero");
                                file = teclado.next();
                                if (path.endsWith("/") || file.startsWith("/")) {
                                    String leer = path + file;
                                    aux.leerPersonas(leer);
                                } else {
                                    String leer = path + "/" + file;
                                    aux.leerPersonas(leer);
                                }
                                bien = true;
                            } else {
                                System.out.println("No es un valor valido, prueba de nuevo.");
                            }
                        }
                        finalizar = true;
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
                            finalizar = true;

                        }
                        break;
                    case 7:
                        p.muestraTodo();
                        finalizar = true;
                        break;
                }
            } catch (NFDR rango) {
                System.out.println(rango.toString());
                System.out.println("");
                finalizar = true;
            } catch (InputMismatchException IME) {
                System.out.println("Has introducido un valor no válido, introducelo de nuevo");
                teclado.next();
                finalizar = true;
            }

        } while (finalizar != false);
    }

    /**
     * Método que llamará al menu para mostarse por pantalla y solicitar la
     * opción a utilizar
     *
     * @param teclado que nos permitirá registrar nuestra opcion deseada
     * @return Opción del menu deseada para realizar.
     */
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

    /**
     * Clase que nos servirá para controlar la excepción de estar fuera del
     * rango permitido.
     */
    public static class NFDR extends Exception {

        private int numero;

        NFDR(int numero) {
            this.numero = numero;
        }

        public String toString() {
            return "El número " + this.numero + " esta fuera de rango";
        }
    }

    /**
     * Método que nos permitirá registrar personas directamente a un ArrayList
     *
     * @param personas número de personas que deseamos almacenar
     * @param teclado Scanner utilizado para rellenar los valores
     */
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
                    System.out.print("\t\tAño:");
                    int anyo = teclado.nextInt();
                    fn = dia + "_" + mes + "_" + anyo;
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
            guardar.guardarPersonas(nuevasPersonas);
        }
    }
}
