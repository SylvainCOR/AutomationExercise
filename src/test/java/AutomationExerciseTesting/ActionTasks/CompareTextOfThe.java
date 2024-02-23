package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageTargets.LoginPage;
import AutomationExerciseTesting.PageTargets.SignupPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

public class CompareTextOfThe {

    @SuppressWarnings("unchecked")
    public static Performable SignUpTitleWith(String expectedString) {
        return Task.where("{0} can see the expected title",
                Ensure.that("check if signup form title is correct",
                        Text.of(LoginPage.SIGN_UP_TITLE))
                        .isEqualToIgnoringCase(expectedString)
        );
    }
    @SuppressWarnings("unchecked")
    public static Performable AccountInfoTitleWith(String expectedString) {
        return Task.where("{0} can see the expected title",
                Ensure.that("check if account information title is correct",
                        Text.of(SignupPage.ACCOUNT_INFO_TITLE))
                        .isEqualToIgnoringCase(expectedString)
        );
    }
    @SuppressWarnings("unchecked")
    public static Performable NameProvided(String expectedName) {
        return Task.where("{0} enters account information details",
                Ensure.that("check if name is already provided",
                        Value.of(SignupPage.NAME).asString()).isEqualTo(expectedName)
        );
    }
    @SuppressWarnings("unchecked")
    public static Performable EmailProvided(String expectedEmail) {
        return Task.where("{0} enters account information details",
                Ensure.that("check if email is already provided",
                        Value.of(SignupPage.EMAIL).asString()).isEqualTo(expectedEmail)

        );
    }
}
