package com.example._5_radiobutton;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private ToggleGroup Animal;

    @FXML
    private RadioButton cat;

    @FXML
    private RadioButton dog;

    @FXML
    private Text text;

    @FXML
    void getAnimal(MouseEvent event) {
        if(Animal.getSelectedToggle().equals(cat)){
            text.setText("Cat");
        }
        else if(Animal.getSelectedToggle().equals(dog)){
            text.setText("Dog");
        }

    }

}
