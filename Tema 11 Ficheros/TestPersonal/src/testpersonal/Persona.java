/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpersonal;

/**
 *
 * @author Natha
 */

//Nathan Gonzalez Mercado

public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String genero;
    private String nacimiento;
    private String pais;
    
    /**
     * Constructor de la clase Persona
     * @param nombre corresponde al nombre de la persona a crear
     * @param apellido corresponde al apellido de la persona a crear
     * @param email corresponde al email de la persona a crear
     * @param genero corresponde al genero de la persona a crear
     * @param nacimiento corresponde a la fecha de nacimiento de la persona a crear
     * @param pais corresponde al pais de la persona a crear
     */
    public Persona(String nombre, String apellido, String email, String genero, String nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }

    
    //Getters y Setters de Persona
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    @Override
    public String toString() {
        //return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", genero=" + genero + ", nacimiento=" + nacimiento + ", pais=" + pais + '}';
        return "Nombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nEmail: " + getEmail() + 
                "\nGenero: " + getGenero() + 
                "\nNacimiento: " + getNacimiento() +
                "\nPais: " + getPais();
    }
}
