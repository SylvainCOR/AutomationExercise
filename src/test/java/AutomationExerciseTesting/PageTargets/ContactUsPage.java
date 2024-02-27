package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class ContactUsPage {

    public static Target CONTACT_FORM_TITLE = Target.the("contact form title")
            .locatedBy("//div[@class='contact-form']/h2");
    public static Target NAME_FIELD = Target.the("contact form name field")
            .locatedBy("//*[@name='name']");
    public static Target EMAIL_FIELD = Target.the("contact form email field")
            .locatedBy("//*[@name='email']");
    public static Target SUBJECT_FIELD = Target.the("contact form subject field")
            .locatedBy("//*[@name='subject']");
    public static Target MESSAGE_FIELD = Target.the("contact form message field")
            .locatedBy("#message");
    public static Target UPLOAD_INPUT = Target.the("contact form upload file input")
            .locatedBy("//*[@name='upload_file']");
    public static Target SUBMIT_BUTTON = Target.the("contact form submit button")
            .locatedBy("//*[@name='submit']");
    public static Target OK_BUTTON = Target.the("confirmation OK button")
            .locatedBy("//*[@name='submit']");
    public static Target SUCCESS_MESSAGE = Target.the("alert success message")
            .locatedBy("//div[@class='contact-form']/div[contains(@class,'alert-success')]");
    public static Target HOME_BUTTON = Target.the("home button")
            .locatedBy("//*[@id='form-section']/a");

}
