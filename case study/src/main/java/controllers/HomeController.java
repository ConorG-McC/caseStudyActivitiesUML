package controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import routers.RouteNames;
import routers.Router;

import java.io.IOException;

public class HomeController{

    @FXML
    private void handleManagerMenuButton(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.MANAGER_MENU, event);
    }
    @FXML
    private void handleStaffUserMenuButton(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.STAFFUSER_MENU, event);
    }

    @FXML
    private void handleQuitAction(ActionEvent event) {
        Platform.exit();
    }
}



