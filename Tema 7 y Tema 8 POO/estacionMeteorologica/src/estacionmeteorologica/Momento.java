/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionmeteorologica;

/**
 *
 * @author IEUser
 */
public class Momento {

    //Nathan Gonzalez Mercado
    
    private int hora, dia, mes;

    public Momento(int d, int m, int h) {
        this.dia = d;
        this.mes = m;
        this.hora = h;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String toString() {
        return mes + " " + dia + " " + hora;
    }

    public boolean equals(Object o) {
        Momento a = (Momento) o;
        return dia == a.dia && mes == a.mes && hora == a.hora;
    }

    public int compareTo(Momento otro) {
        // A COMPLETAR POR EL ALUMNO ...
        /*
            Método utilizado para realizar una ordenación natural
            Devuelve:
                0 si los dos objetos a comparar son iguales
                -1 si el objeto que se compara con otro es menor
                1 si el objeto que se compara con otro es mayor
         */
        
        //Primero comprobaremos si el mes es mayor (1) o menor (-1) que el otro
         if (this.mes > otro.mes) {
             return 1;
         }
         else if (this.mes < otro.mes) {
             return -1;
         }
         else { 
             //Si resulta ser iguales, nos fijaremos en el dia, siguiendo la misma logica
             if (this.dia > otro.dia) {
                 return 1;
             }
             else if (this.dia < otro.dia) {
                 return -1;
             }
             else {
                 //Si por algun casual ambos fueran identicos nuevamente, los ordenariamos en base a la hora mayor o menor
                 if (this.hora > otro.hora) {
                     return 1;
                 }
                 else if (this.hora < otro.hora) {
                     return -1;
                 }
                 //Si resulta ser identico en todas partes, lo haremos saber devolviendo 0
                 else {
                     return 0;
                 }
             }
         }
    }
}
