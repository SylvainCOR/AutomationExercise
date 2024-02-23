package AutomationExerciseTesting.StepDefinitions;

import AutomationExerciseTesting.ActionTasks.ClickOnThe;
import AutomationExerciseTesting.ActionTasks.CompareTextOfThe;
import AutomationExerciseTesting.ActionTasks.FillTheFormWith;
import AutomationExerciseTesting.ActionTasks.NavigateToThe;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import java.text.ParseException;

public class RegistrationStepDefinitions {

    @Given("{actor} launched browser and go to Automation Exercise home page")
    public void goToAutomationExerciseHomePage(Actor actor) {
        actor.wasAbleTo(
                NavigateToThe.AutomationExerciseHomePage());
    }
    @When("{actor} clicks on Signup Login button")
    public void clickOnSignUpLoginLink(Actor actor) {
        actor.attemptsTo(
                ClickOnThe.SignUpLoginLink()
        );
    }
    @Then("{actor} can see {string} on login page")
    public void checkSignUpTitle(Actor actor, String expectedTitle) {
        actor.attemptsTo(
                CompareTextOfThe.SignUpTitleWith(expectedTitle)
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
                ClickOnThe.SignUpButton()
        );
    }
    @Then("{actor} can see {string} on signup page")
    public void checkAccountInfoTitle(Actor actor, String expectedTitle) {
        actor.attemptsTo(
                CompareTextOfThe.AccountInfoTitleWith(expectedTitle)
        );
    }
    @When("{actor} fills account information details: Title {string}, Name {string}, Email {string}, Password {string}, Date of birth {string}")
    public void heFillsAccountInformationDetails(Actor actor, String title, String name, String email, String password, String dateOfBirth) throws ParseException {
        actor.attemptsTo(
                FillTheFormWith.AccountInformationDetails(title, name, email, password, dateOfBirth)
        );
    }

}
