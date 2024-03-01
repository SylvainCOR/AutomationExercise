package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageTargets.ProductDetailsPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
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

}
