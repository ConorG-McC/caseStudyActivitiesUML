package controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import routers.RouteNames;
import routers.Router;

import java.io.IOException;

public class ManagerNavBarController {

    @FXML
    private void handleReturnHome(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.HOME, event);
    }

    @FXML
    private void handleViewAllStaff(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.VIEW_ALL_STAFF, event);
    }

    @FXML
    private void handleAddEditStaff(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.ADD_EDIT_STAFF, event);
    }

    @FXML
    private void handleViewSkills(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.VIEW_SKILLS, event);
    }

    @FXML
    private void handleAddEditDeleteSkills(ActionEvent event)throws IOException {
        Router.changeRoute(RouteNames.ADD_EDIT_DELETE_SKILLS, event);
    }

    @FXML
    private void handleQuitAction(ActionEvent event) {
        Platform.exit();
    }
}
