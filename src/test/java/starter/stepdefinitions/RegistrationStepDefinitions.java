package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import starter.clickElements.LeftClickOn;
import starter.navigation.NavigateTo;
import starter.textElements.LoginPage;

public class RegistrationStepDefinitions {

    @Given("{actor} launched browser to navigate to Automation Exercise home page")
    public void goToAutomationExerciseHomePage(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.theAutomationExerciseHomePage());
    }
    @When("{actor} clicks on Signup Login button")
    public void clickOnButton(Actor actor) {
        actor.attemptsTo(
                LeftClickOn.theSignUpLoginButton()
        );
    }
    @Then("{actor} can see {string} on login page")
    public void heCanSeeOnLoginPage(Actor actor, String expectedTitle) {
        actor.attemptsTo(
                Ensure.that(Text.of(LoginPage.SIGN_UP_FORM_TITLE).answeredBy(actor))
                        .isEqualToIgnoringCase(expectedTitle)
        );
    }
}
