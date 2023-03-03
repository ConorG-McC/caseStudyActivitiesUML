package controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import routers.RouteNames;
import routers.Router;

import java.io.IOException;

public class StaffNavBarController {

    @FXML
    private void handleReturnHome(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.HOME, event);
    }

    @FXML
    private void handleViewUserDetails(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.VIEW_USER_DETAILS, event);
    }

    @FXML
    private void handleEditUserDetails(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.EDIT_USER_DETAILS, event);
    }

    @FXML
    private void handleViewSkills(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.VIEW_SKILLS, event);
    }

    @FXML
    private void handleQuitAction(ActionEvent event) {
        Platform.exit();
    }
}
