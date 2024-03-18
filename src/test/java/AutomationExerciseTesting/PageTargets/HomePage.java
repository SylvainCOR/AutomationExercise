package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://automationexercise.com/")
public class HomePage extends PageObject {

    public static Target HOME_LINK = Target.the("header home link")
            .locatedBy("//i[contains(@class,'home')]/..");
    public static Target SIGN_UP_LOGIN_LINK = Target.the("header signup login link")
            .locatedBy("//i[contains(@class,'lock')]/..");
    public static Target LOGGED_IN = Target.the("header logged in as username link")
            .locatedBy("//i[contains(@class,'user')]/..");
    public static Target LOG_OUT_LINK = Target.the("header log out link")
            .locatedBy("//i[contains(@class,'lock')]/..");
    public static Target DELETE_ACCOUNT = Target.the("header delete account link")
            .locatedBy("//i[contains(@class,'trash')]/..");
    public static Target CONTACT_US_BUTTON = Target.the("contact us link")
            .locatedBy("//i[contains(@class,'envelope')]/..");
    public static Target SLIDER_CAROUSEL = Target.the("presentation carousel")
            .locatedBy("#slider-carousel");
    public static Target TEST_CASES_BUTTON = Target.the("test cases link")
            .locatedBy("//a[@href='/test_cases']/i");
    public static Target PRODUCTS_BUTTON = Target.the("products link")
            .locatedBy("//i[contains(@class,'card_travel')]/..");
    public static Target FOOTER = Target.the("footer")
            .locatedBy("#footer");
    public static Target SUBSCRIBE_TITLE = Target.the("subscribe title")
            .locatedBy("//*[@id='footer']//h2");
    public static Target SUBSCRIBE_INPUT = Target.the("input email")
            .locatedBy("#susbscribe_email");
    public static Target SUBSCRIBE_BUTTON = Target.the("arrow button")
            .locatedBy("#subscribe");
    public static Target SUCCESS_MESSAGE = Target.the("success message")
            .locatedBy("//*[@id='success-subscribe']/div");
    public static Target CART_BUTTON = Target.the("cart link")
            .locatedBy("//i[contains(@class,'cart')]/..");
    public static Target LAST_VIEW_PRODUCT = Target.the("view product link of last product")
            .locatedBy("(//a[contains(.,'View Product')])[last()]");
    public static Target ADD_TO_CART = Target.the("add to cart button")
            .locatedBy("(//div[contains(@class,'info')]/a)");
    public static Target CONTINUE_SHOPPING = Target.the("continue shopping button")
            .locatedBy("//*[@id='cartModal']//button");
    public static Target CATEGORY_TITLE = Target.the("categories on left side bar")
            .locatedBy("#accordian");
    public static Target WOMEN_CATEGORY = Target.the("women category link")
            .locatedBy("//*[@href='#Women']");
    public static Target DRESS_SUBCATEGORY = Target.the("dress sub-category link")
            .locatedBy("//*[@id='Women']//a[text()='Dress ']");
    public static Target RECOMMENDED_ITEMS_TITLE = Target.the("recommended items title")
            .locatedBy("//*[@class='recommended_items']/h2");
    public static Target ADD_TO_CART_RECOMMENDED_PRODUCT(String productName) {
        return Target.the("add to cart button of" + productName)
                .locatedBy("//*[@id='recommended-item-carousel']" +
                        "//div[@class='single-products'][contains(.,'" + productName + "')]//a");
    }
    public static Target ARROW_BUTTON = Target.the("scroll up arrow button")
            .locatedBy("#scrollUp");
    public static Target WEBSITE_DESCRIPTION_TITLE = Target.the("description title in carousel slider")
            .locatedBy("//*[@id='slider-carousel']//*[@class='item active']//h2");
}
