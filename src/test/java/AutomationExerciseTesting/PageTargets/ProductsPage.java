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
    public static Target FIRST_IMG_PRODUCT = Target.the("image of first product")
            .locatedBy("(//*[@class='single-products']//img)[1]");
    public static Target FIRST_OVERLAY_ADD_TO_CART = Target.the("add to cart overlay link of first product")
            .locatedBy("(//*[@class='overlay-content']/a)[1]");
    public static Target FIRST_OVERLAY_PRICE = Target.the("price overlay link of first product")
            .locatedBy("(//*[@class='overlay-content']/h2)[1]");
    public static Target FIRST_OVERLAY_NAME = Target.the("product name overlay link of first product")
            .locatedBy("(//*[@class='overlay-content']/p)[1]");
    public static Target CONTINUE_SHOPPING = Target.the("continue shopping button")
            .locatedBy("//*[contains(@class,'btn-success')]");
    public static Target VIEW_CART = Target.the("view cart button")
            .locatedBy("//*[@id='cartModal']//u");
    public static Target SECOND_IMG_PRODUCT = Target.the("image of first product")
            .locatedBy("(//*[@class='single-products']//img)[2]");
    public static Target SECOND_OVERLAY_ADD_TO_CART = Target.the("add to cart overlay link of first product")
            .locatedBy("(//*[@class='overlay-content']/a)[2]");
    public static Target SECOND_OVERLAY_PRICE = Target.the("price overlay link of second product")
            .locatedBy("(//*[@class='overlay-content']/h2)[2]");
    public static Target SECOND_OVERLAY_NAME = Target.the("product name overlay link of second product")
            .locatedBy("(//*[@class='overlay-content']/p)[2]");
}
