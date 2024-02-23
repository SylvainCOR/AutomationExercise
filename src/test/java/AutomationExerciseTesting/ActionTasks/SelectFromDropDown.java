package AutomationExerciseTesting.ActionTasks;

import AutomationExerciseTesting.PageTargets.SignupPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectFromDropDown {

    public static Performable DayMonthAndYearOfThe(String dateOfBirth) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(dateOfBirth);
        String day = new SimpleDateFormat("dd").format(date);
        String month = new SimpleDateFormat("MM").format(date);
        String year = new SimpleDateFormat("yyyy").format(date);

        return Task.where("{0} selects day, month and year from dropdown boxes",
                SelectFromOptions.byVisibleText(day).from(SignupPage.DAY_OF_BIRTH),
                SelectFromOptions.byIndex(Integer.valueOf(month)).from(SignupPage.MONTH_OF_BIRTH),
                SelectFromOptions.byVisibleText(year).from(SignupPage.YEAR_OF_BIRTH)
        );
    }

}
