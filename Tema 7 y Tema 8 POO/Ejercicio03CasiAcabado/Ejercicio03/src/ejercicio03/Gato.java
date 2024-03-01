/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author natgonmer
 */
public class Gato extends Mascotas {

    String color;
    boolean peloLargo;

    public Gato(String color, boolean peloLargo, String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    public String tipo() {
        return "Gato";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
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

    @Override
    public void muestra() {
        System.out.println("\tTipo: Gato");
        System.out.println("\tNombre: " + getNombre());
        System.out.println("\tEdad: " + getEdad());
        System.out.println("\tEstado: " + getEstado());
        System.out.println("\tFecha de Nacimiento: " + getFechaNacimiento());
        System.out.println("\tColor: " + getColor());
        if (isPeloLargo() == true) {
            System.out.println("\tPelo largo: El gato tiene pelo largo");
        } else {
            System.out.println("\tPelo largo: El gato no tiene pelo largo");
        }
    }

    public void muestraTipoNombre() {
        System.out.println("\tTipo: Gato");
        System.out.println("\tNombre: " + getNombre());
    }

    @Override
    public boolean cumpleanyos(String fecha) {
        System.out.println("Algo");
        return true;
    }

    @Override
    public boolean morir() {
        System.out.println("Algo");
        return true;
    }

    @Override
    public void habla() {
        System.out.println("Algo");

    }

}
