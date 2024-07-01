module com.example._16_filechooser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._16_filechooser to javafx.fxml;
    exports com.example._16_filechooser;
}