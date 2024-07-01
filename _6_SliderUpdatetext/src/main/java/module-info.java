module com.example._6_sliderupdatetext {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example._6_sliderupdatetext to javafx.fxml;
    exports com.example._6_sliderupdatetext;
}