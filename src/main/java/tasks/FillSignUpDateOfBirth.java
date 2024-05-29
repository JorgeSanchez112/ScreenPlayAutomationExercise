package tasks;

import interactions.SelectItemInDropDownBox;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import uiScreens.SignUpPage;

public class FillSignUpDateOfBirth implements Task {
    private String day;
    private String month;
    private String year;

    public FillSignUpDateOfBirth(String day, String month, String year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static FillSignUpDateOfBirth the(String day, String month, String year){
        return new FillSignUpDateOfBirth(day,month,year);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectItemInDropDownBox.the(SignUpPage.selectDayBox,day), //day
                SelectItemInDropDownBox.the(SignUpPage.selectMonthBox,month), //month
                SelectItemInDropDownBox.the(SignUpPage.selectYearBox,year) //year
        );

    }
}
