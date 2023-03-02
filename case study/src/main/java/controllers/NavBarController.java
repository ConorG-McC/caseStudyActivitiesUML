package controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import routers.RouteNames;
import routers.Router;

import java.io.IOException;

public class NavBarController {

    @FXML
    private void handleReturnHome(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.HOME, event);
    }

    @FXML
    private void handleAddModule(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.ADD_MODULE, event);
    }

    @FXML
    private void handleViewModules(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.SHOW_MODULES, event);
    }

    @FXML
    private void handleQuitAction(ActionEvent event) {
        Platform.exit();
    }
}
