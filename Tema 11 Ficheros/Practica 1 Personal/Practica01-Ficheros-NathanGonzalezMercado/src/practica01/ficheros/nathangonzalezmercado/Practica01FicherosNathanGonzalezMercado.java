/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica01.ficheros.nathangonzalezmercado;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;

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
        //File f = new File("personal.csv");
        Personal p = new Personal();
        Scanner teclado = new Scanner(System.in);
        boolean correcto;
        do {
            correcto = false;
            try {
                int opcion = menu(teclado);
                if (opcion < 0 || opcion > 4) {
                    throw new NFDR(opcion);
                }
                System.out.println("");
                switch (opcion) {
                    case 0:
                        System.out.println("Gracias por hacer uso de nuestro programa");
                        correcto = false;
                        break;
                    case 1:
                        System.out.print("Introduce el pais a buscar: ");
                        String PB = teclado.next();
                        p.personasPais(PB);
                        correcto = true;
                        System.out.println("");
                        break;
                    case 2:
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
                    case 3:
                        boolean valido = false;
                        while (valido != true) {
                            try {
                                System.out.print("Introduce el día: ");
                                int dia = teclado.nextInt();
                                System.out.print("Introduce el mes: ");
                                int mes = teclado.nextInt();
                                String fnac = dia + " " + mes;
                                System.out.println("Se mostraran todas las personas con la siguiente fecha de nacimiento: " + fnac);
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

}
