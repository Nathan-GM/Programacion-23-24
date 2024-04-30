/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.sequeros.eventosraton01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;


import javafx.scene.text.Text;
/**
 * FXML Controller class
 *
 * @author natgonmer
 */
public class PrimaryController implements Initializable {


    @FXML
    private Text texto;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void ratonMueve(MouseEvent mover) {
        texto.setOnMouseDragged(t->{
            texto.setX(t.getX());
            texto.setY(t.getY());
        });
    }
    
}
