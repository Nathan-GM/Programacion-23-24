/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciob;

/**
 *
 * @author natgonmer
 */
public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esMayorEdad() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esJubilado() {
        if (this.edad >= 65) {
            return true;
        } else {
            return false;
        }
    }

    public void imprime() {
        if (esMayorEdad() == true) {
            if (esJubilado() == true) {
                System.out.println(this.nombre + " " + this.apellidos + " con DNI " + this.dni + " es mayor de edad (" + this.edad + ") y esta jubilada");
            } else {
                System.out.println(this.nombre + " " + this.apellidos + " con DNI " + this.dni + " es mayor de edad (" + this.edad + ")");
            }
        } else {
            System.out.println(this.nombre + " " + this.apellidos + " con DNI " + this.dni + " NO es mayor de edad (" + this.edad + ")");
        }
    }
    
    public int diferenciaEdad(Persona p) {
        int diferencia = 0;
        if(this.edad > p.edad) {
           return diferencia = this.edad - p.edad; 
        }
        else {
           return diferencia = p.edad - this.edad; 
        }
    }
}
