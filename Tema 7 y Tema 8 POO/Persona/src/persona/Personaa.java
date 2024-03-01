/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Natha
 */
public class Personaa {

    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Personaa(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public int diferenciaEdad(Personaa p) {
        int diferencia;
        if (p.edad > this.edad) {
            diferencia = p.edad - this.edad;
        } else {
             diferencia = this.edad - p.edad;

        }
        return diferencia;
    }

}
