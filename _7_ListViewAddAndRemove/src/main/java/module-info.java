module com.example._7_listviewaddandremove {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example._7_listviewaddandremove to javafx.fxml;
    exports com.example._7_listviewaddandremove;
}