package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageTargets.ContactUsPage;
import AutomationExerciseTesting.PageTargets.PaymentPage;
import AutomationExerciseTesting.PageTargets.SignupPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Value;
import net.serenitybdd.screenplay.targets.Target;

public class FillFormDetailsIn {

    public static Performable AccountInformation(String title, String name, String email, String password, String date) {
        Target targetElement = switch (title.toLowerCase()) {
            case "mr" -> SignupPage.TITLE_GENDER_M;
            case "mrs" -> SignupPage.TITLE_GENDER_F;
            default -> throw new IllegalArgumentException("Invalid checkbox value: " + title);
        };
        return Task.where("{0} fills account information details",
                Click.on(targetElement),
                Ensure.that(Value.of(SignupPage.NAME).asString()).isEqualTo(name),
                Ensure.that(Value.of(SignupPage.EMAIL).asString()).isEqualTo(email),
                Enter.theValue(password).into(SignupPage.PASSWORD),
                Scroll.to(SignupPage.DAY_OF_BIRTH),
                ParseTheDate.DateOfBirth(date)
        );
    }
    public static Performable AddressInformation(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String number) {
        return Task.where("{0} fills address information details",
                Enter.theValue(firstName).into(SignupPage.FIRST_NAME),
                Enter.theValue(lastName).into(SignupPage.LAST_NAME),
                Enter.theValue(company).into(SignupPage.COMPANY),
                Enter.theValue(address).into(SignupPage.ADDRESS_1),
                Enter.theValue(address2).into(SignupPage.ADDRESS_2),
                Scroll.to(SignupPage.COUNTRY),
                SelectFromOptions.byVisibleText(country).from(SignupPage.COUNTRY),
                Enter.theValue(state).into(SignupPage.STATE),
                Enter.theValue(city).into(SignupPage.CITY),
                Enter.theValue(zipcode).into(SignupPage.ZIPCODE),
                Enter.theValue(number).into(SignupPage.MOBILE_NUMBER)
        );
    }
    public static Performable ContactSupport(String name, String email, String subject, String message) {
        return Task.where("{0} fills details to contact support",
                Enter.theValue(name).into(ContactUsPage.NAME_FIELD),
                Enter.theValue(email).into(ContactUsPage.EMAIL_FIELD),
                Enter.theValue(subject).into(ContactUsPage.SUBJECT_FIELD),
                Enter.theValue(message).into(ContactUsPage.MESSAGE_FIELD)
                );
    }

    public static Performable Payment(String lastName, String cardNumber, String cvc, String expiration) {
        return Task.where("{0} fills details to confirm payment",
                Enter.theValue(lastName).into(PaymentPage.NAME_ON_CARD),
                Enter.theValue(cardNumber).into(PaymentPage.CARD_NUMBER),
                Enter.theValue(cvc).into(PaymentPage.CVC),
                ParseTheDate.ExpirationDate(expiration)
        );
    }
}