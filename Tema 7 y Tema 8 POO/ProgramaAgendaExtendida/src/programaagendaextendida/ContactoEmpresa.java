/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaagendaextendida;

/**
 *
 * @author natgonmer
 */
public class ContactoEmpresa extends Contacto{
    private String pagina;
    
    public ContactoEmpresa(String nombre, int telefono, String pagina) {
        super(nombre, telefono);
        
        this.pagina = pagina;
        
    }

    /**
     * @return the pagina
     */
    public String getPagina() {
        return pagina;
    }

    /**
     * @param pagina the pagina to set
     */
    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " Telefono: " + getTelefono() + " Fecha de Nacimiento: " + getPagina();
    }
    
}
