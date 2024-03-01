/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author natgonmer
 */



public class Curso {
    ArrayList personas = new ArrayList();
    String nombreCurso;
    int idCurso;

    public Curso(String nombreCurso, int idCurso) {
        this.nombreCurso = nombreCurso;
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    
    public void mostrarGente() {
        System.out.println("Personas matriculadas en el curso " + this.nombreCurso);
        for (Iterator prueba = personas.iterator(); prueba.hasNext();) {
            Persona muestra = (Persona) prueba.next();
            System.out.println(muestra.getNombre());
        }
    }
    
    
}
