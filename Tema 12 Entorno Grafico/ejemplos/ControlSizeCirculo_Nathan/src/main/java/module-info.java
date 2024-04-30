module es.sequeros.controlsizecirculo_nathan {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.sequeros.controlsizecirculo_nathan to javafx.fxml;
    exports es.sequeros.controlsizecirculo_nathan;
}
