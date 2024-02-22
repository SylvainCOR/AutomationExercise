package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.Pages.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Visibility;

public class NavigateTo {

    public static Performable theAutomationExerciseHomePage() {
        return Task.where("{0} opens the AutomationExercise home page",
                Open.browserOn().the(HomePage.class),
                Ensure.that("Subscribe button is visible",
                        Visibility.of(HomePage.HOME_LINK)).isTrue()
        );
    }
}
