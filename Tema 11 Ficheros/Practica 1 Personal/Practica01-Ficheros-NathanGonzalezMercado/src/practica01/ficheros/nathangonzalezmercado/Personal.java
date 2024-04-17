/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01.ficheros.nathangonzalezmercado;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Natha
 */
public class Personal {

    ArrayList<Persona> personas;

    // Constructor
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
        // System.out.println(agregar.getNombre() + " ha sido agregado correctamente a
        // la lista de personal");
    }

    /**
     * Eliminará la persona en base al correo introducido.
     *
     * @param email Correo que deseamos eliminar
     * @return devolvera True o False si consigue o no eliminar el correo.
     */
    public boolean borrarPorEmail(String email) {
        // recorrer arraylist comparando emails, si coinciden borrar.
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
                System.out.println("---------------------------");
                System.out.println(recorrido.toString());
                System.out.println("---------------------------");
            }
        }
    }

    public void personaJoven() {
        // valores de la persona más joven
        int diaPJoven = 0;
        int mesPJoven = 0;
        int anyoPJoven = 0;
        // valores de la persona actual
        int diaPActual;
        int mesPActual;
        String mesPActualString;
        int anyoPActual;
        // Creación de la lista
        Lista jovenes = new Lista();
        //recorremos el arraylist de personas
        for (Iterator recorrido = personas.iterator(); recorrido.hasNext();) {
            Persona actual = (Persona) recorrido.next();
            
            //Almacenaremos las fechas de nacimiento para poder compararlas
            String nacimientoPActual[] = actual.getNacimiento().split("_");
            diaPActual = Integer.parseInt(nacimientoPActual[0]);
            //dado que en mi fichero los meses se escribieron como nombres, se pasaran primero como string y acto seguido se convierten.
            mesPActualString = nacimientoPActual[1];
            mesPActual = convertorMes(mesPActualString);
            anyoPActual = Integer.parseInt(nacimientoPActual[2]);
            
            //Se realiza la comparacion
            if (anyoPJoven < anyoPActual) { //El año es distinto
                //por tanto, se modifican los datos y se vacia la lista de jovenes
                anyoPJoven = anyoPActual;
                mesPJoven = mesPActual;
                diaPJoven = diaPActual;
                jovenes.vaciar();
                jovenes.addNodo(actual);
            } else if (anyoPJoven == anyoPActual) {
                if (mesPJoven > mesPActual) {
                    mesPJoven = mesPActual;
                    diaPJoven = diaPActual;
                    jovenes.vaciar();
                    jovenes.addNodo(actual);
                } else if (mesPJoven == mesPActual) {
                    if (diaPJoven > diaPActual) {
                        diaPJoven = diaPActual;
                        jovenes.vaciar();
                        jovenes.addNodo(actual);
                    } else if (diaPJoven == diaPActual) {
                        jovenes.addNodo(actual);
                    }
                }
            }
        }
        jovenes.mostrar();
    }

// borrar al terminar
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

    public int convertorMes(String mes) {
        switch (mes) {
            case "enero":
                return 1;
            case "febrero":
                return 2;
            case "marzo":
                return 3;
            case "abril":
                return 4;
            case "mayo":
                return 5;
            case "junio":
                return 6;
            case "julio":
                return 7;
            case "agosto":
                return 8;
            case "septiembre":
                return 9;
            case "octubre":
                return 10;
            case "noviembre":
                return 11;
            case "diciembre":
                return 12;
        }
        return 0;

    }

    public class Lista<Persona> {

        private Nodo primero;
        private Nodo siguiente;

        public Lista() {
            this.primero = null;
        }

        public void addNodo(Persona dato) {
            Nodo nuevoNodo = new Nodo(dato, this.primero);
            this.primero = nuevoNodo;

        }

        public void vaciar() {
            this.primero = null;
            this.siguiente = null;
        }

        public void mostrar() {
            Nodo aux = this.primero;
            System.out.println("-----------------------------");
            while (aux != null) {
                System.out.println(aux.getDato().toString());
                aux = aux.getSiguiente();
                System.out.println("--------------------------------------");
            }
        }

        //clase nodo utilizada para crear nuestra lista
        private class Nodo {

            private Persona dato;
            private Nodo siguiente;

            public Nodo() {
                siguiente = null;
                dato = null;
            }

            public Nodo(Persona dato, Nodo siguiente) {
                this.dato = dato;
                this.siguiente = siguiente;
            }

            public Persona getDato() {
                return dato;
            }

            public void setDato(Persona dato) {
                this.dato = dato;
            }

            public Nodo getSiguiente() {
                return siguiente;
            }

            public void setSiguiente(Nodo siguiente) {
                this.siguiente = siguiente;
            }

        }

    }
}
