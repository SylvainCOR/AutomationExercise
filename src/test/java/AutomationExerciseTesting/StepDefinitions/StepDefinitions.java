package AutomationExerciseTesting.StepDefinitions;

import AutomationExerciseTesting.ActionTasks.AddToCart;
import AutomationExerciseTesting.ActionTasks.FillFormDetailsIn;
import AutomationExerciseTesting.ActionTasks.HandleDialogBox;
import AutomationExerciseTesting.ActionTasks.VerifyThat;
import AutomationExerciseTesting.PageTargets.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Displayed;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated;

public class StepDefinitions {

    @Given("{actor} launched browser and go to Automation Exercise home page")
    public void openAutomationExerciseHomePage(Actor actor) {
        actor.attemptsTo(
                Open.browserOn().the(HomePage.class),
                Ensure.that(HomePage.HOME_LINK).isDisplayed()
        );
    }
    @When("{actor} clicks on Signup Login button")
    public void clickOnSignUpLoginLink(Actor actor) {
        actor.attemptsTo(
                Click.on(HomePage.SIGN_UP_LOGIN_LINK)
        );
    }
    @Then("{actor} can see: New User Signup!")
    public void checkSignUpTitle(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(LoginPage.SIGN_UP_TITLE)).isEqualToIgnoringCase("New User Signup!")
        );
    }
    @When("{actor} enters name {string} and email {string}")
    public void enterNameAndEmail(Actor actor, String name, String email) {
        actor.attemptsTo(
                Enter.theValue(name).into(LoginPage.SIGN_UP_NAME_FIELD),
                Enter.theValue(email).into(LoginPage.SIGN_UP_EMAIL_FIELD)
        );
    }
    @And("{actor} clicks on Signup button")
    public void clickOnSignupButton(Actor actor) {
        actor.attemptsTo(
                Click.on(LoginPage.SIGN_UP_BUTTON)
        );
    }
    @Then("{actor} can see: ENTER ACCOUNT INFORMATION")
    public void checkAccountInfoTitle(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(SignupPage.ACCOUNT_INFO_TITLE)).isEqualToIgnoringCase("ENTER ACCOUNT INFORMATION")
        );
    }
    @When("{actor} fills account information details: Title {string}, Name {string}, Email {string}, Password {string}, Date of birth {string}")
    public void fillAccountInformationDetails(Actor actor, String title, String userName, String email,
                                                                 String password, String dateOfBirth) {
        actor.attemptsTo(
                FillFormDetailsIn.AccountInformation(title, userName, email, password, dateOfBirth)
        );
    }
    @And("{actor} selects newsletter and special offers checkboxes")
    public void selectCheckboxes(Actor actor) {
        actor.attemptsTo(
                Click.on(SignupPage.NEWSLETTER_CHECKBOX),
                Click.on(SignupPage.SPECIAL_OFFERS_CHECKBOX)
        );
    }
    @And("{actor} fills address information details: First name {string}, Last name {string}, Company {string}, Address {string}, " +
            "Address2 {string}, Country {string}, State {string}, City {string}, Zipcode {string}, Mobile Number {string}")
    public void fillAddressInformationDetails(Actor actor, String firstName, String lastName, String company, String address, String address2,
                                                     String country, String state, String city, String zipcode, String number) {
        actor.attemptsTo(
                FillFormDetailsIn.AddressInformation(firstName, lastName,
                        company, address, address2, country, state, city, zipcode, number)
        );
    }
    @And("{actor} clicks on Create Account button")
    public void clickOnCreateAccountButton(Actor actor) {
        actor.attemptsTo(
                Click.on(SignupPage.CREATE_ACCOUNT_BUTTON)
        );
    }
    @Then("{actor} can see: ACCOUNT CREATED!")
    public void checkAccountCreatedTitle(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(AccountCreatedPage.ACCOUNT_CREATED_TITLE)).isEqualToIgnoringCase("ACCOUNT CREATED!")
        );
    }
    @When("{actor} clicks on account_created page Continue button")
    public void clickOnContinueButtonAccountCreatedPage(Actor actor) {
        actor.attemptsTo(
                Click.on(AccountCreatedPage.CONTINUE_BUTTON)
        );
    }
    @Then("{actor} can see Logged in as {string} on home page")
    public void checkLoggedIn(Actor actor, String username) {
        actor.attemptsTo(
                Ensure.that(Text.of(HomePage.LOGGED_IN)).isEqualTo("Logged in as " + username)
        );
    }
    @When("{actor} clicks on Delete Account button")
    public void clickOnDeleteAccountButton(Actor actor) {
        actor.attemptsTo(
                Click.on(HomePage.DELETE_ACCOUNT)
        );
    }
    @Then("{actor} can see: ACCOUNT DELETED!")
    public void checkAccountDeletedTitle(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(DeleteAccountPage.DELETE_ACCOUNT_TITLE)).isEqualToIgnoringCase("ACCOUNT DELETED!")
        );
    }
    @When("{actor} clicks on delete_account page Continue button")
    public void clickOnContinueButtonDeleteAccountPage(Actor actor) {
        actor.attemptsTo(
                Click.on(DeleteAccountPage.CONTINUE_BUTTON)
        );
    }
    @Then("{actor} can see the home page")
    public void checkHomePageIsVisible(Actor actor) {
        actor.attemptsTo(
                //Wait.until( () -> Visibility.of(HomePage.SLIDER_CAROUSEL).answeredBy(actor)),
                Ensure.that(Visibility.of(HomePage.SLIDER_CAROUSEL)).isTrue()
        );
    }
    @Then("{actor} can see signup error message {string}")
    public void checkSignUpErrorMessage(Actor actor, String expectedMessage) {
        actor.attemptsTo(
                Ensure.that(Text.of(LoginPage.SIGN_UP_ERROR_MESSAGE)).isEqualToIgnoringCase(expectedMessage)
        );
    }
    @When("{actor} enters email {string} and password {string}")
    public void enterEmailAndPassword(Actor actor, String email, String password) {
        actor.attemptsTo(
                Enter.theValue(email).into(LoginPage.LOG_IN_EMAIL_FIELD),
                Enter.theValue(password).into(LoginPage.LOG_IN_PASSWORD_FIELD)
        );
    }
    @And("{actor} clicks on Login button")
    public void clickOnLoginButton(Actor actor) {
        actor.attemptsTo(
                Click.on(LoginPage.LOG_IN_BUTTON)
        );
    }
    @Then("{actor} can see login title: Login to your account")
    public void checkLoginTitle(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(LoginPage.LOG_IN_TITLE)).isEqualToIgnoringCase("Login to your account")
        );
    }
    @Then("{actor} can see login error message: Your email or password is incorrect!")
    public void checkLoginErrorMessage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(LoginPage.LOG_IN_ERROR_MESSAGE)).isEqualToIgnoringCase("Your email or password is incorrect!")
        );
    }
    @When("{actor} clicks on Logout button")
    public void clickOnLogoutButton(Actor actor) {
        actor.attemptsTo(
                Click.on(HomePage.LOG_OUT_LINK)
        );
    }
    @Then("{actor} can see the login page")
    public void actorCanSeeTheLoginPage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Visibility.of(LoginPage.LOG_IN_TITLE)).isTrue()
        );
    }
    @When("{actor} clicks on Contact Us button")
    public void userClicksOnContactUsButton(Actor actor) {
        actor.attemptsTo(
                Click.on(HomePage.CONTACT_US_BUTTON)
        );
    }
    @Then("{actor} can see contact form title: GET IN TOUCH")
    public void checkContactFormTitle(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Visibility.of(ContactUsPage.CONTACT_FORM_TITLE)).isTrue()
        );
    }
    @When("{actor} enters name {string} email {string} subject {string} and message {string}")
    public void enterNameEmailSubjectAndMessage(Actor actor, String name, String email, String subject, String message) {
        actor.attemptsTo(
                FillFormDetailsIn.ContactSupport(name, email, subject, message)
        );
    }
    @And("{actor} uploads file {string}")
    public void uploadFile(Actor actor, String filepath) {
        actor.attemptsTo(
                Enter.theValue(filepath).into(ContactUsPage.UPLOAD_INPUT)
        );
    }
    @And("{actor} clicks on Submit button")
    public void clickOnSubmitButton(Actor actor) {
        actor.attemptsTo(
                Scroll.to(ContactUsPage.SUBMIT_BUTTON).then(Click.on(ContactUsPage.SUBMIT_BUTTON))
        );
    }
    @Then("{actor} confirm dialog box")
    public void confirmDialogBox(Actor actor) {
        actor.attemptsTo(
                HandleDialogBox.ConfirmAlert(BrowseTheWeb.as(actor).getDriver())
        );
    }
    @And("{actor} can see: Success! Your details have been submitted successfully.")
    public void checkDetailsSubmittedSuccessfully(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(ContactUsPage.SUCCESS_MESSAGE)).isEqualToIgnoringCase("Success! Your details have been submitted successfully.")
        );
    }
    @When("{actor} clicks on green Home button")
    public void clickOnGreenHomeButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ContactUsPage.HOME_BUTTON)
        );
    }
    @When("{actor} clicks on Test Cases button")
    public void clickOnTestCasesButton(Actor actor) {
        actor.attemptsTo(
                Click.on(HomePage.TEST_CASES_BUTTON)
        );
    }
    @Then("{actor} can see the test_cases page")
    public void checkTestCasesPage(Actor actor) {
        actor.attemptsTo(
                //Wait.until( () -> Visibility.of(TestCasesPage.TITLE).answeredBy(actor)),
                Ensure.that(Visibility.of(TestCasesPage.TITLE)).isTrue()
        );
    }
    @When("{actor} clicks on Products button")
    public void clickOnProductsButton(Actor actor) {
        actor.attemptsTo(
                Click.on(HomePage.PRODUCTS_BUTTON)
        );
    }
    @Then("{actor} can see products list title: ALL PRODUCTS")
    public void checkProductsListTitle(Actor actor) {
        actor.attemptsTo(
                //( () -> Visibility.of(ProductsPage.PRODUCTS_LIST).answeredBy(actor)),
                Ensure.that(Text.of(ProductsPage.PRODUCTS_LIST_TITLE)).isEqualToIgnoringCase("ALL PRODUCTS")
        );
    }
    @And("the product list is visible")
    public void checkProductListIsVisible() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(
                Ensure.that(Visibility.of(ProductsPage.PRODUCTS_LIST)).isTrue()
        );
    }
    @When("{actor} clicks on View Product of first product")
    public void clickOnViewProductOfFirstProduct(Actor actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.FIRST_VIEW_PRODUCT)
        );
    }
    @Then("{actor} can see product_details page")
    public void checkProductDetailsPage(Actor actor) {
        actor.attemptsTo(
                //Wait.until( () -> Visibility.of(ProductDetailsPage.PRODUCT_DETAILS).answeredBy(actor)),
                Ensure.that(Visibility.of(ProductDetailsPage.PRODUCT_DETAILS)).isTrue()
        );
    }
    @And("{actor} can see details: product name, category, price, availability, condition, brand")
    public void checkDetailsOfTheProduct(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Visibility.of(ProductDetailsPage.PRODUCT_NAME)).isTrue(),
                Ensure.that(Visibility.of(ProductDetailsPage.CATEGORY)).isTrue(),
                Ensure.that(Visibility.of(ProductDetailsPage.PRICE)).isTrue(),
                Ensure.that(Visibility.of(ProductDetailsPage.AVAILABILITY)).isTrue(),
                Ensure.that(Visibility.of(ProductDetailsPage.CONDITION)).isTrue(),
                Ensure.that(Visibility.of(ProductDetailsPage.BRAND)).isTrue()
        );
    }
    @When("{actor} enters product name {string} in search input")
    public void enterProductNameInSearchInput(Actor actor, String productName) {
        actor.attemptsTo(
                Enter.theValue(productName).into(ProductsPage.SEARCH_INPUT)
        );
    }
    @And("{actor} clicks on search button")
    public void customerClicksOnSearchButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.SEARCH_BUTTON)
        );
    }
    @Then("{actor} can see research title: SEARCHED PRODUCTS")
    public void checkResearchTitleSEARCHEDPRODUCTS(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(ProductsPage.PRODUCTS_LIST_TITLE)).isEqualToIgnoringCase("SEARCHED PRODUCTS")
        );
    }
    @And("{actor} can see all products related to the search {string}")
    public void checkAllProductsRelatedToTheSearch(Actor actor, String productName) {
        actor.attemptsTo(
                Ensure.that(Text.ofEach(ProductsPage.PRODUCT_NAME).asString()).containsIgnoringCase(productName)
        );
    }
    @When("{actor} scrolls down to footer")
    public void scrollDownToFooter(Actor actor) {
        actor.attemptsTo(
                Scroll.to(HomePage.FOOTER)
        );
    }
    @Then("{actor} can see title: SUBSCRIPTION")
    public void checkTitleSUBSCRIPTION(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(HomePage.SUBSCRIBE_TITLE)).isEqualToIgnoringCase("SUBSCRIPTION")
        );
    }
    @When("{actor} enters email {string} in input")
    public void enterEmailInInput(Actor actor, String email) {
        actor.attemptsTo(
                Enter.theValue(email).into(HomePage.SUBSCRIBE_INPUT)
        );
    }
    @And("{actor} clicks on arrow button")
    public void clickOnArrowButton(Actor actor) {
        actor.attemptsTo(
                Click.on(HomePage.SUBSCRIBE_BUTTON)
        );
    }
    @Then("{actor} can see success message: You have been successfully subscribed!")
    public void checkSubscriptionSuccessMessage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Displayed.of(HomePage.SUCCESS_MESSAGE)).isTrue()
        );
    }
    @When("{actor} clicks on View Cart button")
    public void clickOnViewCartButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.VIEW_CART)
        );
    }
    @When("{actor} mouse over first product")
    public void mouseOverFirstProduct(Actor actor) {
        actor.attemptsTo(
                HoverOverTarget.over(ProductsPage.FIRST_IMG_PRODUCT)
        );
        actor.remember("firstProductName", Text.of(ProductsPage.FIRST_OVERLAY_NAME).answeredBy(actor));
        actor.remember("firstProductPrice", Text.of(ProductsPage.FIRST_OVERLAY_PRICE).answeredBy(actor));
    }
    @And("{actor} clicks on first overlay Add to cart button")
    public void clickOnFirstOverlayAddToCartButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.FIRST_OVERLAY_ADD_TO_CART)
        );
    }
    @And("{actor} clicks on Continue Shopping button")
    public void clickOnContinueShoppingButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.CONTINUE_SHOPPING)
        );
    }
    @When("{actor} mouse over second product")
    public void mouseOverSecondProduct(Actor actor) {
        actor.attemptsTo(
                HoverOverTarget.over(ProductsPage.SECOND_IMG_PRODUCT)
        );
        actor.remember("secondProductName", Text.of(ProductsPage.SECOND_OVERLAY_NAME).answeredBy(actor));
        actor.remember("secondProductPrice", Text.of(ProductsPage.SECOND_OVERLAY_PRICE).answeredBy(actor));
    }
    @And("{actor} clicks on second overlay Add to cart button")
    public void clickOnSecondOverlayAddToCartButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.SECOND_OVERLAY_ADD_TO_CART)
        );
    }
    @Then("{actor} can see both products are in the cart")
    public void checkBothProductsAreInTheCart(Actor actor) {
        String firstProductName = actor.recall("firstProductName");
        String secondProductName = actor.recall("secondProductName");

        actor.attemptsTo(
                Ensure.that(Text.of(ViewCartPage.FIRST_PRODUCT_NAME)).isEqualTo(firstProductName),
                Ensure.that(Text.of(ViewCartPage.SECOND_PRODUCT_NAME)).isEqualTo(secondProductName)
        );
    }
    @And("{actor} can see details: price, quantity and total price")
    public void checkDetailsPriceQuantityAndTotalPrice(Actor actor) {
        String firstProductPrice = actor.recall("firstProductPrice");
        String secondProductPrice = actor.recall("secondProductPrice");
        int firstPrice = Integer.parseInt(firstProductPrice.replace("Rs. ", ""));
        int secondPrice = Integer.parseInt(secondProductPrice.replace("Rs. ", ""));

        actor.attemptsTo(
                Ensure.that(Text.of(ViewCartPage.FIRST_PRODUCT_PRICE)).isEqualTo(firstProductPrice),
                Ensure.that(Text.of(ViewCartPage.SECOND_PRODUCT_PRICE)).isEqualTo(secondProductPrice),
                VerifyThat.TotalPriceIsCorrect(actor, firstPrice, secondPrice)
        );
    }
    @When("{actor} clicks on last View Product")
    public void clickOnLastViewProduct(Actor actor) {
        actor.attemptsTo(
                Click.on(HomePage.LAST_VIEW_PRODUCT)
        );
    }
    @When("{actor} increase quantity to {string}")
    public void increaseQuantity(Actor actor, String quantity) {
        actor.attemptsTo(
                Enter.theValue(quantity).into(ProductDetailsPage.QUANTITY)
        );
    }
    @And("{actor} clicks on Add to cart button")
    public void clickOnAddToCartButton(Actor actor) {
        actor.remember("productName", Text.of(ProductDetailsPage.PRODUCT_NAME).answeredBy(actor));
        actor.attemptsTo(
                Click.on(ProductDetailsPage.ADD_TO_CART)
        );
    }
    @Then("{actor} can see product in the cart")
    public void checkProductInTheCart(Actor actor) {
        String productName = actor.recall("productName");
        actor.attemptsTo(
                Ensure.that(Text.of(ViewCartPage.FIRST_PRODUCT_NAME)).isEqualTo(productName)
        );
    }
    @And("the quantity is exactly {string}")
    public void theQuantityIsExactly(String quantity) {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(
                Ensure.that(Text.of(ViewCartPage.FIRST_PRODUCT_QUANTITY)).isEqualTo(quantity)
        );
    }
    @When("{actor} adds to cart the first {int} products")
    public void addProductsToCart(Actor actor, Integer number) {
        actor.attemptsTo(
                AddToCart.MultipleProducts(number)
        );
    }
    @And("{actor} clicks on Cart button")
    public void clickOnCartButton(Actor actor) {
        actor.attemptsTo(
                Click.on(HomePage.CART_BUTTON)
        );
    }
    @Then("{actor} can see the view_cart page")
    public void checkView_cartPageVisibility(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Visibility.of(ViewCartPage.PROCEED_TO_CHECKOUT)).isTrue()
        );
    }
    @When("{actor} clicks on Proceed To Checkout button")
    public void clickOnProceedToCheckoutButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ViewCartPage.PROCEED_TO_CHECKOUT)
        );
    }
    @And("{actor} clicks on Register Login link")
    public void clickOnRegisterLoginLink(Actor actor) {
        actor.attemptsTo(
                Click.on(ViewCartPage.REGISTER_LOGIN)
        );
    }
    @And("{actor} fills details to SignUp: {string} {string}")
    public void fillDetailsToSignUp(Actor actor, String userName, String email) {
        enterNameAndEmail(actor, userName, email);
        clickOnSignupButton(actor);
    }
    @And("{actor} fills details to Create Account: {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void fillDetailsToCreateAccount(Actor actor, String title, String userName, String email, String password, String dateOfBirth,
                                           String firstName, String lastName, String company, String address, String address2,
                                           String country, String state, String city, String zipcode, String number) {
        fillAccountInformationDetails(actor, title, userName, email, password, dateOfBirth);
        selectCheckboxes(actor);
        fillAddressInformationDetails(actor, firstName, lastName,
                company, address, address2, country, state, city, zipcode, number);
        clickOnCreateAccountButton(actor);
    }
    @Then("{actor} can see Address Details and Review Your Order titles")
    public void checkAddressDetailsAndReviewYourOrderTitles(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(CheckoutPage.ADDRESS_DETAILS)).isEqualTo("Address Details"),
                Ensure.that(Text.of(CheckoutPage.REVIEW_YOUR_ORDER)).isEqualTo("Review Your Order")
        );
    }
    @When("{actor} enters {string} in comment text area")
    public void enterDescriptionInCommentTextArea(Actor actor, String description) {
        actor.attemptsTo(
                Enter.theValue(description).into(CheckoutPage.TEXT_AREA)
        );
    }
    @And("{actor} clicks on Place Order button")
    public void clickOnPlaceOrderButton(Actor actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.PLACE_ORDER)
        );
    }
    @Then("{actor} can see Payment title")
    public void checkPaymentTitle(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Visibility.of(PaymentPage.PAYMENT_TITLE)).isTrue()
        );
    }
    @When("{actor} enters payment details: Name on Card {string}, Card Number {string}, CVC {string}, Expiration date {string}")
    public void fillPaymentDetails(Actor actor, String lastName, String cardNumber, String cvc, String expiration) {
        actor.attemptsTo(
                FillFormDetailsIn.Payment(lastName, cardNumber, cvc, expiration)
        );
    }
    @And("{actor} clicks on Pay and Confirm Order button")
    public void clickOnPayAndConfirmOrderButton(Actor actor) {
        actor.attemptsTo(
                Click.on(PaymentPage.PAY_AND_CONFIRM_ORDER)
        );
    }
    @Then("{actor} can see success message: Congratulations! Your order has been confirmed!")
    public void checkSuccessMessage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(PaymentDonePage.CONGRATS_MESSAGE)).isEqualTo("Congratulations! Your order has been confirmed!")
        );
    }
    @And("{actor} fills details to Login: {string} {string}")
    public void fillDetailsToLogin(Actor actor, String email, String password) {
        checkLoginTitle(actor);
        enterEmailAndPassword(actor, email, password);
        clickOnLoginButton(actor);
    }
    @When("{actor} clicks on X button of second product")
    public void clickOnXButtonOfSecondProduct(Actor actor) {
        actor.remember("removedProductName", Text.of(ViewCartPage.SECOND_PRODUCT_NAME).answeredBy(actor));
        actor.attemptsTo(
                Click.on(ViewCartPage.SECOND_PRODUCT_DELETE_BUTTON)
        );
    }
    @Then("{actor} cannot see second product in the cart")
    public void checkSecondProductNotInCart(Actor actor) {
        String SearchRemovedProduct = "//*[contains(.,'" + actor.recall("removedProductName") + "')]";
        actor.attemptsTo(
                WaitUntil.the(invisibilityOfElementLocated(By.xpath(SearchRemovedProduct)))
        );
    }
    @And("{actor} can see categories on left side bar")
    public void checkCategoriesVisibleOnLeftSideBar(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Visibility.of(HomePage.CATEGORY_TITLE)).isTrue()
        );
    }
    @When("{actor} clicks on Women category")
    public void clickOnWomenCategory(Actor actor) {
        actor.attemptsTo(
                Scroll.to(HomePage.WOMEN_CATEGORY).andAlignToTop(),
                Click.on(HomePage.WOMEN_CATEGORY)
        );
    }
    @And("{actor} clicks on Dress sub-category")
    public void clickOnDressSubCategory(Actor actor) {
        actor.attemptsTo(
                Click.on(HomePage.DRESS_SUBCATEGORY)
        );
    }
    @Then("{actor} can see {string} category title")
    public void checkCategoryTitle(Actor actor, String title) {
        actor.attemptsTo(
                Ensure.that(Text.of(CategoryProductsPage.SELECTED_CATEGORY_TITLE)).isEqualTo(title)
        );
    }
    @When("{actor} clicks on Men category")
    public void clickOnMenCategory(Actor actor) {
        actor.attemptsTo(
                Click.on(CategoryProductsPage.MEN_CATEGORY)
        );
    }
    @And("{actor} clicks on Jeans sub-category")
    public void clickOnJeansSubCategory(Actor actor) {
        actor.attemptsTo(
                Click.on(CategoryProductsPage.JEANS_SUBCATEGORY)
        );
    }
    @And("{actor} can see brands on left side bar")
    public void checkBrandsVisibleOnLeftSideBar(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Visibility.of(ProductsPage.BRANDS_TITLE)).isTrue()
        );
    }
    @When("{actor} clicks on H&M brand")
    public void clickOnHMBrand(Actor actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.HM_BRAND)
        );
    }
    @Then("{actor} can see {string} brand title")
    public void checkBrandTitle(Actor actor, String title) {
        actor.attemptsTo(
                Ensure.that(Text.of(BrandProductsPage.SELECTED_BRAND_TITLE)).isEqualTo(title)
        );
    }
    @When("{actor} clicks on BIBA brand")
    public void clickOnBibaBrand(Actor actor) {
        actor.attemptsTo(
                Click.on(BrandProductsPage.BIBA_BRAND)
        );
    }
    @When("{actor} adds those products to cart")
    public void addRelatedSearchProductsToCart(Actor actor) {
        List<String> productsNames = (List<String>) Text.ofEach(ProductsPage.PRODUCT_NAME).answeredBy(actor);
        actor.attemptsTo(
                AddToCart.MultipleProducts(productsNames.size())
        );
        actor.remember("productsAdded", productsNames);
    }
    @Then("{actor} can see added products in the cart")
    public void checkAddedProductsInTheCart(Actor actor) {
        List<String> productsAdded = actor.recall("productsAdded");
        List<String> productsInCart = (List<String>) Text.ofEach(ViewCartPage.PRODUCT_NAME).answeredBy(actor);
        actor.attemptsTo(
                Ensure.that(productsInCart).isEqualTo(productsAdded)
        );
    }
    @Then("{actor} can see Logged in as {string} on view_cart page")
    public void checkLoggedInFromCart(Actor actor, String username) {
        actor.attemptsTo(
                Ensure.that(Text.of(ViewCartPage.LOGGED_IN)).isEqualTo("Logged in as " + username)
        );
    }
    @When("{actor} clicks on polo t-shirts View Product button")
    public void clickOnPoloTShirtViewProductButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.POLO_TSHIRTS_VIEW_PRODUCT)
        );
    }
    @Then("{actor} can see the text: WRITE YOUR REVIEW")
    public void checkTheTextWriteYourReview(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Visibility.of(ProductDetailsPage.WRITE_YOUR_REVIEW)).isTrue(),
                Ensure.that(Text.of(ProductDetailsPage.WRITE_YOUR_REVIEW))
                        .isEqualToIgnoringCase("WRITE YOUR REVIEW")
        );
    }
    @When("{actor} enters name {string} email {string} and review {string}")
    public void enterNameEmailAndReview(Actor actor, String name, String email, String review) {
        actor.attemptsTo(
                Enter.theValue(name).into(ProductDetailsPage.NAME),
                Enter.theValue(email).into(ProductDetailsPage.EMAIL),
                Enter.theValue(review).into(ProductDetailsPage.REVIEW)
        );
    }
    @And("{actor} clicks on review Submit button")
    public void clickOnReviewSubmitButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ProductDetailsPage.SUBMIT_BUTTON)
        );
    }
    @Then("{actor} can see success message: Thank you for your review.")
    public void checkReviewSuccessMessage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Visibility.of(ProductDetailsPage.REVIEW_SUCCESS_MESSAGE)).isTrue(),
                Ensure.that(Text.of(ProductDetailsPage.REVIEW_SUCCESS_MESSAGE))
                        .isEqualToIgnoringCase("Thank you for your review.")
        );
    }
}
