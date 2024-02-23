package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static Target SIGN_UP_TITLE = Target.the("signup form title")
            .locatedBy("//*[@class='signup-form']/h2");
    public static Target SIGN_UP_NAME_FIELD = Target.the("signup form name field")
            .locatedBy("//*[@name='name']");
    public static Target SIGN_UP_EMAIL_FIELD = Target.the("signup form email field")
            .locatedBy("//*[@class='signup-form']//*[@name='email']");
    public static Target SIGN_UP_BUTTON = Target.the("signup form button")
            .locatedBy("//div[@class='signup-form']//button");

    public static Target LOG_IN_TITLE = Target.the("login form title")
            .locatedBy("//*[@class='login-form']/h2");
    public static Target LOG_IN_EMAIL_FIELD = Target.the("login form email field")
            .locatedBy("//*[@class='login-form']//*[@name='email']");
    public static Target LOG_IN_PASSWORD_FIELD = Target.the("login form password field")
            .locatedBy("//*[@name='password']");
    public static Target LOG_IN_BUTTON = Target.the("login form button")
            .locatedBy("//*[@class='login-form']//button");

}
