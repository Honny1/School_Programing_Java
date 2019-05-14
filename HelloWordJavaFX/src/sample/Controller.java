package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.awt.*;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField inputText;
    @FXML
    private Button button;
    @FXML
    private Label label;
    @FXML
    private void printHalloWorld(ActionEvent event) {
        System.out.println("You clicked me! event: " + event.toString());
        label.setText("Ahoj "+inputText.getText()+"!");
    }


    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}

