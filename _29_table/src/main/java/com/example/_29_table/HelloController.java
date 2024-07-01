package com.example._29_table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TableView<User> table;

    @FXML
    private TableColumn<User, String> name;

    @FXML
    private TableColumn<User, Integer> age;

    @FXML
    private TableColumn<User, String> animal;

    ObservableList<User> list = FXCollections.observableArrayList(
            new User("Jehan",24,"dod"),
            new User("Juthi",23,"cat"),
            new User("Hasan",29,"Bird")
    );


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        name.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
        age.setCellValueFactory(new PropertyValueFactory<User, Integer>("age"));
        animal.setCellValueFactory(new PropertyValueFactory<User, String>("animal"));

        table.setItems(list);
    }
}

