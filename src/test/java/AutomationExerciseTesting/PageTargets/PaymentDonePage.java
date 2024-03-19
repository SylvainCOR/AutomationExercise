package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentDonePage {
    public static Target CONGRATS_MESSAGE = Target.the("congratulations message")
            .locatedBy("//*[@id='form']//p");
    public static Target DOWNLOAD_INVOICE = Target.the("download invoice button")
            .locatedBy("//*[contains(@class,'check_out')]");
    public static Target CONTINUE = Target.the("continue button")
            .locatedBy("//*[contains(@class,'primary')]");

}
