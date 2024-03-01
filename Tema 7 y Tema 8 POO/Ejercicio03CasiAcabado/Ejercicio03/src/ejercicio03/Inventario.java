/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author natgonmer
 */
public class Inventario {

    private ArrayList animales = new ArrayList();

    // Muestra el tipo y nombre de los animales
    public void tipoNombreAnimales() {
        if (animales.size() != 0) {
            int contp = 0;
            int contg = 0;
            int contl = 0;
            int contc = 0;
            int total = 0;
            for (Iterator cont = animales.iterator(); cont.hasNext();) {
                Mascotas contadores = (Mascotas) cont.next();
                if (contadores.tipo().equals("Perro")) {
                    contp++;
                } else if (contadores.tipo().equals("Gato")) {
                    contg++;
                } else if (contadores.tipo().equals("Loro")) {
                    contl++;
                } else if (contadores.tipo().equals("Canario")) {
                    contc++;
                }
            }
            total = contp + contg + contl + contc;
            System.out.println("Tienes un total de " + total + " animales (" + contp + " Perros, " + contg + " Gatos, " + contl + " Loros y " + contc + " Canarios" );
            /*
            System.out.println("Hay " + contp + " perros");
            System.out.println("Hay " + contg + " gatos");
            System.out.println("Hay " + contl + " loros");
            System.out.println("Hay " + contc + " canarios");
*/
            System.out.println("-------------------------------------------------");
            for (Iterator tino = animales.iterator(); tino.hasNext();) {
                Mascotas recorrido = (Mascotas) tino.next();
                recorrido.muestraTipoNombre();
                System.out.println("-------------------------------------------------");
            }
        }
        else {
            System.out.println("No tienes animales en el Inventario (Esto parece más un simulador de tráficante que un programa de grado superior kdfhsgnsf)");
        }

    }

    // Muestra ??? preguntar que debería hacer
    public void mostrarConcreto(String nombre) {
        for (Iterator recorre = animales.iterator(); recorre.hasNext();) {
            Mascotas concreta = (Mascotas) recorre.next();
            if (concreta.tipo().equals(nombre)) {
                concreta.muestra();
                System.out.println("-------------------------------------------------");
            }
        }
    }

    // Muestra todos los datos de todos los Animales
    public void mostrarTodos() {
        if (animales.size() <= 0) {
            System.out.println("No tienes animales");
        } else {
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            for (Iterator todo = animales.iterator(); todo.hasNext();) {
                Mascotas lis = (Mascotas) todo.next();
                lis.muestra();
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
            }
        }

    }

    // Añade un animal al ArrayList Mascotas
    public boolean insertar(Mascotas m1) {
        animales.add(m1);
        return true;
    }

    // Elimina un animal al ArrayList Mascotas
    public boolean borrar(String nombre) {
        int indice = 0;
        for (Iterator borrar = animales.iterator(); borrar.hasNext();) {
            Mascotas ind = (Mascotas) borrar.next();
            if (ind.nombre.equals(nombre)) {
                indice = animales.indexOf(ind);
            }
        }

        animales.remove(indice);
        return true;
    }

    // Vacia el ArrayList
    public void vacio() {
        System.out.println("\tSe ha vaciado el inventario");
        animales.clear();

    }
}
