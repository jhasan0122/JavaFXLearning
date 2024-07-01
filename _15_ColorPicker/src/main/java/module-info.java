module com.example._15_colorpicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._15_colorpicker to javafx.fxml;
    exports com.example._15_colorpicker;
}