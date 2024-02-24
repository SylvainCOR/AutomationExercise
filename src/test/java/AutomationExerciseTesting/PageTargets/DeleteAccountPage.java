package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class DeleteAccountPage {

    public static Target DELETE_ACCOUNT_TITLE = Target.the("delete account title")
            .locatedBy("//h2/b");
    public static Target CONTINUE_BUTTON = Target.the("continue button")
            .locatedBy("//div[@class='pull-right']/a");


}
