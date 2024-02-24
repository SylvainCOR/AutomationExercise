package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class AccountCreatedPage {

    public static Target ACCOUNT_CREATED_TITLE = Target.the("account created title")
            .locatedBy("//h2/b");
    public static Target CONTINUE_BUTTON = Target.the("continue button")
            .locatedBy("//div[@class='pull-right']/a");


}
