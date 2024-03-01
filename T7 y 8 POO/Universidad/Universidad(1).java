/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author natgonmer
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //declaracion de Scanners, Array de cursos y Array de personas.
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        ArrayList cursos = new ArrayList();
        ArrayList personas = new ArrayList();

        //asignacion de estudiantes
        Estudiante e1 = new Estudiante(0, "2 Febrero 2024", "Aran", 23, "3 marzo 2001"); //rocas
        Estudiante e2 = new Estudiante(1, "3 Febrero 2024", "Diana", 23, "13 abril 2001"); //plantas
        Estudiante e3 = new Estudiante(2, "4 Febrero 2024", "Keyner", 23, "2 julio 2001"); //moda
        Estudiante e4 = new Estudiante(3, "2 Febrero 2024", "Javier", 23, "16 marzo 2001"); //rocas
        Estudiante e5 = new Estudiante(4, "2 Febrero 2024", "Claudia", 23, "18 enero 2001"); //Informatica
        Estudiante e6 = new Estudiante(5, "6 Febrero 2024", "Pepe", 23, "3 mayo 2001"); //Informatica
        Estudiante e7 = new Estudiante(6, "8 Febrero 2024", "Moren", 23, "22 febrero 2001"); //plantas
        Estudiante e8 = new Estudiante(7, "2 Febrero 2024", "Pedro", 23, "7 febrero 2000");//moda
        //asignacion de empleados
        Empleado em1 = new Empleado(0, RoleEmpleado.PERSONAL, "Javier", 32, "4 mayo 1992");
        Empleado em2 = new Empleado(1, RoleEmpleado.ADMINISTRADOR, "Lucia", 30, "14 diciembre 1994");
        Empleado em3 = new Empleado(2, RoleEmpleado.PROFESOR, "Lorenzo", 30, "4 octubre 1994");
        Empleado em4 = new Empleado(3, RoleEmpleado.ADMINISTRADOR, "Juan", 30, "3 mayo 1994");

        //agregamos las personas al array de personas.
        personas.add(e1);
        personas.add(e2);
        personas.add(e3);
        personas.add(e4);
        personas.add(e5);
        personas.add(e6);
        personas.add(e7);
        personas.add(e8);
        personas.add(em1);
        personas.add(em2);
        personas.add(em3);

        //creación de cursos
        Curso c1 = new Curso("Rocas", 0);
        Curso c2 = new Curso("Plantas", 1);
        Curso c3 = new Curso("Moda", 2);
        Curso c4 = new Curso("Informatica", 3);
        //añadimos los cursos al array cursos
        cursos.add(c1);
        cursos.add(c2);
        cursos.add(c3);
        cursos.add(c4);

        //gente en el curso rocas
        c1.personas.add(e1);
        c1.personas.add(e4);
        c1.personas.add(em4);

        //gente en el curso plantas
        c2.personas.add(e2);
        c2.personas.add(e7);
        c2.personas.add(em3);

        //gente en el curso Moda
        c3.personas.add(e8);
        c3.personas.add(e3);
        c3.personas.add(em2);

        //gente en el curso Informática
        c4.personas.add(e5);
        c4.personas.add(e6);
        c4.personas.add(em1);

        int opcion = 0;
        int id = 7;
        
        boolean fin = false;
        System.out.println("Bienvenido al programa de la Universidad creado por Nathan");
        while (fin != true) {
            System.out.println("Por favor, seleccione una opcion");
            System.out.println("\t1. Mostrar información de todas las personas");
            System.out.println("\t2. Matricular en un curso");
            System.out.println("\t3. Mostrar los participantes de un curso");
            System.out.println("\t4. Cerrar programa");
            System.out.print("Opción deseada: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Personas inscritas en la Universidad:");
                    System.out.println("---------------------------------------------------------------------------");
                    for (Iterator mostrar = personas.iterator(); mostrar.hasNext();) {
                        Persona muestra = (Persona) mostrar.next();
                        muestra.mostrarInformacion();
                        System.out.println("---------------------------------------------------------------------------");
                    }
                    break;
                case 2:
                    id++;
                    Estudiante anadir = new Estudiante(id, "", "", 0, "");
                    boolean correcto = false;
                    while (correcto != true) {
                        System.out.println("¿A qué curso desea inscribirse?");
                        System.out.println("Cursos Disponibles: ");
                        System.out.println("\tRocas");
                        System.out.println("\tPlantas");
                        System.out.println("\tModa");
                        System.out.println("\tInformatica");
                        System.out.print("Opción deseada: ");
                        String inscribir = teclado2.nextLine().toLowerCase();
                        switch (inscribir) {
                            case "rocas":
                                anadir.matricularCurso(c1);
                                personas.add(anadir);
                                correcto = true;
                                break;
                            case "plantas":
                                anadir.matricularCurso(c2);
                                personas.add(anadir);
                                correcto = true;
                                break;
                            case "moda":
                                anadir.matricularCurso(c3);
                                personas.add(anadir);
                                correcto = true;
                                break;
                            case "informatica":
                                anadir.matricularCurso(c4);
                                personas.add(anadir);
                                correcto = true;
                                break;
                            default:
                                System.err.println("No existe el curso " + inscribir + " actualmente");
                                break;
                        }
                        System.out.println("");
                    }

                    break;
                case 3:
                    boolean valido = false;
                    while (valido != true) {
                        System.out.println("¿Qué curso desea mostrar?");
                        System.out.println("Cursos Disponibles: ");
                        System.out.println("\tRocas");
                        System.out.println("\tPlantas");
                        System.out.println("\tModa");
                        System.out.println("\tInformatica");
                        System.out.println("Si deseas mostrar todo, escriba TODO");
                        System.out.print("Opción deseada: ");
                        String mostrar = teclado2.nextLine().toLowerCase();
                        switch (mostrar) {
                            case "rocas":
                                c1.mostrarGente();
                                valido = true;
                                break;
                            case "plantas":
                                c2.mostrarGente();
                                valido = true;
                                break;
                            case "moda":
                                c3.mostrarGente();
                                valido = true;
                                break;
                            case "informatica":
                                System.out.println("Implementar");
                                c4.mostrarGente();
                                valido = true;
                                break;
                            case "todo":
                                mostrarGenteCursos(cursos);
                                valido = true;
                                break;
                            default:
                                System.err.println("No existe el curso " + mostrar + " actualmente");
                                break;
                        }
                    }
                    break;
                case 4:
                    fin = true;
                    break;
                default:
                    System.err.println("Opción no valida");
                    break;
            }
        }
        System.out.println("Fin del programa");

    }

    public static void mostrarGenteCursos(ArrayList cursos) {
        for (Iterator prueba = cursos.iterator(); prueba.hasNext();) {
            Curso muestra = (Curso) prueba.next();
            System.out.println("\tCURSO " + muestra.getNombreCurso().toUpperCase());
            for (Iterator participantes = muestra.personas.iterator(); participantes.hasNext();) {
                Persona mostrar = (Persona) participantes.next();
                System.out.println(mostrar.getNombre());
            }
            System.out.println("---------------------------------------------------------------------------");
        }
    }
}
