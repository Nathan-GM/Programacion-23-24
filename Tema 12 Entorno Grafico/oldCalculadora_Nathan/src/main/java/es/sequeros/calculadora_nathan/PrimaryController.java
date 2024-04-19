/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.sequeros.calculadora_nathan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Natha
 */
public class PrimaryController implements Initializable {

    @FXML
    private Button num0;
    @FXML
    private Button num1;
    @FXML
    private Button num2;
    @FXML
    private Button num3;
    @FXML
    private Button num4;
    @FXML
    private Button num5;
    @FXML
    private Button num6;
    @FXML
    private Button num7;
    @FXML
    private Button num8;
    @FXML
    private Button num9;
    @FXML
    private Button punto;
    @FXML
    private Button sumar;
    @FXML
    private Button restar;
    @FXML
    private Button multiplicar;
    @FXML
    private Button dividir;
    @FXML
    private Button igual;
    @FXML
    private Button botonC;
    @FXML
    private TextField pantalla;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void anyadirNumero(ActionEvent event) {
        pantalla.setText(event.getSource().toString());
    }

    @FXML
    private void decimal(ActionEvent event) {
    }

    @FXML
    private void elegirOperacion(ActionEvent event) {
    }

    @FXML
    private void resolver(ActionEvent event) {
    }

    @FXML
    private void borrarNumero(ActionEvent event) {
    }

    @FXML
    private void mostrarNumero(ActionEvent event) {
    }
    
}
