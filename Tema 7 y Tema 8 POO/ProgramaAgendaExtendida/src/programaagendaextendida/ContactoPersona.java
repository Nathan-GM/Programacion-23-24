/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaagendaextendida;

/**
 *
 * @author natgonmer
 */
public class ContactoPersona extends Contacto{
    private String nacimiento;
    
    public ContactoPersona(String nombre, int telefono, String nacimiento) {
        super(nombre, telefono);
        
        this.nacimiento = nacimiento;
    }

    /**
     * @return the nacimiento
     */
    public String getNacimiento() {
        return nacimiento;
    }

    /**
     * @param nacimiento the nacimiento to set
     */
    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " Telefono: " + getTelefono() + " Fecha de Nacimiento: " + getNacimiento();
    }
    
    
}
