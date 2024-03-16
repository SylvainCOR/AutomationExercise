package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageTargets.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

public class AddToCart {

    public static Performable MultipleProducts(Integer number) {
        List<Performable> tasks = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            String pathToAdd = HomePage.ADD_TO_CART.getCssOrXPathSelector() + "[" + i + "]";
            tasks.add(Click.on(pathToAdd));
            tasks.add(Click.on(HomePage.CONTINUE_SHOPPING));
        }
        return Task.where(tasks.toArray(new Performable[0]));
    }
}
