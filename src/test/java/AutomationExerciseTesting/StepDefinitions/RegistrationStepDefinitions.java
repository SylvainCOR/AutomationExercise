package AutomationExerciseTesting.StepDefinitions;

import AutomationExerciseTesting.ActionTasks.*;
import AutomationExerciseTesting.PageTargets.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.questions.WebElementQuestion;

public class RegistrationStepDefinitions {

    @Given("{actor} launched browser and go to Automation Exercise home page")
    public void goToAutomationExerciseHomePage(Actor actor) {
        actor.wasAbleTo(
                NavigateToThe.AutomationExerciseHomePage());
    }
    @When("{actor} clicks on Signup Login button")
    public void clickOnSignUpLoginLink(Actor actor) {
        actor.attemptsTo(
                Click.on(HomePage.SIGN_UP_LOGIN_LINK)
        );
    }
    @Then("{actor} can see {string} on login page")
    public void checkSignUpTitle(Actor actor, String expectedTitle) {
        actor.attemptsTo(
                Ensure.that(Text.of(LoginPage.SIGN_UP_TITLE)).isEqualToIgnoringCase(expectedTitle)
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
    @Then("{actor} can see {string} on signup page")
    public void checkAccountInfoTitle(Actor actor, String expectedTitle) {
        actor.attemptsTo(
                Ensure.that(Text.of(SignupPage.ACCOUNT_INFO_TITLE)).isEqualToIgnoringCase(expectedTitle)
        );
    }
    @When("{actor} fills account information details: Title {string}, Name {string}, Email {string}, Password {string}, Date of birth {string}")
    public void fillAccountInformationDetails(Actor actor, String title, String name, String email, String password, String dateOfBirth) {
        actor.attemptsTo(
                FillTheFormWith.AccountInformationDetails(title, name, email, password, dateOfBirth)
        );
    }
    @And("{actor} selects {string} checkbox")
    public void selectCheckbox(Actor actor, String checkBox) {
        actor.attemptsTo(
                ClickOnThe.SelectedCheckbox(checkBox)
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
    @Then("{actor} can see {string} on account_created page")
    public void checkAccountCreatedTitle(Actor actor, String expectedTitle) {
        actor.attemptsTo(
                Ensure.that(Text.of(AccountCreatedPage.ACCOUNT_CREATED_TITLE)).isEqualToIgnoringCase(expectedTitle)
        );
    }
    @When("{actor} clicks on Continue button from account_created page")
    public void clickOnContinueButtonAccountCreatedPage(Actor actor) {
        actor.attemptsTo(
                Click.on(AccountCreatedPage.CONTINUE_BUTTON)
        );
    }
    @Then("{actor} can see {string} {string} on home page")
    public void checkLoggedIn(Actor actor, String expectedText, String username) {
        System.out.println(Text.of(HomePage.LOGGED_IN));
        System.out.println(expectedText + username);
        actor.attemptsTo(
                Ensure.that(Text.of(HomePage.LOGGED_IN)).isEqualToIgnoringCase(expectedText + username)
        );
    }
    @When("{actor} clicks on Delete Account button")
    public void clickOnDeleteAccountButton(Actor actor) {
        actor.attemptsTo(
                Click.on(HomePage.DELETE_ACCOUNT)
        );
    }
    @Then("{actor} can see {string} on delete_account page")
    public void checkAccountDeletedTitle(Actor actor, String expectedTitle) {
        actor.attemptsTo(
                Ensure.that(Text.of(DeleteAccountPage.DELETE_ACCOUNT_TITLE)).isEqualToIgnoringCase(expectedTitle)
        );
    }
    @When("{actor} clicks on Continue button from delete_account page")
    public void clickOnContinueButtonDeleteAccountPage(Actor actor) {
        actor.attemptsTo(
                Click.on(DeleteAccountPage.CONTINUE_BUTTON)
        );
    }
    @Then("{actor} can see the home page")
    public void heCanSeeTheHomePage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Visibility.of(HomePage.HOME_LINK)).isTrue()
        );
    }
}
