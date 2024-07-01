module com.example._8_initialize {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example._8_initialize to javafx.fxml;
    exports com.example._8_initialize;
}