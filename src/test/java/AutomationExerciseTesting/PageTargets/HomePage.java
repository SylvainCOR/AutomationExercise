package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://automationexercise.com/")
public class HomePage extends PageObject {

    public static Target HOME_LINK = Target.the("header home link")
            .locatedBy("//*[contains(@class,'home')]");
    public static Target SIGN_UP_LOGIN_LINK = Target.the("header signup login link")
            .locatedBy("//a[contains(.,'Signup')]");
    public static Target LOGGED_IN = Target.the("header logged in as username link")
            .locatedBy("//header//a[@class]");
    public static Target DELETE_ACCOUNT = Target.the("header delete account link")
            .locatedBy("//*[contains(@href,'delete')]");
    public static Target SUBSCRIBE_BUTTON = Target.the("footer subscribe button")
            .locatedBy("#subscribe");
}
