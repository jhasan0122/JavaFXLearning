package com.example._13_datepicker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;

import java.time.LocalDate;

public class HelloController {

    @FXML
    private DatePicker datePicker;

    @FXML
    void getDate(MouseEvent event) {
        LocalDate time = datePicker.getValue();
        System.out.println(time);
    }

}
