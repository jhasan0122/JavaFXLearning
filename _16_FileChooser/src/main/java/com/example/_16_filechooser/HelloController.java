package com.example._16_filechooser;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController implements Initializable {

    FileChooser fileChooser = new FileChooser();  // for get a file

    @FXML
    private TextArea textArea;

    @FXML
    void getText(MouseEvent event) {
        File file =fileChooser.showOpenDialog(new Stage());
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                textArea.appendText(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void save(MouseEvent event) {
        File file = fileChooser.showSaveDialog(new Stage());
        if(file != null){
            saveSystem(file, textArea.getText());
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fileChooser.setInitialDirectory(new File("C:\\Users\\HP TECHNOLOGY\\IdeaProjects\\JavaFXLearning\\_16_FileChooser\\src\\main\\java\\com\\example\\_16_filechooser"));
    }

    public void saveSystem(File file, String content){
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write(content);
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}