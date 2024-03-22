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
    public static Target PRODUCT_IMAGE(String productName) {
        return Target.the("image of product" + productName)
                .locatedBy("//*[@class='single-products']" +
                        "//p[.='" + productName + "']/../img");
    }
    public static Target OVERLAY_ADD_TO_CART(String productName) {
        return Target.the("add to cart overlay button of" + productName)
                .locatedBy("//*[@class='features_items']" +
                        "//div[@class='product-overlay'][contains(.,'" + productName + "')]//a");
    }
    public static Target FIRST_IMG_PRODUCT = Target.the("image of first product")
            .locatedBy("(//*[@class='single-products']//img)[1]");
    public static Target FIRST_OVERLAY_PRICE = Target.the("price overlay link of first product")
            .locatedBy("(//*[@class='overlay-content']/h2)[1]");
    public static Target FIRST_OVERLAY_NAME = Target.the("product name overlay link of first product")
            .locatedBy("(//*[@class='overlay-content']/p)[1]");
    public static Target CONTINUE_SHOPPING = Target.the("continue shopping button")
            .locatedBy("//*[@id='cartModal']//button");
    public static Target VIEW_CART = Target.the("view cart button")
            .locatedBy("//*[@id='cartModal']//u");
    public static Target SECOND_IMG_PRODUCT = Target.the("image of first product")
            .locatedBy("(//*[@class='single-products']//img)[2]");
    public static Target SECOND_OVERLAY_PRICE = Target.the("price overlay link of second product")
            .locatedBy("(//*[@class='overlay-content']/h2)[2]");
    public static Target SECOND_OVERLAY_NAME = Target.the("product name overlay link of second product")
            .locatedBy("(//*[@class='overlay-content']/p)[2]");
    public static Target BRANDS_TITLE = Target.the("brands products title in left side bar")
            .locatedBy("//*[@class='brands_products']/h2");
    public static Target HM_BRAND = Target.the("H&M brand in left side bar")
            .locatedBy("//a[text()='H&M']");
    public static Target POLO_TSHIRTS_VIEW_PRODUCT = Target.the("polo view product")
            .locatedBy("//div[@class='product-image-wrapper'][contains(.,'Polo')]//*[text()='View Product']");
}
