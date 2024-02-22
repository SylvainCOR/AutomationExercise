package AutomationExerciseTesting.StepDefinitions;

import AutomationExerciseTesting.ActionTasks.CompareTextOf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import AutomationExerciseTesting.ActionTasks.LeftClickOn;
import AutomationExerciseTesting.ActionTasks.NavigateTo;

public class RegistrationStepDefinitions {

    @Given("{actor} launched browser to navigate to Automation Exercise home page")
    public void goToAutomationExerciseHomePage(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.theAutomationExerciseHomePage());
    }
    @When("{actor} clicks on Signup Login button")
    public void clickOnSignUpLoginLink(Actor actor) {
        actor.attemptsTo(
                LeftClickOn.theSignUpLoginLink()
        );
    }
    @Then("{actor} can see {string} on login page")
    public void checkSignUpFormTitle(Actor actor, String expectedTitle) {
        actor.attemptsTo(
                CompareTextOf.theSignupFormTitleWith(expectedTitle)
        );
    }
    @When("{actor} enters name {string} and email {string}")
    public void enterNameAndEmail(Actor actor, String arg0, String arg1) {

    }
}
