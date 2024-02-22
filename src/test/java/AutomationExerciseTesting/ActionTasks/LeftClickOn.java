package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.Pages.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class LeftClickOn {
    public static Performable theSignUpLoginLink() {
        return Task.where("{0} click on the sign up / login link ",
                //Click.on(HomePage.SIGN_UP_LOGIN_LINK)
                Click.on(HomePage.SIGN_UP_LOGIN_LINK)
        );
    }
}
