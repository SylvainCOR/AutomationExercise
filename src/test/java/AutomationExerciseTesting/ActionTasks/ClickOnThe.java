package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageElements.HomePage;
import AutomationExerciseTesting.PageElements.LoginPage;
import AutomationExerciseTesting.PageElements.SignupPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ClickOnThe {
    public static Performable SignUpLoginLink() {
        return Task.where("{0} clicks on the sign up / login link",
                Click.on(HomePage.SIGN_UP_LOGIN_LINK)
        );
    }
    public static Performable SignUpButton() {
        return Task.where("{0} clicks on the sign up / login link",
                Click.on(LoginPage.SIGN_UP_BUTTON)
        );
    }
    public static Performable TitleGender(String title) {
        return Task.where("{0} clicks on the title gender",
                Click.on(title.equals("Mr") ? SignupPage.TITLE_GENDER_M :
                        SignupPage.TITLE_GENDER_F)
        );
    }
}
