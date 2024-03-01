/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author natgonmer
 */
public class Perro extends Mascotas{
    String raza;
    boolean pulgas;

    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public String tipo() {
        return "Perro";
    }

    
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
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
    
    public void muestra() {
        System.out.println("\tTipo: Perro");
        System.out.println("\tNombre: " + getNombre());
        System.out.println("\tEdad: " + getEdad());
        System.out.println("\tEstado: " + getEstado());
        System.out.println("\tFecha de Nacimiento: " + fechaNacimiento);
        System.out.println("\tRaza: " + getRaza());
        if(isPulgas()==true) {
            System.out.println("\tPulgas: Si");
        }
        else {
            System.out.println("\tPulgas: No");
        }
    }

    public void muestraTipoNombre() {
        System.out.println("\tTipo: Perro");
        System.out.println("\tNombre: " + getNombre());
    }
    
    public void habla() {
        System.out.println("El perro dice");
        System.out.println("GUAU GUAU");
    }

    public boolean morir() {
        int posibilidad = (int) Math.random()*100;
        if(posibilidad > 95) {
            System.out.println("El perro ha muerto, DEP :c");
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean cumpleanyos(String fecha) {
        if(fecha.equals(this.fechaNacimiento)) {
            System.out.println("Es su cumpleaños!");
            return true;
        }
        else {
            return false; 
        }
    }
    
    
    
}
