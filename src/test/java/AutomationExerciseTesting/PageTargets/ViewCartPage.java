package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class ViewCartPage {

    public static Target PRODUCT_LIST = Target.the("list of products in the cart")
            .locatedBy("//*[@class='cart_description']/h4");
    public static Target FIRST_PRODUCT_NAME = Target.the("first product in the cart")
            .locatedBy("(//*[@class='cart_description']/h4)[1]");
    public static Target SECOND_PRODUCT_NAME = Target.the("second product in the cart")
            .locatedBy("(//*[@class='cart_description']/h4)[2]");
    public static Target FIRST_PRODUCT_PRICE = Target.the("first product price in the cart")
            .locatedBy("(//*[@class='cart_price']/p)[1]");
    public static Target SECOND_PRODUCT_PRICE = Target.the("second product price in the cart")
            .locatedBy("(//*[@class='cart_price']/p)[2]");
    public static Target FIRST_PRODUCT_QUANTITY = Target.the("first product quantity in the cart")
            .locatedBy("(//*[@class='cart_quantity']/button)[1]");
    public static Target SECOND_PRODUCT_QUANTITY = Target.the("second product quantity in the cart")
            .locatedBy("(//*[@class='cart_quantity']/button)[2]");
    public static Target FIRST_PRODUCT_TOTAL_PRICE = Target.the("first total product price in the cart")
            .locatedBy("(//*[@class='cart_total']/p)[1]");
    public static Target SECOND_PRODUCT_TOTAL_PRICE = Target.the("second total product price in the cart")
            .locatedBy("(//*[@class='cart_total']/p)[2]");
    public static Target SECOND_PRODUCT_DELETE_BUTTON = Target.the("second X button to delete product")
            .locatedBy("(//*[@class='cart_delete']/a)[2]");
    public static Target PROCEED_TO_CHECKOUT = Target.the("checkout button")
            .locatedBy("//*[contains(@class,'check_out')]");
    public static Target REGISTER_LOGIN = Target.the("register / login link")
            .locatedBy("//*[@id='checkoutModal']//u");
    public static Target PRODUCT_NAME = Target.the("all product names in the cart")
            .locatedBy("//*[@id='cart_info_table']//h4/a");
    public static Target LOGGED_IN = Target.the("header logged in as username link")
            .locatedBy("//i[contains(@class,'user')]/..");
}
