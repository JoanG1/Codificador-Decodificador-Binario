module com.example.codificadordecoficador {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codificadordecoficador to javafx.fxml;
    exports com.example.codificadordecoficador;
}