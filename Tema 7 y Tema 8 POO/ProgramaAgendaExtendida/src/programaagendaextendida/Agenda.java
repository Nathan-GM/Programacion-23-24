/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaagendaextendida;

/**
 *
 * @author natgonmer
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {

    static ArrayList contactos = new ArrayList();

    public static boolean añadirContacto(Contacto c) {
        contactos.add(c);
        return true;
    }

    public static boolean eliminarContacto(String nombre) {
        //debo obtener el index y mandar dicho index a remove.
        int index = 0;
        index = buscaContacto(nombre);
        contactos.remove(index);
        return true;
    }

    public static boolean existeContacto(String nombre) {
        boolean existe = false;

        for (Iterator listar = contactos.iterator(); listar.hasNext();) {
            Contacto list = (Contacto) listar.next();
            //System.out.println("Nombre: " + list.getNombre());
            if (list.getNombre().equals(nombre)) {
                existe = true;
                break;
            }
        }
        if (existe == true) {
            return true;
        } else {
            return false;
        }

    }

    public static void listarContacto() {
        System.out.println("Tienes " + contactos.size() + " contactos");
        int cont = 1; //TEMP
        System.out.println("PERSONAS");
        
        for (Iterator listar = contactos.iterator(); listar.hasNext();) {
            Contacto lis = listar.next();
            System.out.println("------------------------");
            System.out.println("CONTACTO " + cont);
            lis.toString();
            cont++;
        }
        
        

    }
    public static int buscaContacto(String nombre) {
        int index = 0;
        for (Iterator buscar = contactos.iterator(); buscar.hasNext();) {
            Contacto bus = (Contacto) buscar.next();
            if (bus.getNombre().equals(nombre)) {
                index = contactos.indexOf(bus);
            }
        }
        return index;
    }
}
