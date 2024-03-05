package AutomationExerciseTesting.StepDefinitions;

import AutomationExerciseTesting.ActionTasks.FillTheForm;
import AutomationExerciseTesting.ActionTasks.HandleDialogBox;
import AutomationExerciseTesting.ActionTasks.NavigateToThe;
import AutomationExerciseTesting.ActionTasks.VerifyThat;
import AutomationExerciseTesting.PageTargets.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.HoverOverTarget;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Displayed;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

public class StepDefinitions {

    @Given("{actor} launched browser and go to Automation Exercise home page")
    public void goToAutomationExerciseHomePage(Actor actor) {
        actor.attemptsTo(
                NavigateToThe.AutomationExerciseHomePage()
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
                FillTheForm.ToSignUp(name, email)
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
    public void fillAccountInformationDetails(Actor actor, String title, String name, String email, String password, String dateOfBirth) {
        actor.attemptsTo(
                FillTheForm.WithAccountInformation(title, name, email, password, dateOfBirth)
        );
    }
    @And("{actor} selects newsletter checkbox")
    public void selectNewsletterCheckbox(Actor actor) {
        actor.attemptsTo(
                Click.on(SignupPage.NEWSLETTER_CHECKBOX)
        );
    }
    @And("{actor} selects special offers checkbox")
    public void selectSpecialOffersCheckbox(Actor actor) {
        actor.attemptsTo(
                Click.on(SignupPage.SPECIAL_OFFERS_CHECKBOX)
        );
    }
    @And("{actor} fills address information details: First name {string}, Last name {string}, Company {string}, Address {string}, Address2 {string}, Country {string}, State {string}, City {string}, Zipcode {string}, Mobile Number {string}")
    public void fillAddressInformationDetails(Actor actor, String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String number) {
        actor.attemptsTo(
                FillTheForm.WithAddressInformation(firstName, lastName,
                        company, address, address2, country, state, city, zipcode, number)
        );
    }
    @And("{actor} clicks on Create Account button")
    public void clickCreateAccountButton(Actor actor) {
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
                Ensure.that(Text.of(HomePage.LOGGED_IN)).isEqualToIgnoringCase("Logged in as " + username)
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
                FillTheForm.ToLogIn(email, password)
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
                FillTheForm.ToContactSupport(name, email, subject, message)
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
    @Then("{actor} is landed to product_details page")
    public void checkProductDetailsPage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Visibility.of(ProductDetailsPage.PRODUCT_DETAILS)).isTrue()
        );
    }
    @And("{actor} can see details: product name, category, price, availability, condition, brand")
    public void checkDetailsOfTheProduct(Actor actor) {
        actor.attemptsTo(
                VerifyThat.DetailsAreVisible()
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
    @And("products related to the search {string} are visible")
    public void productsRelatedToTheSearchAreVisible(String productName) {
        Actor actor = OnStage.theActorInTheSpotlight();
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
    @When("{actor} clicks on Cart button")
    public void customerClicksOnCartButton(Actor actor) {
        actor.attemptsTo(
                Click.on(HomePage.CART_BUTTON)
        );
    }
    @When("{actor} mouse over first product")
    public void mouseOverFirstProduct(Actor actor) {
        actor.attemptsTo(
                HoverOverTarget.over(ProductsPage.FIRST_IMG_PRODUCT)
        );
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
    }
    @And("{actor} clicks on second overlay Add to cart button")
    public void clickOnSecondOverlayAddToCartButton(Actor actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.SECOND_OVERLAY_ADD_TO_CART)
        );
    }
    @Then("{actor} can see both products are in the cart")
    public void checkBothProductsAreInTheCart(Actor actor) {
        actor.attemptsTo(
                Ensure.that()
        );
    }
    @And("{actor} can see details: price, quantity and total price")
    public void checkDetailsPriceQuantityAndTotalPrice(Actor actor) {
    }
}
