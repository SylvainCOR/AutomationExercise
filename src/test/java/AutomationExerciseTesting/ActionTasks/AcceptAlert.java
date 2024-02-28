package AutomationExerciseTesting.ActionTasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AcceptAlert {

    public static Performable OkButton(Actor actor) {
        return Task.where("{0} accepts success alert",
                BrowseTheWeb.as(actor).getDriver(),
                actor -> {
                    WebDriver driver = BrowseTheWeb.as(actor).getDriver();
                    Alert alert = driver.switchTo().alert();
                    alert.accept();
                }
        ).performAs(actor);
    }
}
