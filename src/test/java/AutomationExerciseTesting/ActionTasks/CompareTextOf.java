package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.Pages.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

public class CompareTextOf {

    @SuppressWarnings("unchecked")
    public static Performable theSignupFormTitleWith(String expectedString) {
        return Task.where("{0} can see the expected title",
                Ensure.that("text of signup form title is correct",
                        Text.of(LoginPage.SIGN_UP_FORM_TITLE)).isEqualToIgnoringCase(expectedString)
        );
    }

}
