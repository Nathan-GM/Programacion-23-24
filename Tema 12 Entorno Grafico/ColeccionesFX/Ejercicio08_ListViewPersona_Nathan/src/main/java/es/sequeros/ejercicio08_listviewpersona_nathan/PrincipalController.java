/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.sequeros.ejercicio08_listviewpersona_nathan;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ListCell;
import javafx.beans.binding.Bindings;

/**
 * FXML Controller class
 *
 * @author natgonmer
 */
public class PrincipalController implements Initializable {

    @FXML
    private Button fxVDatos;
    @FXML
    private ListView<Persona> listaPersona;
    @FXML
    private Button fxAdd;
    @FXML
    private Button fxBorrar;
    @FXML
    private Button fxMod;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ArrayList<Persona> datos = new ArrayList<>();
        datos.add(new Persona("Pepe", "Garcia"));
        datos.add(new Persona("Juan", "Cuesta"));
        datos.add(new Persona("Sara", "Hjellstrong"));
        datos.add(new Persona("Rosemary", "Darling"));
        ObservableList<Persona> datosObservables;
        datosObservables = FXCollections.observableList(datos);
        listaPersona.setItems(datosObservables);
        listaPersona.setCellFactory(c -> new PersonListCell());

        fxMod.disableProperty().bind(Bindings.equal(-1,
                listaPersona.getSelectionModel().selectedIndexProperty()));
    }

    //Clase Persona
    public class Persona {

        private final StringProperty Nombre = new SimpleStringProperty();
        private final StringProperty Apellido = new SimpleStringProperty();

        public Persona(String nombre, String apellido) {
            Nombre.setValue(nombre);
            Apellido.setValue(apellido);
        }

        public final StringProperty NombreProperty() {
            return this.Nombre;
        }

        public final java.lang.String getNombre() {
            return this.NombreProperty().get();
        }

        public final void setNombre(final String Nombre) {
            this.NombreProperty().set(Nombre);
        }

        public final StringProperty ApellidoProperty() {
            return this.Apellido;
        }

        public final String getApellido() {
            return this.ApellidoProperty().get();
        }

        public final void setApellido(final String Apellido) {
            this.ApellidoProperty().set(Apellido);
        }

    }

    //Clase que modifica la vista de la lista.
    class PersonListCell extends ListCell<Persona> {

        @Override
        protected void updateItem(Persona p, boolean vacio) {
            super.updateItem(p, vacio);
            if (p == null || vacio) {
                setText(null);
            } else {
                setText(p.getApellido() + ", " + p.getNombre());
            }

        }
    }

}
