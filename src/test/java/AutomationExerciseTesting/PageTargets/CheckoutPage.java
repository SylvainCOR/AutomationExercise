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
    public static Target DELIVERY_FIRSTNAME_LASTNAME = Target.the("delivery address details names")
            .locatedBy("//*[@id='address_delivery']/li[contains(@class,'firstname')]");
    public static Target DELIVERY_COMPANY = Target.the("delivery address details company")
            .locatedBy("(//*[@id='address_delivery']/li[contains(@class,'address1')])[1]");
    public static Target DELIVERY_ADDRESS_1 = Target.the("delivery address details address1")
            .locatedBy("(//*[@id='address_delivery']/li[contains(@class,'address1')])[2]");
    public static Target DELIVERY_ADDRESS_2 = Target.the("delivery address details address2")
            .locatedBy("(//*[@id='address_delivery']/li[contains(@class,'address1')])[3]");
    public static Target DELIVERY_CITY_STATE_ZIP = Target.the("delivery address details city")
            .locatedBy("//*[@id='address_delivery']/li[contains(@class,'city')]");
    public static Target DELIVERY_COUNTRY = Target.the("delivery address details country")
            .locatedBy("//*[@id='address_delivery']/li[contains(@class,'country')]");
    public static Target DELIVERY_PHONE = Target.the("delivery address details phone number")
            .locatedBy("//*[@id='address_delivery']/li[contains(@class,'phone')]");
    public static Target BILLING_FIRSTNAME_LASTNAME = Target.the("billing address details names")
            .locatedBy("//*[@id='address_invoice']/li[contains(@class,'firstname')]");
    public static Target BILLING_COMPANY = Target.the("billing address details company")
            .locatedBy("(//*[@id='address_invoice']/li[contains(@class,'address1')])[1]");
    public static Target BILLING_ADDRESS_1 = Target.the("billing address details address1")
            .locatedBy("(//*[@id='address_invoice']/li[contains(@class,'address1')])[2]");
    public static Target BILLING_ADDRESS_2 = Target.the("billing address details address2")
            .locatedBy("(//*[@id='address_invoice']/li[contains(@class,'address1')])[3]");
    public static Target BILLING_CITY_STATE_ZIP = Target.the("billing address details city")
            .locatedBy("//*[@id='address_invoice']/li[contains(@class,'city')]");
    public static Target BILLING_COUNTRY = Target.the("billing address details country")
            .locatedBy("//*[@id='address_invoice']/li[contains(@class,'country')]");
    public static Target BILLING_PHONE = Target.the("billing address details phone number")
            .locatedBy("//*[@id='address_invoice']/li[contains(@class,'phone')]");
}
