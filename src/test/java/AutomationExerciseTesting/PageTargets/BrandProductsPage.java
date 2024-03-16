package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class BrandProductsPage {

    public static Target SELECTED_BRAND_TITLE = Target.the("title of the selected brand")
            .locatedBy("//*[@class='features_items']/h2");
    public static Target BIBA_BRAND = Target.the("BIBA brand in left side bar")
            .locatedBy("//a[text()='Biba']");
}
