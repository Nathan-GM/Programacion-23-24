module es.sequeros.calculadora_nathan {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens es.sequeros.calculadora_nathan to javafx.fxml;
    exports es.sequeros.calculadora_nathan;
}
