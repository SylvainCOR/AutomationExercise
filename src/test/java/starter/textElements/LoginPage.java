package starter.textElements;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static Target SIGN_UP_FORM_TITLE = Target.the("signup form title")
            .locatedBy("//*[@class='signup-form']/h2");

}
