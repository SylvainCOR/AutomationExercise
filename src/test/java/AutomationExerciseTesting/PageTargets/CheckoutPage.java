package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

    public static Target ADDRESS_DETAILS = Target.the("address details title")
            .locatedBy("(//*[@class='heading'])[1]");
    public static Target REVIEW_YOUR_ORDER = Target.the("review your order title")
            .locatedBy("(//*[@class='heading'])[2]");
    public static Target TEXT_AREA = Target.the("text area zone")
            .locatedBy("//*[@name='message']");
    public static Target PLACE_ORDER = Target.the("place order button")
            .locatedBy("//*[contains(@class,'check_out')]");
}
