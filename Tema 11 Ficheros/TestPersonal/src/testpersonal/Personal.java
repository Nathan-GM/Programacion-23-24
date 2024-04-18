/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpersonal;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Natha
 */

//Nathan Gonzalez Mercado

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
        for (Iterator recorre = this.personas.iterator(); recorre.hasNext();) {
            Persona recorrido = (Persona) recorre.next();
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
        for (Iterator recorre = this.personas.iterator(); recorre.hasNext();) {
            Persona recorrido = (Persona) recorre.next();
            if (recorrido.getPais().equals(pais)) {
                System.out.println("-------------------------------");
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
        for (Iterator recorre = this.personas.iterator(); recorre.hasNext();) {
            Persona recorrido = (Persona) recorre.next();
            String[] fnacActual = recorrido.getNacimiento().split("_");
            int dia = Integer.parseInt(fnacActual[0]);
            String mes = fnacActual[1];
            String fnac = dia + "_" + mes;
            if (fnac.equals(fechaNac)) {
                System.out.println("---------------------------");
                System.out.println(recorrido.toString());
            }
        }
    }
    
    /**
     * Nos sacará la persona o grupo de personas más jovenes que tengamos en nuestro array.
     */
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
    
    /**
     * Nos mostrará todas las personas del fichero.
     */
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
    
    /**
     * Convierte un mes dado en string a su número correspondiente
     * @param mes mes obtenido en la fecha de nacimiento
     * @return el número que corresponde a dicho mes
     */
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
    
    /**
     * Clase que nos implementará una lista de personas.
     * @param <Persona> 
     */
    public class Lista<Persona> {

        private Nodo primero;
        private Nodo siguiente;

        /**
         * Constructor de la lista donde el primer valor será nulo en su creación.
         */
        public Lista() {
            this.primero = null;
        }

        /**
         * Añadirá un nuevo nodo a nuestra lista
         * @param dato Objeto Persona que vamos a registrar como dato del nodo
         */
        public void addNodo(Persona dato) {
            Nodo nuevoNodo = new Nodo(dato, this.primero);
            this.primero = nuevoNodo;

        }

        /**
         * Vaciará la lista actual.
         */
        public void vaciar() {
            this.primero = null;
            this.siguiente = null;
        }

        /**
         * Mostrará todos los valores que localice en la lista.
         */
        public void mostrar() {
            Nodo aux = this.primero;
            System.out.println("-----------------------------");
            while (aux != null) {
                System.out.println(aux.getDato().toString());
                aux = aux.getSiguiente();
                System.out.println("--------------------------------------");
            }
        }
        /**
         * Clase utilizada para crear los nodos
         */
        private class Nodo {

            private Persona dato;
            private Nodo siguiente;

            /**
             * Constructor de Nodo vacio.
             */
            public Nodo() {
                siguiente = null;
                dato = null;
            }

            /**
             * Constructor de Nodo que contiene dato y nodo siguiente
             * @param dato Objeto de la clase Persona que correesponde al dato.
             * @param siguiente Nodo siguiente de la lista.
             */
            public Nodo(Persona dato, Nodo siguiente) {
                this.dato = dato;
                this.siguiente = siguiente;
            }

            //Getters y Setters.
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
