package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageTargets.LoginPage;
import AutomationExerciseTesting.PageTargets.SignupPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import java.text.ParseException;

public class FillTheFormWith {

    public static Performable NameAndEmail(String name, String email) {
        return Task.where("{0} enters name and email",
                Enter.theValue(name).into(LoginPage.SIGN_UP_NAME_FIELD),
                Enter.theValue(email).into(LoginPage.SIGN_UP_EMAIL_FIELD)
        );
    }
    public static Performable AccountInformationDetails(String title, String name, String email, String password, String dateOfBirth) {
        return Task.where("{0} fills account information details",
                ClickOnThe.TitleGender(title),
                CompareTextOfThe.NameProvided(name),
                CompareTextOfThe.EmailProvided(email),
                Enter.theValue(password).into(SignupPage.PASSWORD),
                SelectFromDropDown.DayMonthAndYearOfThe(dateOfBirth)
                );
    }
}
