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

    /**
     * Se agrega una persona al arrayList
     *
     * @param agregar Persona a agregar al arrayList.
     */
    public void addPersona(Persona agregar) {
        this.personas.add(agregar);
        System.out.println(agregar.getNombre() + " ha sido agregado correctamente a la lista de personal");
    }

    /**
     * Eliminará la persona en base al correo introducido.
     *
     * @param email Correo que deseamos eliminar
     * @return devolvera True o False si consigue o no eliminar el correo.
     */
    public boolean borrarPorEmail(String email) {
        //recorrer arraylist comparando emails, si coinciden borrar.
        int indice = 0;
        for (Iterator reco = this.personas.iterator(); reco.hasNext();) {
            Persona recorrido = (Persona) reco.next();
            if (recorrido.getEmail().equals(email)) {
                indice = this.personas.indexOf(recorrido);
                this.personas.remove(indice);
                return true;
            }
        }

        return false;

    }

    /**
     * Permite buscar a las personas en base a su país de residencia
     *
     * @param pais País a buscar
     */
    public void personasPais(String pais) {
        for (Iterator reco = this.personas.iterator(); reco.hasNext();) {
            Persona recorrido = (Persona) reco.next();
            if (recorrido.getPais().equals(pais)) {
                System.out.println(recorrido.toString());
            }
        }
    }

    /**
     * Nos permite ver las personas en base a su fecha de nacimiento
     *
     * @param fechaNac Fecha de nacimiento a buscar
     */
    public void personasFNac(String fechaNac) {
        for (Iterator reco = this.personas.iterator(); reco.hasNext();) {
            Persona recorrido = (Persona) reco.next();
            if (recorrido.getNacimiento().equals(fechaNac)) {
                System.out.println(recorrido.toString());
            }
        }
    }

    //borrar al terminar
    public void muestraTodo() {
        if (personas.isEmpty()) {
            System.out.println("No hay personas en la lista actual");
        } else {
            System.out.println("Se mostrarán todas las personas");
            System.out.println("--------------------------------------------");
            for (Iterator reco = this.personas.iterator(); reco.hasNext();) {
                Persona recorrido = (Persona) reco.next();
                System.out.println(recorrido.toString());
                System.out.println("--------------------------------------------");
            }
        }

    }

}
