import general.ScreenHelp;
import globals.Constants;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) {
        try {
            stage.hide();
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource(Constants.VIEW_PATH + "home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            root.getStylesheets()
                    .add(getClass()
                            .getResource(Constants.CSS_FILE)
                            .toExternalForm());
            stage.setResizable(false);
            stage.setTitle("Student Module Example");
            stage.initStyle(StageStyle.UNDECORATED); //Remove min, max and close buttons
            stage.setScene(scene);
            stage.show();
            stage.isAlwaysOnTop();
            ScreenHelp.centreScreen(stage);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}