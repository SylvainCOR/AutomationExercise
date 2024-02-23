package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class SignupPage {
    public static Target ACCOUNT_INFO_TITLE = Target.the("account information title")
            .locatedBy("(//h2[@class='title text-center']//b)[1]");
    public static Target TITLE_GENDER_M = Target.the("gender Mr")
            .locatedBy("#id_gender1");
    public static Target TITLE_GENDER_F = Target.the("gender Mrs")
            .locatedBy("#id_gender2");
    public static Target NAME = Target.the("username")
            .locatedBy("#name");
    public static Target EMAIL = Target.the("email")
            .locatedBy("#email");
    public static Target PASSWORD = Target.the("password")
            .locatedBy("#password");
    public static Target DAY_OF_BIRTH = Target.the("day of birth")
            .locatedBy("#days");
    public static Target MONTH_OF_BIRTH = Target.the("month of birth")
            .locatedBy("#months");
    public static Target YEAR_OF_BIRTH = Target.the("year of birth")
            .locatedBy("#years");
    public static Target NEWSLETTER_CHECKBOX = Target.the("newsletter")
            .locatedBy("#newsletter");
    public static Target SPECIAL_OFFERS_CHECKBOX = Target.the("special offers")
            .locatedBy("#optin");
    public static Target ADDRESS_INFO_TITLE = Target.the("address information title")
            .locatedBy("(//h2[@class='title text-center']//b)[2]");
    public static Target FIRST_NAME = Target.the("first name")
            .locatedBy("#first_name");
    public static Target LAST_NAME = Target.the("last name")
            .locatedBy("#last_name");
    public static Target COMPANY = Target.the("company")
            .locatedBy("#company");
    public static Target ADDRESS_1 = Target.the("address 1")
            .locatedBy("#address1");
    public static Target ADDRESS_2 = Target.the("address 2")
            .locatedBy("#address2");
    public static Target COUNTRY = Target.the("country")
            .locatedBy("#country");
    public static Target STATE = Target.the("state")
            .locatedBy("#state");
    public static Target CITY = Target.the("city")
            .locatedBy("#city");
    public static Target ZIPCODE = Target.the("zipcode")
            .locatedBy("#zipcode");
    public static Target MOBILE_NUMBER = Target.the("mobile number")
            .locatedBy("#mobile_number");
}
