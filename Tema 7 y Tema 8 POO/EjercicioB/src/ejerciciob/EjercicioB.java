/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciob;

/**
 *
 * @author natgonmer
 */
public class EjercicioB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("12345678A", "Amicia", "De Rune", 18);
        Persona p2 = new Persona("12345678B", "Hugo", "De Rune", 8);
        Persona p3 = new Persona("12345678C", "Beatrice", "De Rune", 66);
        
        p1.imprime();
        p2.imprime();
        p3.imprime();
        
        System.out.println("La diferencia de edad entre " + p1.getNombre() + " y " + p2.getNombre() + " es de " + p1.diferenciaEdad(p2));
    }

}
