package ru.mskomarov.cloud.client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea textArea;
    @FXML
    TextField textField;

    public void btnClickMeAction(ActionEvent actionEvent) {
        textArea.appendText(textField.getText());
        textArea.appendText("\n");
        textField.clear();
        textField.requestFocus();
    }


}
