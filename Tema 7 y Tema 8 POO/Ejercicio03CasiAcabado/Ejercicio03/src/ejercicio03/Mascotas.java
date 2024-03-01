/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author natgonmer
 */
public abstract class Mascotas {
    String nombre;
    int edad;
    String estado;
    String fechaNacimiento;
    
    public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public abstract String tipo();
    
    public abstract void muestra();

    public abstract void muestraTipoNombre();
    
    public abstract boolean cumpleanyos(String fecha);
    
    public abstract boolean morir();
    
    public abstract void habla();
}
