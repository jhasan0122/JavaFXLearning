module com.example._13_datepicker {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example._13_datepicker to javafx.fxml;
    exports com.example._13_datepicker;
}