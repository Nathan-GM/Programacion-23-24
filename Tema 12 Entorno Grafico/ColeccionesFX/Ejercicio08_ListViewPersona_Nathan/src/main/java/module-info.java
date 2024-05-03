module es.sequeros.ejercicio08_listviewpersona_nathan {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.sequeros.ejercicio08_listviewpersona_nathan to javafx.fxml;
    exports es.sequeros.ejercicio08_listviewpersona_nathan;
}
