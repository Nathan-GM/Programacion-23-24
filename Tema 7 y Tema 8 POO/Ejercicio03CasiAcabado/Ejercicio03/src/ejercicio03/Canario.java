/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author natgonmer
 */
public class Canario extends Aves {

    String color;
    boolean canta;

    public Canario(String color, boolean canta, String pico, Boolean vuela, String nombre, int edad, String estado, String fechaNacimiento) {
        super(pico, vuela, nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.canta = canta;
    }

    public String tipo() {
        return "Canario";
    }

    @Override
    public void volar() {
        System.out.println("Algo por implementar");
    }

    @Override
    public void muestra() {
        System.out.println("\tTipo: Canario");
        System.out.println("\tNombre: " + getNombre());
        System.out.println("\tEdad: " + getEdad());
        System.out.println("\tEstado: " + getEstado());
        System.out.println("\tFecha de Nacimiento: " + getFechaNacimiento());
        System.out.println("\tPico: Color " + getPico());
        if (getVuela() == true) {
            System.out.println("\tVuela: Puede volar");
        } else {
            System.out.println("\tVuela: No puede volar");
        }
        System.out.println("\tColor: " + getColor());
        if (isCanta() == true) {
            System.out.println("\tCanta: Puede cantar");
        } else {
            System.out.println("\tCanta: No puede cantar");
        }
    }

    @Override
    public void muestraTipoNombre() {
        System.out.println("\tTipo: Loro");
        System.out.println("\tNombre: " + getNombre());
    }

    @Override
    public boolean cumpleanyos(String fecha) {
        System.out.println("Algo por implementar");
        return true;
    }

    @Override
    public boolean morir() {
        System.out.println("Algo por implementar");
        return true;
    }

    @Override
    public void habla() {
        System.out.println("Algo por implementar");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public Boolean getVuela() {
        return vuela;
    }

    public void setVuela(Boolean vuela) {
        this.vuela = vuela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
