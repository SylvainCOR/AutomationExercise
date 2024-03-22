package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageTargets.ViewCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyThat {

    @SuppressWarnings("unchecked")
    public static Performable TotalPriceIsCorrect(Actor actor, int firstPrice, int secondPrice) {
        int firstQuantity = Integer.parseInt(Text.of(ViewCartPage.FIRST_PRODUCT_QUANTITY).answeredBy(actor));
        int firstTotal = firstPrice * firstQuantity;
        int firstTotalExpected = Integer.parseInt(Text.of(ViewCartPage.FIRST_PRODUCT_TOTAL_PRICE).answeredBy(actor).replace("Rs. ", ""));

        int secondQuantity = Integer.parseInt(Text.of(ViewCartPage.SECOND_PRODUCT_QUANTITY).answeredBy(actor));
        int secondTotal = secondPrice * secondQuantity;
        int secondTotalExpected = Integer.parseInt(Text.of(ViewCartPage.SECOND_PRODUCT_TOTAL_PRICE).answeredBy(actor).replace("Rs. ", ""));

        return Task.where(
                Ensure.that(firstTotal).isEqualTo(firstTotalExpected),
                Ensure.that(secondTotal).isEqualTo(secondTotalExpected)
        );
    }

}
