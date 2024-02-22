package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageElements.LoginPage;
import AutomationExerciseTesting.PageElements.SignupPage;
import io.cucumber.java.it.Date;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromElement;

public class FillTheFormWith {

    public static Performable NameAndEmail(String name, String email) {
        return Task.where("{0} enters'" + name + "' and '" + email + "'",
                Enter.theValue(name).into(LoginPage.SIGN_UP_NAME_FIELD),
                Enter.theValue(email).into(LoginPage.SIGN_UP_EMAIL_FIELD)
        );
    }
    public static Performable AccountInformationDetails(String title, String name, String email, String password, Date dateOfBirth) {
        return Task.where("{0} fills details '" + title + "' '" + name + "' '" + email + "' '" + password + "' '" + dateOfBirth + "'",
                ClickOnThe.TitleGender(title),
                CompareTextOfThe.NameProvided(name),
                CompareTextOfThe.EmailProvided(email),
                Enter.theValue(password).into(SignupPage.PASSWORD),
                SelectDate.FromDropDown(dateOfBirth)
                );
    }
}
