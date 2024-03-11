package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentDonePage {
    public static Target CONGRATS_MESSAGE = Target.the("congratulations message")
            .locatedBy("//*[@id='form']//p");
}
