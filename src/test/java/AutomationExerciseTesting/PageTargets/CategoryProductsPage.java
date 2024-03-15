package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class CategoryProductsPage {

    public static Target SELECTED_CATEGORY_TITLE = Target.the("title of the selected category")
            .locatedBy("//*[@class='features_items']/h2");
}
