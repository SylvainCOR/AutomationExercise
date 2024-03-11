package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentPage {

    public static Target PAYMENT_TITLE = Target.the("payment title")
            .locatedBy("//*[@class='heading']");
    public static Target NAME_ON_CARD = Target.the("name on card field")
            .locatedBy("//*[@name='name_on_card']");
    public static Target CARD_NUMBER = Target.the("card number field")
            .locatedBy("//*[@name='card_number']");
    public static Target CVC = Target.the("cvc field")
            .locatedBy("//*[@name='cvc']");
    public static Target MONTH_OF_EXPIRATION = Target.the("month of expiration field")
            .locatedBy("//*[@name='expiry_month']");
    public static Target YEAR_OF_EXPIRATION = Target.the("year of expiration field")
            .locatedBy("//*[@name='expiry_year']");
    public static Target PAY_AND_CONFIRM_ORDER = Target.the("pay and order confirm button")
            .locatedBy("#submit");
}
