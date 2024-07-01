module com.example._28_passwordfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._28_passwordfield to javafx.fxml;
    exports com.example._28_passwordfield;
}