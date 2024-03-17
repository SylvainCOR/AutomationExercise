package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class ProductDetailsPage {

    public static Target PRODUCT_DETAILS = Target.the("product details")
            .locatedBy("//div[@class='product-details']");
    public static Target PRODUCT_NAME = Target.the("product name")
            .locatedBy("//div[@class='product-information']/h2");
    public static Target CATEGORY = Target.the("product category")
            .locatedBy("//p[contains(.,'Category')]");
    public static Target PRICE = Target.the("product price")
            .locatedBy("//*[@id='quantity']/../span");
    public static Target AVAILABILITY = Target.the("product availability")
            .locatedBy("//p[contains(.,'Availability')]");
    public static Target CONDITION = Target.the("product condition")
            .locatedBy("//p[contains(.,'Condition')]");
    public static Target BRAND = Target.the("product brand")
            .locatedBy("//p[contains(.,'Brand')]");
    public static Target QUANTITY = Target.the("quantity input")
            .locatedBy("#quantity");
    public static Target ADD_TO_CART = Target.the("add to cart button")
            .locatedBy("//button[contains(@class,'cart')]");
    public static Target WRITE_YOUR_REVIEW = Target.the("write your review text")
            .locatedBy("//*[@class='active']/a");
    public static Target NAME = Target.the("name field")
            .locatedBy("#name");
    public static Target EMAIL = Target.the("email field")
            .locatedBy("#email");
    public static Target REVIEW = Target.the("review field")
            .locatedBy("//*[@name='review']");
    public static Target SUBMIT_BUTTON = Target.the("submit button")
            .locatedBy("#button-review");
    public static Target REVIEW_SUCCESS_MESSAGE = Target.the("review success message")
            .locatedBy("//*[@id='review-section']//span");
}
