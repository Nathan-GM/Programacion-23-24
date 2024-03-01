/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

/**
 *
 * @author natgonmer
 */
public class Empleado extends Persona{
    int idEmpleado;
    RoleEmpleado rol;

    public Empleado(int idEmpleado, RoleEmpleado rol, String nombre, int edad, String fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
        this.idEmpleado = idEmpleado;
        this.rol = rol;
    }

    public void mostrarInformacion() {
        System.out.println("ID Empleado: " + getIdEmpleado());
        super.mostrarInformacion();
        System.out.println("Rol: " + getRol());

    }

    @Override
    public String tipo() {
        return super.tipo() + "Empleado " + getRol();
    }
    
    

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public RoleEmpleado getRol() {
        return rol;
    }

    public void setRol(RoleEmpleado rol) {
        this.rol = rol;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
