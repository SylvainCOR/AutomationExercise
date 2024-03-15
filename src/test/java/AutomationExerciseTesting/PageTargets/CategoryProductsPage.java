package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class CategoryProductsPage {

    public static Target SELECTED_CATEGORY_TITLE = Target.the("title of the selected category")
            .locatedBy("//*[@class='features_items']/h2");
    public static Target MEN_CATEGORY = Target.the("men category link")
            .locatedBy("//*[@href='#Men']");
    public static Target JEANS_SUBCATEGORY = Target.the("jeans sub-category link")
            .locatedBy("//*[@id='Men']//a[text()='Jeans ']");
}
