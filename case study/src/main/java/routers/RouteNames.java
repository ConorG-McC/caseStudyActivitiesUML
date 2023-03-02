package routers;

public enum RouteNames {
    HOME("home.fxml"),
    MANAGER_MENU("manager_menu.fxml"),
    STAFFUSER_MENU("staffuser_menu.fxml"),
    ADD_MODULE("add_module.fxml"),
    EDIT_MODULE("edit_module.fxml"),
    SHOW_MODULES("show_modules.fxml");

    public final String location;
    private final String VIEW_PATH = "/views/";

    RouteNames(String location) {
        this.location = VIEW_PATH + location;
    }
}