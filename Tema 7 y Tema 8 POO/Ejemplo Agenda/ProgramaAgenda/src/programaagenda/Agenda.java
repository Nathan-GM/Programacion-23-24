/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaagenda;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {

    ArrayList Contacto = new ArrayList();

    public boolean añadirContacto(Contacto c) {
        return false;
    }

    public boolean eliminarContacto(String nombre) {
        Contacto.remove(nombre);
        return false;
    }

    public boolean existeContacto(String nombre) {
        for (Iterator listar = Contacto.iterator(); listar.hasNext();) {
            Contacto list = (Contacto) listar.next();
            if (list.getNombre() == nombre) {
                System.err.println("El nombre " + nombre + " ya existe en tu lista de contactos");
            }
            else {
                System.out.println("El nombre " + nombre + " no existe actualmente en tu lista de contactos");
            }
            return false;
        }
        return true;
    }

    

    public void listarContacto() {
        for (Iterator listar = Contacto.iterator(); listar.hasNext();) {
            Contacto list = (Contacto) listar.next();
            System.out.println("Nombre: " + list.getNombre());
            System.out.println("Telefono: " + list.getTelefono());
        }
    }

    public int buscaContacto(String nombre) {
        int resultado = 0;
        resultado = Contacto.indexOf(nombre);
        return resultado;
    }

}
