package AutomationExerciseTesting.Pages;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static Target SIGN_UP_FORM_TITLE = Target.the("signup form title")
            .locatedBy("//*[@class='signup-form']/h2");

//    public static Target LOG_IN_FORM_TITLE = Target.the("login form title")
//            .locatedBy("//*[@class='login-form']/h2");

}
