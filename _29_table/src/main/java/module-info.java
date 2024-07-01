module com.example._29_table {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._29_table to javafx.fxml;
    exports com.example._29_table;
}