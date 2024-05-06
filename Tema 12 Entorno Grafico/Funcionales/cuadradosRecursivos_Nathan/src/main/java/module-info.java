module es.sequeros.cuadradosrecursivos_nathan {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.sequeros.cuadradosrecursivos_nathan to javafx.fxml;
    exports es.sequeros.cuadradosrecursivos_nathan;
}
