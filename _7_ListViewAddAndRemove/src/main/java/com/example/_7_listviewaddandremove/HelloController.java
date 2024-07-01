package com.example._7_listviewaddandremove;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private ListView<String> listOfnames;

    @FXML
    private TextField name;

    @FXML
    void addName(MouseEvent event) {
        listOfnames.getItems().add(name.getText());
    }

    @FXML
    void removeName(MouseEvent event) {
        int selectedId = listOfnames.getSelectionModel().getSelectedIndex();
        listOfnames.getItems().remove(selectedId);
    }

}