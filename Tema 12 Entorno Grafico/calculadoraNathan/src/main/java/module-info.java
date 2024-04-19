module es.sequeros.calculadoranathan {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.sequeros.calculadoranathan to javafx.fxml;
    exports es.sequeros.calculadoranathan;
}
