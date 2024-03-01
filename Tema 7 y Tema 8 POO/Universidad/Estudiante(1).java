/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;
import java.util.Scanner;
/**
 *
 * @author natgonmer
 */
public class Estudiante extends Persona{
    int idEstudiante;
    String fechaMatriculacion;

    public Estudiante(int idEstudiante, String fechaMatriculacion, String nombre, int edad, String fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
        this.idEstudiante = idEstudiante;
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public void mostrarInformacion() {
        System.out.println("ID Estudiante: " + getIdEstudiante());
        super.mostrarInformacion();
        System.out.println("Fecha Matriculación: " + getFechaMatriculacion());
    }
    
    public void matricularCurso(Curso a) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        String nombre;
        int edad;
        String fn;
        String fm;
        System.out.print("Introduce el nombre: ");
        setNombre(teclado2.nextLine());
        System.out.print("Introduce la edad: ");
        setEdad(teclado.nextInt());
        System.out.print("Introduce la fecha de nacimiento: ");
        setFechaNacimiento(teclado2.nextLine());
        System.out.print("Introduce la fecha de Matriculación: ");
        setFechaMatriculacion(teclado2.nextLine());
        a.personas.add(this);
        System.out.println("El alumno " + getNombre() + " se ha agreado al curso " + a.getNombreCurso() + " correctamente.");
    }

    @Override
    public String tipo() {
        return super.tipo() + "Estudiante";
    }
    
    
    
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(String fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
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
