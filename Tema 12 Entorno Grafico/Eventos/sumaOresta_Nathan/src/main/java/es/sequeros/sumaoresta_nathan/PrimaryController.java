/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.sequeros.sumaoresta_nathan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.util.InputMismatchException;

/**
 * FXML Controller class
 *
 * @author natgonmer
 */
public class PrimaryController implements Initializable {

    @FXML
    private Text valorNumerico;
    @FXML
    private Button uno;
    @FXML
    private Button cinco;
    @FXML
    private Button diez;
    @FXML
    private CheckBox restar;
    @FXML
    private Button botonOperacion;
    @FXML
    private Text textoResta;

    boolean resta = false;
    @FXML
    private TextField valorElegido;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        textoResta.setVisible(false);
        resta = false;
    }

    @FXML
    private void sumar(ActionEvent event) {
        double numeroActual = Double.parseDouble(valorNumerico.getText());
        if (!resta) {
            if (event.getSource() == uno) {
                numeroActual = numeroActual + 1;
                valorNumerico.setText("" + numeroActual);
            } else if (event.getSource() == cinco) {
                numeroActual = numeroActual + 5;
                valorNumerico.setText("" + numeroActual);
            } else if (event.getSource() == diez) {
                numeroActual = numeroActual + 10;
                valorNumerico.setText("" + numeroActual);
            }
        } else {
            if (event.getSource() == uno) {
                numeroActual = numeroActual - 1;
                valorNumerico.setText("" + numeroActual);
            } else if (event.getSource() == cinco) {
                numeroActual = numeroActual - 5;
                valorNumerico.setText("" + numeroActual);
            } else if (event.getSource() == diez) {
                numeroActual = numeroActual - 10;
                valorNumerico.setText("" + numeroActual);
            }
        }

    }

    @FXML
    private void operar(ActionEvent event) {
        boolean error = false;
        double numeroActual = Double.parseDouble(valorNumerico.getText());
        double valorEscrito = 0;
        try {
         valorEscrito = Double.parseDouble(valorElegido.getText().replace(',', '.'));
         if(!resta) {
            numeroActual = numeroActual + valorEscrito;
            valorNumerico.setText("" + numeroActual);
            valorElegido.setText("");
            
        }
        else {
            numeroActual = numeroActual - valorEscrito;
            valorNumerico.setText("" + numeroActual);  
            valorElegido.setText("");
        }
        } catch(NumberFormatException err) {
            valorElegido.setText("");
            valorElegido.setPromptText("NO SE ADMITEN LETRAS");
        }
        
    }

    @FXML
    private void marcarRestar(ActionEvent event) {
        if (resta == false) {
            textoResta.setVisible(true);
            resta = true;
        } else if (resta == true) {
            textoResta.setVisible(false);
            resta = false;
        }
    }

}
