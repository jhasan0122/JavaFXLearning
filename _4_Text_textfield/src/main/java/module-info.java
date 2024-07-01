module com.example._4_text_textfield {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example._4_text_textfield to javafx.fxml;
    exports com.example._4_text_textfield;
}