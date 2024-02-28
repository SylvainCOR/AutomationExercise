package AutomationExerciseTesting.ActionTasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class DialogBox {

    public static Performable ConfirmAction(Actor actor) {
        BrowseTheWeb.as(actor).getAlert().accept();
        return null;
    }
}
