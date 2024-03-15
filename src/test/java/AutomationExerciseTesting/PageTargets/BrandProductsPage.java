package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class BrandProductsPage {

    public static Target BIBA_BRAND = Target.the("BIBA brand in left side bar")
            .locatedBy("//a[text()='Biba']");
}
