module com.example._19_choicebox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._19_choicebox to javafx.fxml;
    exports com.example._19_choicebox;
}