/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01.ficheros.nathangonzalezmercado;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author Natha
 */
public class Personal {

    ArrayList<Persona> personas;

    //Constructor
    
    public Personal() {
        this.personas = new ArrayList<>();
    }
     
    public void addPersona(Persona agregar) {
        personas.add(agregar);
        System.out.println(agregar.getNombre() + " ha sido agregado correctamente a la lista de personal");
    }

    public boolean borrarPorEmail(String email) {
        //recorrer arraylist comparando emails, si coinciden borrar.
        int indice = 0;
        for (Iterator reco = personas.iterator(); reco.hasNext();) {
            Persona recorrido = (Persona) reco.next();
            if (recorrido.getEmail() == email) {
                indice = personas.indexOf(recorrido);
                personas.remove(indice);
                return true;
            }
        }

        return false;

    }

    public void personasPais(String pais) {
        for (Iterator reco = personas.iterator(); reco.hasNext();) {
            Persona recorrido = (Persona) reco.next();
            if (recorrido.getPais() == pais) {
                recorrido.toString();
            }
        }
    }

    public void personasFNac(String fechaNac) {
        for (Iterator reco = personas.iterator(); reco.hasNext();) {
            Persona recorrido = (Persona) reco.next();
            if (recorrido.getNacimiento()== fechaNac) {
                recorrido.toString();
            }
        }
    }

}
