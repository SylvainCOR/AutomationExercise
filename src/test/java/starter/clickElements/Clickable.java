package starter.clickElements;

import net.serenitybdd.screenplay.targets.Target;

public class Clickable {
    static Target SIGN_UP_LOGIN_BUTTON = Target.the("signup login button")
            .locatedBy("//a[contains(.,'Signup')]");

}
