package AutomationExerciseTesting.StepDefinitions;

import AutomationExerciseTesting.ActionTasks.FillTheFormWith;
import AutomationExerciseTesting.ActionTasks.NavigateToThe;
import AutomationExerciseTesting.PageTargets.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
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
                FillTheFormWith.NameAndEmail(name, email)
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
                FillTheFormWith.AccountInformationDetails(title, name, email, password, dateOfBirth)
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
                FillTheFormWith.AddressInformationDetails(firstName, lastName,
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
                Ensure.that(Visibility.of(HomePage.HOME_LINK)).isTrue()
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
                FillTheFormWith.EmailAndPassword(email, password)
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
}
