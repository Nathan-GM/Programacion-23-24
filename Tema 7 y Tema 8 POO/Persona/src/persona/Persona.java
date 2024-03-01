/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;

import java.util.Scanner;

/**
 *
 * @author Natha
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Estado Actual: D2");
        Personaa p1 = new Personaa("12345678A", "Amicia", "De Rune", 18);
        Personaa p2 = new Personaa("12345678B", "Hugo", "De Rune", 8);
        Personaa p3 = new Personaa("12345678C", "Beatrice", "De Rune", 65);

        /*
        COMO PARTE DEL A2 debes introducir los datos a mano
        En el B2 los añades al crearlos siendo esto innecesario por ahora
        
        System.out.println("PERSONA 1");
        System.out.println("Introduce el nombre de la primera persona");
        p1.nombre = teclado.nextLine();
        System.out.println("Introduce su apellido");
        p1.apellidos = teclado.nextLine();
        System.out.println("Introduce su DNI");
        p1.dni = teclado.nextLine();
        System.out.println("Introduce su edad");
        p1.edad = teclado.nextInt();

        System.out.println("PERSONA 2");
        System.out.println("Introduce el nombre de la segunda persona");
        p2.nombre = teclado.nextLine();
        System.out.println("Introduce su apellido");
        p2.apellidos = teclado.nextLine();
        System.out.println("Introduce su DNI");
        p2.dni = teclado.nextLine();
        System.out.println("Introduce su edad");
        p2.edad = teclado.nextInt();
         */
 /*
        Pasa a no ser necesario en el apartado D2 al crear los metodos imprime y mayor edad
        
        if (p1.getEdad() >= 18) {
            System.out.println(p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDni() + " es mayor de edad (" + p1.getEdad() + ")");
        } else {
            System.out.println(p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDni() + " NO es mayor de edad (" + p1.getEdad() + ")");
        }

        if (p2.getEdad() >= 18) {
            System.out.println(p2.getNombre() + " " + p2.getApellidos() + " con DNI " + p2.getDni() + " es mayor de edad (" + p2.getEdad() + ")");
        } else {
            System.out.println(p2.getNombre() + " " + p2.getApellidos() + " con DNI " + p2.getDni() + " NO es mayor de edad (" + p2.getEdad() + ")");
        }
         */
        p2.setEdad(9);
        System.out.println("");
        System.out.println("Prueba Setter cambiando edad a 9 (Apartado C2)");
        System.out.println(p2.getNombre() + " " + p2.getApellidos() + " con DNI " + p2.getDni() + " NO es mayor de edad (" + p2.getEdad() + ")");

        System.out.println("");
        System.out.println("Apartado D2");
        System.out.println("");
        p1.imprime();
        p2.imprime();
        p3.imprime();
        System.out.println("");
        System.out.println("Entre " + p1.getNombre() + " y " + p2.getNombre() + " hay " + p1.diferenciaEdad(p2) + " años de diferencia");
    }

}
