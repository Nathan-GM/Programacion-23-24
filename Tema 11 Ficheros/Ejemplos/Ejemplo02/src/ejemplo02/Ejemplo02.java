/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo02;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author natgonmer
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            File f = new File("Enteros.txt");
            FileWriter fw = new FileWriter(f, true);
            
            int valor = 1;
            
            for (int i = 0; i < 20; i++) {
                fw.write("" + valor);
                fw.write(" ");
                valor = valor *2;
            }
            fw.write("\n");
            fw.close();
            System.out.println("Fichero escrito correctamente");
            
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
}
