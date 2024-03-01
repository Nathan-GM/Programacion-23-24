/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author natgonmer
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Scanners y variables necesarias.
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Menu simple");
        int opcion = 0;
        int add = 0;
        String nombre = "";
        int edad = 0;
        String estado = "";
        String nacimiento = "";
        boolean addcorrecto = false;
        boolean correcto = false;
        boolean caracteristica = false;
        boolean vuelo = false;

        //animales de prueba con distintos valores
        Perro p1 = new Perro("Juana", 9, "Embarazada", "2 febrero", "Husky", false);
        Perro p2 = new Perro("Manolo", 3, "Vivo", "4 febrero", "dalmata", true);
        Gato g1 = new Gato("Amarillo", false, "Ruby", 6, "Sano ('to gordo)", "4 febrero");
        Gato g2 = new Gato("Negro", true, "Bercha", 4, "Sano (aun más gordo)", "5 febrero");
        Loro l1 = new Loro("Brasil", true, "Rosa", true, "Lucky", 6, "Sano", "3 octubre");
        Loro l2 = new Loro("Corea", false, "Morado", true, "Pipo", 7, "Sano", "4 octubre");
        Loro l3 = new Loro("Japon", true, "Rojo", false, "Popi", 9, "Herido", "5 octubre");
        Loro l4 = new Loro("Rusia", false, "Amarillo", false, "Zarya", 6, "Herida", "6 octubre");
        Canario c = new Canario("Rosa", true, "Morado", true, "Pupi", 2, "Sano", "1 enero");
        Canario c2 = new Canario("Rojo", true, "Azul", false, "Pipu", 2, "Sano", "2 enero");
        Canario c3 = new Canario("Verde", false, "Marron", true, "UwU", 2, "Sano", "3 enero");
        Canario c4 = new Canario("Dorado", false, "Gris", false, "OwO", 2, "Sano", "4 enero");

        Inventario i1 = new Inventario();

        i1.insertar(p1);
        i1.insertar(p2);
        i1.insertar(g1);
        i1.insertar(g2);
        i1.insertar(l1);
        i1.insertar(l2);
        i1.insertar(l3);
        i1.insertar(l4);
        i1.insertar(c);
        i1.insertar(c2);
        i1.insertar(c3);
        i1.insertar(c4);

        boolean fin = false;
        while (fin != true) {
            System.out.println("\t1. Mostar lista de animales (Nombre y Tipo)");
            System.out.println("\t2. Mostrar todos los datos de un animal concreto");
            System.out.println("\t3. Mostrar todos los datos de todos los animales");
            System.out.println("\t4. Añadir animales en el inventario");
            System.out.println("\t5. Eliminar animales del inventario.");
            System.out.println("\t6. Vaciar inventario");
            System.out.println("\t7. Salir.");
            System.out.println("\t8. Cosas que faltan");
            System.out.print("Opción deseada: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    i1.tipoNombreAnimales();
                    break;
                case 2:
                    System.out.println("Introduce el tipo de animal a buscar");
                    String comprobar = teclado2.nextLine();
                    i1.mostrarConcreto(comprobar);
                    break;
                case 3:
                    System.out.println("Inventario de animales");
                    i1.mostrarTodos();
                    break;
                case 4:
                    addcorrecto = false;
                    while (addcorrecto != true) {
                        System.out.println("Añadir animales al inventario");
                        System.out.println("¿Que tipo deseas añadir? (1. Perro | 2. Gato | 3. Loro | 4. Canario)");
                        add = teclado.nextInt();
                        if (add < 1 || add > 4) {
                            System.err.println("Opción no valida");
                        } else {
                            addcorrecto = true;
                        }
                    }
                    System.out.println("Introduce el nombre");
                    nombre = teclado2.nextLine();
                    System.out.println("Introduce su edad");
                    edad = teclado.nextInt();
                    System.out.println("¿Cuál es su estado?");
                    estado = teclado2.nextLine();
                    System.out.println("Introduce su fecha de nacimiento");
                    nacimiento = teclado2.nextLine();
                    correcto = false;
                    switch (add) {
                        case 1: //Perros
                            System.out.println("¿Qué raza es?");
                            String raza = teclado2.nextLine();
                            while (correcto != true) {
                                System.out.println("¿Tiene pulgas? (Y o N)");
                                String pulgastexto = teclado.nextLine().toUpperCase();
                                switch (pulgastexto) {
                                    case "Y":
                                        caracteristica = true;
                                        correcto = true;
                                        break;
                                    case "N":
                                        caracteristica = false;
                                        correcto = true;
                                        break;
                                    default:
                                        System.err.println("Opción no valida");
                                }
                            }
                            Perro crearp = new Perro(nombre, edad, estado, nacimiento, raza, caracteristica);
                            i1.insertar(crearp);
                            break;
                        case 2: //Gatos
                            System.out.println("¿Que color de pelo tiene?");
                            String color = teclado2.nextLine();
                            while (correcto != true) {
                                System.out.println("¿Tiene pelo largo? (Y o N)");
                                String pelotexto = teclado.nextLine().toUpperCase();
                                switch (pelotexto) {
                                    case "Y":
                                        caracteristica = true;
                                        correcto = true;
                                        break;
                                    case "N":
                                        caracteristica = false;
                                        correcto = true;
                                        break;
                                    default:
                                        System.err.println("Opción no valida");
                                }
                            }
                            Gato crearg = new Gato(color, caracteristica, nombre, edad, estado, nacimiento);
                            i1.insertar(crearg);
                            break;
                        case 3: //Loro
                            System.out.println("¿Cuál es el color del pico?");
                            String pico = teclado2.nextLine();
                            while (correcto != true) {
                                System.out.println("¿Puede volar? (Y o N)");
                                String vuelatexto = teclado.nextLine().toUpperCase();
                                switch (vuelatexto) {
                                    case "Y":
                                        vuelo = true;
                                        correcto = true;
                                        break;
                                    case "N":
                                        vuelo = false;
                                        correcto = true;
                                        break;
                                    default:
                                        System.err.println("Opción no valida");
                                }
                            }
                            correcto = false;
                            System.out.println("¿Cuál es su origen?");
                            String origen = teclado2.nextLine();
                            while (correcto != true) {
                                System.out.println("¿Puede hablar? (Y o N)");
                                String hablatexto = teclado.nextLine().toUpperCase();
                                switch (hablatexto) {
                                    case "Y":
                                        caracteristica = true;
                                        correcto = true;
                                        break;
                                    case "N":
                                        caracteristica = false;
                                        correcto = true;
                                        break;
                                    default:
                                        System.err.println("Opción no valida");
                                }
                            }

                            Loro crearl = new Loro(origen, caracteristica, pico, vuelo, nombre, edad, estado, nacimiento);
                            i1.insertar(crearl);

                            break;
                        case 4: //canario
                            System.out.println("¿Cuál es el color del pico?");
                            pico = teclado2.nextLine();
                            while (correcto != true) {
                                System.out.println("¿Puede volar? (Y o N)");
                                String vuelatexto = teclado.nextLine().toUpperCase();
                                switch (vuelatexto) {
                                    case "Y":
                                        vuelo = true;
                                        correcto = true;
                                        break;
                                    case "N":
                                        vuelo = false;
                                        correcto = true;
                                        break;
                                    default:
                                        System.err.println("Opción no valida");
                                }
                            }
                            correcto = false;
                            System.out.println("¿Qué color tiene?");
                            String colorpluma = teclado.nextLine();
                            while (correcto != true) {
                                System.out.println("¿Puede cantar? (Y o N)");
                                String cantatexto = teclado.nextLine().toUpperCase();
                                switch (cantatexto) {
                                    case "Y":
                                        caracteristica = true;
                                        correcto = true;
                                        break;
                                    case "N":
                                        caracteristica = false;
                                        correcto = true;
                                        break;
                                    default:
                                        System.err.println("Opción no valida");
                                }
                            }
                            Canario c1 = new Canario(colorpluma, caracteristica, pico, vuelo, nombre, edad, estado, nacimiento);
                            i1.insertar(c1);
                            break;
                    }
                    System.out.println("Animal agregado correctamente");
                    break;
                case 5:
                    System.out.println("Introduce el nombre a borrar");
                    String borrar = teclado2.nextLine();
                    i1.borrar(borrar);
                    break;
                case 6:
                    System.out.println("Animales eliminados correctamente (suena muy cruel, lo se-)");
                    i1.vacio();
                    break;
                case 7:
                    fin = true;
                    break;
                case 8:
                    System.out.println("\tCosas que faltan por implementar actualmente:");
                    System.out.println("\t1. Mascotas -> Cumpleaños, que hacer con ello y como utilizarlo");
                    System.out.println("\t2. Masctoas -> Morir, que hacer con ello y como utilizarlo");
                    System.out.println("\t3. Mascotas, Perro y Gato -> Habla, que hacer con ello y como utilizarlo");
                    System.out.println("\t4. Aves (por ende Loro y Canario) -> Volar, que hacer con ello y como usarlo");
                    System.out.println("\t5. Loro -> Saluda, que hacer con ello y como usarlo");
                    System.out.println("\t6. Canario -> Habla, que hacer con ello y como usarlo");
                    System.out.println("Esta lista se ira actualizando continuamente durante el desarrollo.");
                    System.out.println("");
                    break;

                default:
                    System.err.println("Opción no valida");
                    break;
            }
        }
        System.out.println("Fin menu.");
    }

}
