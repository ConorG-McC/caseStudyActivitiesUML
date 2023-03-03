package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import routers.RouteNames;
import routers.Router;

import java.io.IOException;

public class EditModuleController {
    @FXML
    private TextField moduleName;

    @FXML
    private void handleSubmitModule(ActionEvent event) throws IOException{
        String name = moduleName.getText();

        Router.changeRoute(RouteNames.ADD_EDIT_STAFF, event);
    }
}
