/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionmeteorologica;

/**
 *
 * @author IEUser
 */
public class Medida {
    
    //Nathan Gonzalez Mercado

    private Momento mom;
    private double tempMax;
    private double pluvio;

    public Medida(Momento m, double tmax, double pl) {
        this.mom = m;
        this.tempMax = tmax;
        this.pluvio = pl;
    }

    public Momento getMomento() {
        return mom;
    }

    public double getTempMax() {
        return tempMax;
    }

    public double getPluvio() {
        return pluvio;
    }

    public String toString() {
        return mom.toString() + " " + tempMax + " " + pluvio;
    }

    public boolean anterior(Medida otra) {
        // A COMPLETAR POR EL ALUMNO, utilizando el método compareTo de la clase Momento.
        //Si el momento al que se lo solicitamos al compararlo con el atributo momento de la otra medida es mayor a 0
        //Devolveremos false al ser igual o mayor a la anterior
        if (this.mom.compareTo(otra.getMomento()) >= 0) {
            return false;
        }
        //no obstante si es mas pequeño que 0 (es menor que sobre la que se aplica) entonces se devuelve verdadero
        else {
            return true;
        }
    }

}
