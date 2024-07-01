module com.example._9_spinner {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example._9_spinner to javafx.fxml;
    exports com.example._9_spinner;
}