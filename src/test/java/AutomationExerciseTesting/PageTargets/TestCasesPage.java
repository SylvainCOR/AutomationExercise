package AutomationExerciseTesting.PageTargets;

import net.serenitybdd.screenplay.targets.Target;

public class TestCasesPage {

    public static Target TITLE = Target.the("test cases title")
            .locatedBy("//h2/b");
}
