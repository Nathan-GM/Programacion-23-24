/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.sequeros.listviewejemplo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.beans.binding.Bindings;

/**
 * FXML Controller class
 *
 * @author natgonmer
 */
public class ListviewController implements Initializable {

    @FXML
    private ListView<String> vistaListafx;
    @FXML
    private Label seleccionado;
    @FXML
    private TextField valorTexto;
    @FXML
    private Button btAgregar;
    @FXML
    private Button btBorrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ArrayList<String> datosArrayList = new ArrayList<>();
        datosArrayList.add("Java");
        datosArrayList.add("JavaFX");
        datosArrayList.add("C++");
        datosArrayList.add("Python");
        datosArrayList.add("Javascript");
        datosArrayList.add("C#");
        ObservableList<String> datosObservableList;
        datosObservableList = FXCollections.observableList(datosArrayList);
        vistaListafx.setItems(datosObservableList);
        
        //Método 1
        /*
        seleccionado.textProperty().bind(vistaListafx.getSelectionModel().selectedItemProperty());
        */
        
        
        //Cambia el texto del valor seleccionado haciendo uso de funcion lambda.
        //Método 2
        vistaListafx.getSelectionModel().selectedIndexProperty().addListener((o, oldVal, newVal) -> {
            if (newVal.intValue() == -1) {
                seleccionado.setText("none");
            } else {
                seleccionado.setText(datosObservableList.get(newVal.intValue()));
            }
        });
        seleccionado.setText("none");
        
        
        //Método 3
        /*
        seleccionado.textProperty().bind(Bindings.when(vistaListafx.getSelectionModel().selectedIndexProperty().isEqualTo(-1)).then("none").otherwise(vistaListafx.getSelectionModel().selectedItemProperty().asString()));
        */
        
        
        btBorrar.disableProperty().bind(
                Bindings.equal(-1,
                vistaListafx.getSelectionModel().selectedIndexProperty()));
        btAgregar.disableProperty().bind(valorTexto.textProperty().isEmpty());
        
        vistaListafx.setCellFactory(c -> );
    }    

    
}
