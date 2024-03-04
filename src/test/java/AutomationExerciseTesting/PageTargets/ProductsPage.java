package AutomationExerciseTesting.PageTargets;


import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {

    public static Target PRODUCTS_LIST_TITLE = Target.the("products list title")
            .locatedBy("//div[@class='features_items']/h2");
    public static Target PRODUCTS_LIST = Target.the("products list")
            .locatedBy("//div[@class='features_items']");
    public static Target FIRST_VIEW_PRODUCT = Target.the("view product link of first product")
            .locatedBy("(//a[contains(.,'View Product')])[1]");
    public static Target SEARCH_INPUT = Target.the("input field of research")
            .locatedBy("//*[@id='search_product']");
    public static Target SEARCH_BUTTON = Target.the("search button")
            .locatedBy("//*[@id='submit_search']");
    public static Target PRODUCT_NAME = Target.the("product name")
            .locatedBy("//div[contains(@class,'productinfo')]/p");

}
