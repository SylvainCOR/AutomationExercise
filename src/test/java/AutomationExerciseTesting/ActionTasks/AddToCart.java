package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageTargets.HomePage;
import AutomationExerciseTesting.PageTargets.ProductsPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HoverOverTarget;

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

    public static Performable ProductsOfList(String... productNames) {
        List<Performable> tasks = new ArrayList<>();
        for (String product : productNames) {
            tasks.add(HoverOverTarget.over(ProductsPage.PRODUCT_IMAGE(product)));
            tasks.add(Click.on(ProductsPage.OVERLAY_ADD_TO_CART(product)));
            tasks.add(Click.on(ProductsPage.CONTINUE_SHOPPING));
        }
        return Task.where(tasks.toArray(new Performable[0]));
    }
}
