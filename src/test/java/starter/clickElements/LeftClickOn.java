package starter.clickElements;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class LeftClickOn {
    public static Performable theSignUpLoginButton() {
        return Task.where("{0} click on the sign up / login button ",
                Click.on(Clickable.SIGN_UP_LOGIN_BUTTON)
        );
    }
}
