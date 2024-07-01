package com.example._12_keypressendevent;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private Text text;


    @FXML
    void show(KeyEvent event) {
        if(event.getCode() == KeyCode.ENTER){
//            System.out.println("Enter pressed!");
            text.setVisible(false);
        }
        if(event.getCode() == KeyCode.SPACE){
//            System.out.println("Space pressed!");
            text.setVisible(true);
        }
    }

}
