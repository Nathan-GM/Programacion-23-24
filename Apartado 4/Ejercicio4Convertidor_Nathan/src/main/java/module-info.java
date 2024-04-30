module es.sequeros.ejercicio4convertidor_nathan {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.sequeros.ejercicio4convertidor_nathan to javafx.fxml;
    exports es.sequeros.ejercicio4convertidor_nathan;
}
