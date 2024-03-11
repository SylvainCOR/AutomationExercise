package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageTargets.PaymentPage;
import AutomationExerciseTesting.PageTargets.SignupPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static jxl.biff.FormatRecord.logger;

public class ParseTheDate {

    public static Performable DateOfBirth(String dateOfBirth) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = dateFormat.parse(dateOfBirth);
            String day = new SimpleDateFormat("d").format(date);
            String month = new SimpleDateFormat("MM").format(date);
            String year = new SimpleDateFormat("yyyy").format(date);

            return Task.where("{0} selects day, month, and year from dropdown boxes",
                    SelectFromOptions.byVisibleText(day).from(SignupPage.DAY_OF_BIRTH),
                    SelectFromOptions.byIndex(Integer.parseInt(month)).from(SignupPage.MONTH_OF_BIRTH),
                    SelectFromOptions.byVisibleText(year).from(SignupPage.YEAR_OF_BIRTH)
            );
        } catch (ParseException e) {
            logger.error("Error parsing dateOfBirth", e);
            Actor actor = OnStage.theActorInTheSpotlight();
            WebDriver driver = actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
            driver.quit();
            return null;
        }
    }
    public static Performable ExpirationDate(String expiration) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
            Date date = dateFormat.parse(expiration);
            String expirationMonth = new SimpleDateFormat("MM").format(date);
            String expirationYear = new SimpleDateFormat("2yyy").format(date);

            return Task.where("{0} enters month and year",
                    Enter.theValue(expirationMonth).into(PaymentPage.MONTH_OF_EXPIRATION),
                    Enter.theValue(expirationYear).into(PaymentPage.YEAR_OF_EXPIRATION)
            );
        } catch (ParseException e) {
            logger.error("Error parsing expiration date", e);
            Actor actor = OnStage.theActorInTheSpotlight();
            WebDriver driver = actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
            driver.quit();
            return null;
        }
    }
}
