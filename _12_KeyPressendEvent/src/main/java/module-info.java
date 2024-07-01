module com.example._12_keypressendevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._12_keypressendevent to javafx.fxml;
    exports com.example._12_keypressendevent;
}