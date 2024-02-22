package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

public class NavigateTo {

    static Target HOME_LINK = Target.the("home link")
            .locatedBy("//*[contains(@class,'home')]");

    public static Performable theAutomationExerciseHomePage() {
        return Task.where("{0} opens the AutomationExercise home page",
                Open.browserOn().the(HomePage.class),
                Ensure.that("Subscribe button is visible", Visibility.of(HOME_LINK)).isTrue()
        );
    }
}
