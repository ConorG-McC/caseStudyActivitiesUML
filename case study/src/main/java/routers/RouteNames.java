package routers;

public enum RouteNames {
    HOME("home.fxml"),
    MANAGER_MENU("manager_menu.fxml"),
    STAFFUSER_MENU("staffuser_menu.fxml"),

    VIEW_STAFF("view_staff.fxml"),
    ADD_EDIT_STAFF("add_edit_staff.fxml"),

    VIEW_SKILLS("view_skills.fxml"),
    ADD_EDIT_DELETE_SKILLS("add_edit_delete_skills.fxml"),

    VIEW_USER_DETAILS("view_user_details.fxml"),
    EDIT_USER_DETAILS("edit_user_details.fxml");


    public final String location;
    private final String VIEW_PATH = "/views/";

    RouteNames(String location) {
        this.location = VIEW_PATH + location;
    }
}