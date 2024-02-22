package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageElements.SignupPage;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SelectDate {
SelectFromOptions.byVisibleText(dateOfBirth).from(SignupPage.DAY_OF_BIRTH)
}
