/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.sequeros.movercirculo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.Node;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author natgonmer
 */
public class PrimaryController implements Initializable {

    @FXML
    private Circle bola;
    @FXML
    private GridPane pantalla;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        
    }    

    @FXML
    private void mover(KeyEvent event) {
        bola.setOnKeyPressed(tecla -> {
            int posicion = 0;
            if(tecla.getCode() == KeyCode.DOWN && pantalla.getRowIndex(bola) + 1 < pantalla.getRowCount()) {
                posicion = pantalla.getRowIndex(bola);
                pantalla.setRowIndex(bola, posicion+1);
            } else if (tecla.getCode() == KeyCode.UP && pantalla.getRowIndex(bola) -1 >= 0) {
                posicion = pantalla.getRowIndex(bola);
                pantalla.setRowIndex(bola, posicion-1);
            } else if (tecla.getCode() == KeyCode.RIGHT && pantalla.getColumnIndex(bola) + 1 < pantalla.getColumnCount()) {
                posicion = pantalla.getColumnIndex(bola);
                pantalla.setColumnIndex(bola, posicion+1);
            } else if (tecla.getCode() == KeyCode.LEFT && pantalla.getColumnIndex(bola) - 1 >= 0) {
                posicion = pantalla.getColumnIndex(bola);
                pantalla.setColumnIndex(bola, posicion-1);                
            } else if (tecla.getCode() == KeyCode.ESCAPE) {
                Stage stage = (Stage)((Node)tecla.getSource()).getScene().getWindow();
                stage.close();
            }
        });
    }
    
    
}
