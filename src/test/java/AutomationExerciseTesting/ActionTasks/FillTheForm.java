package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageTargets.ContactUsPage;
import AutomationExerciseTesting.PageTargets.LoginPage;
import AutomationExerciseTesting.PageTargets.SignupPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Value;

public class FillTheForm {

    public static Performable ToSignUp(String name, String email) {
        return Task.where("{0} enters name and email",
                Enter.theValue(name).into(LoginPage.SIGN_UP_NAME_FIELD),
                Enter.theValue(email).into(LoginPage.SIGN_UP_EMAIL_FIELD)
        );
    }
    public static Performable ToLogIn(String email, String password) {
        return Task.where("{0} enters email and password",
                Enter.theValue(email).into(LoginPage.LOG_IN_EMAIL_FIELD),
                Enter.theValue(password).into(LoginPage.LOG_IN_PASSWORD_FIELD)
        );
    }
    public static Performable WithAccountInformation(String title, String name, String email, String password, String dateOfBirth) {
        return Task.where("{0} fills account information details",
                SelectThe.TitleGender(title),
                Ensure.that(Value.of(SignupPage.NAME).asString()).isEqualTo(name),
                Ensure.that(Value.of(SignupPage.EMAIL).asString()).isEqualTo(email),
                Enter.theValue(password).into(SignupPage.PASSWORD),
                Scroll.to(SignupPage.DAY_OF_BIRTH),
                SelectFromDropDown.DayMonthAndYearOfThe(dateOfBirth)
                );
    }
    public static Performable WithAddressInformation(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String number) {
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
    public static Performable ToContactSupport(String name, String email, String subject, String message) {
        return Task.where("{0} fills details to contact support",
                Enter.theValue(name).into(ContactUsPage.NAME_FIELD),
                Enter.theValue(email).into(ContactUsPage.EMAIL_FIELD),
                Enter.theValue(subject).into(ContactUsPage.SUBJECT_FIELD),
                Enter.theValue(message).into(ContactUsPage.MESSAGE_FIELD)
                );
    }
}