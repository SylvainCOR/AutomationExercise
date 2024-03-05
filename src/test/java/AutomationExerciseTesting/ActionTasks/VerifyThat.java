package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageTargets.ProductDetailsPage;
import AutomationExerciseTesting.PageTargets.ViewCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

public class VerifyThat {

    @SuppressWarnings("unchecked")
    public static Performable DetailsAreVisible() {
        return Task.where("ensure that all details are visible",
                Ensure.that(Visibility.of(ProductDetailsPage.PRODUCT_NAME)).isTrue(),
                Ensure.that(Visibility.of(ProductDetailsPage.CATEGORY)).isTrue(),
                Ensure.that(Visibility.of(ProductDetailsPage.PRICE)).isTrue(),
                Ensure.that(Visibility.of(ProductDetailsPage.AVAILABILITY)).isTrue(),
                Ensure.that(Visibility.of(ProductDetailsPage.CONDITION)).isTrue(),
                Ensure.that(Visibility.of(ProductDetailsPage.BRAND)).isTrue()
        );
    }
    @SuppressWarnings("unchecked")
    public static Performable TotalPriceIsCorrect(Actor actor, int firstPrice, int secondPrice) {
        int firstQuantity = Integer.parseInt(Text.of(ViewCartPage.FIRST_PRODUCT_QUANTITY).answeredBy(actor));
        int firstTotal = firstPrice * firstQuantity;
        int firstTotalExpected = Integer.parseInt(Text.of(ViewCartPage.FIRST_PRODUCT_TOTAL_PRICE).answeredBy(actor).replace("Rs. ", ""));

        int secondQuantity = Integer.parseInt(Text.of(ViewCartPage.SECOND_PRODUCT_QUANTITY).answeredBy(actor));
        int secondTotal = secondPrice * secondQuantity;
        int secondTotalExpected = Integer.parseInt(Text.of(ViewCartPage.SECOND_PRODUCT_TOTAL_PRICE).answeredBy(actor).replace("Rs. ", ""));

        System.out.println(firstTotal);
        System.out.println(firstTotalExpected);

        return Task.where(
                Ensure.that(firstTotal).isEqualTo(firstTotalExpected),
                Ensure.that(secondTotal).isEqualTo(secondTotalExpected)
        );
    }
}
