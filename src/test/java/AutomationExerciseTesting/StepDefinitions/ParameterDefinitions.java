package AutomationExerciseTesting.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @After
    public void tearDown() {
        Actor actor = OnStage.theActorInTheSpotlight();
        BrowseTheWeb browseTheWebAbility = actor.usingAbilityTo(BrowseTheWeb.class);
        if (browseTheWebAbility != null) {
            WebDriver driver = browseTheWebAbility.getDriver();
            if (driver != null) {
                try {
                    driver.quit();
                } catch (Exception e) {
                    System.err.println("Error while closing the browser: " + e.getMessage());
                }
            }
        }
    }
}
