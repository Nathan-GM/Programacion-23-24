/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.sequeros.ejercicio08_listviewpersona_nathan;

import es.sequeros.ejercicio08_listviewpersona_nathan.PrincipalController.Persona;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author natgonmer
 */
public class DatosController implements Initializable {


    @FXML
    private Label mostrarNombre;
    @FXML
    private Label mostrarApellido;
    @FXML
    private Button btClose;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        btClose.setOnAction(e -> {
            Stage stage = (Stage) btClose.getScene().getWindow();
            stage.close();
        });
    }
    public void initPersona(Persona p) {
        mostrarNombre.setText(p.getNombre());
        mostrarApellido.setText(p.getApellido());
    }
}
