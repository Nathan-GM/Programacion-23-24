module es.sequeros.sumaoresta_nathan {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.sequeros.sumaoresta_nathan to javafx.fxml;
    exports es.sequeros.sumaoresta_nathan;
}
