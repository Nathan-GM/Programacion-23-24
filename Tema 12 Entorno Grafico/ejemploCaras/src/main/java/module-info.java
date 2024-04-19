module es.sequeros.ejemplocaras {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.sequeros.ejemplocaras to javafx.fxml;
    exports es.sequeros.ejemplocaras;
}
