import Domain.Manager;
import Domain.StaffUser;
import Domain.User;
import globals.classENUMS.JobRole;
import globals.classENUMS.SystemRole;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.LabeledMatchers;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTests {
    public static void main(String[] args) {

        Manager manager1 = new Manager("ConorG-McC","123", SystemRole.ADMIN, "Conor", "McCloskey");
        StaffUser staff1 = new StaffUser("ReeceT","123",SystemRole.StaffUser, "Reece", "Turner", JobRole.SENIOR_DEV);

        //Show Users are created
        System.out.println("Manager Details");
        System.out.println(manager1);

        System.out.println("\nStaff Details");
        System.out.println(staff1);

        manager1.addStaff(staff1);
        ShowStaffManaged(manager1);

        manager1.removeStaff(staff1);
        ShowStaffManaged(manager1);

    }

    private static void ShowStaffManaged(Manager manager1) {
        System.out.println("\nStaff Managed by "+ manager1.getFirstName()+ " " + manager1.getSurname());
        for (StaffUser s : manager1.viewStaffManaged()){
            System.out.println(s);
        }
    }

}


//@ExtendWith(ApplicationExtension.class)
//public class MainTests extends ApplicationTest {
//    final String DUMMY_MODULE_NAME = "test";
//    final String BLANK_TEXT = "";
//    final String MODULE_LIST= "#moduleList";
//    final String MODULE_NAME_TEXTFIELD = "#moduleName";
//
//    @Start
//    public void start(Stage stage) throws Exception {
//        MainApp appToTest = new MainApp();
//        Stage newStage = new Stage();//Avoids initStage error with multi-tests
//        appToTest.start(newStage);
//    }
//
//    @After
//    public void tearDown () throws Exception {
//        FxToolkit.hideStage();
//    }
//
//
//    @Test
//    @DisplayName("When the application is loaded then the Main Menu page is displayed")
//    void test01(FxRobot robot) {
//        Label label = robot.lookup(".label").query();
//        FxAssert.verifyThat(label, LabeledMatchers.hasText("Main Menu"));
//    }
//
//    @Test
//    @DisplayName("When the Add Module is linked then the Add New Module page is displayed")
//    void test02(FxRobot robot) {
//        FxAssert.verifyThat("#addNewModuleLink", LabeledMatchers.hasText("Add Module"));
//    }
//
//    @Test
//    @DisplayName("When a new module with a valid name is added then the module is visible in the list of modules")
//    void test03(FxRobot robot) {
//        Hyperlink addNewModuleLink = robot.lookup("#addNewModuleLink").query();
//
//        robot.clickOn(addNewModuleLink);
//        robot.clickOn(MODULE_NAME_TEXTFIELD);
//        robot.write(DUMMY_MODULE_NAME);
//
//        robot.clickOn("Add New Module");
//        DialogPane dialog =  robot.lookup(".dialog-pane").query(); //Confirm Dialog
//        assertEquals("Module added", dialog.getContentText());
//        robot.clickOn("OK");//On Dialog
//
//        TextField name = robot.lookup(MODULE_NAME_TEXTFIELD).query();
//        assertEquals(BLANK_TEXT, name.getText());
//
//        Hyperlink viewModuleLink = robot.lookup("#viewModuleLink").query();
//        robot.clickOn(viewModuleLink);
//
//        ListView<Module> moduleList =  robot.lookup(MODULE_LIST).query();
//        assertTrue(checkListViewForItem(moduleList));
//    }
//
//    boolean checkListViewForItem(ListView<Module> list){
//        for(Module m : list.getItems()){
//            if(m.getName().equals(DUMMY_MODULE_NAME)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Test
//    @DisplayName("When a new module with an invalid name is added then the module is rejected")
//    void test04(FxRobot robot) {
//        Hyperlink addNewModuleLink = robot.lookup("#addNewModuleLink").query();
//
//        robot.clickOn(addNewModuleLink);
//        TextField name = robot.lookup("#moduleName").query();
//        name.setText(BLANK_TEXT);
//        robot.clickOn("Add New Module");
//
//        DialogPane dialog =  robot.lookup(".dialog-pane").query(); //Error Dialog
//        assertEquals("name must not be blank", dialog.getContentText());
//    }
//}