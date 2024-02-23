package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageTargets.SignupPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOnThe {

    public static Performable TitleGender(String title) {
        Target targetElement = switch (title.toLowerCase()) {
            case "mr" -> SignupPage.TITLE_GENDER_M;
            case "mrs" -> SignupPage.TITLE_GENDER_F;
            default -> throw new IllegalArgumentException("Invalid checkbox value: " + title);
        };
        return Task.where("{0} clicks on the title gender '" + title + "'",
                Click.on(targetElement)
        );
    }
    public static Performable SelectedCheckbox(String checkBox) {
        Target targetElement = switch (checkBox.toLowerCase()) {
            case "newsletter" -> SignupPage.NEWSLETTER_CHECKBOX;
            case "special offer" -> SignupPage.SPECIAL_OFFERS_CHECKBOX;
            default -> throw new IllegalArgumentException("Invalid checkbox value: " + checkBox);
        };
        return Task.where("{0} selects the '" + checkBox + "' checkbox",
                Click.on(targetElement)
        );
    }
}
