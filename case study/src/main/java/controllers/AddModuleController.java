package controllers;

import general.AlertMessage;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class AddModuleController{
    @FXML
    private TextField moduleName;


    public void initialize(){
        Platform.runLater(() -> moduleName.requestFocus());
    }

    @FXML
    private void handleSubmitModule() {
        clearForm();
        AlertMessage.showMessage(Alert.AlertType.INFORMATION, "Module added");

        moduleName.requestFocus();
    }

    private void clearForm(){
        moduleName.clear();
        moduleName.requestFocus();
    }
}