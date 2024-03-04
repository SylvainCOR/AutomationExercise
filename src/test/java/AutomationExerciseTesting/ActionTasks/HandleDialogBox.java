package AutomationExerciseTesting.ActionTasks;

import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class HandleDialogBox {

    public static Actor.ErrorHandlingMode ConfirmAlert(WebDriver driver) {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("There's no dialog box");
        }
        return null;
    }
}
