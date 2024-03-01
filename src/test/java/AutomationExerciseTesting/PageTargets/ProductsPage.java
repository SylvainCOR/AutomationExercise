package AutomationExerciseTesting.PageTargets;


import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {

    public static Target PRODUCTS_LIST_TITLE = Target.the("title of products list")
            .locatedBy("//div[@class='features_items']/h2");
    public static Target PRODUCTS_LIST = Target.the("title of products list")
            .locatedBy("//div[@class='features_items']");
    public static Target FIRST_VIEW_PRODUCT = Target.the("view product link of forst product")
            .locatedBy("(//a[contains(.,'View Product')])[1]");
}
