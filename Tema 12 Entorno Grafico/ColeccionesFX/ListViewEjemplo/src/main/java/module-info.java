module es.sequeros.listviewejemplo {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.sequeros.listviewejemplo to javafx.fxml;
    exports es.sequeros.listviewejemplo;
}
