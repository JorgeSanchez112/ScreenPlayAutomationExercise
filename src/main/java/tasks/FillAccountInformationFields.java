package tasks;

import interactions.ClickOnAnElementByText;
import interactions.WaitForVisibility;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import uiScreens.SignUpPage;

public class FillAccountInformationFields implements Task {
    private String title;
    private String name;
    private String password;
    private String birthDay;

    public FillAccountInformationFields(String title, String name, String password, String birthDay){
        this.title = title;
        this.name = name;
        this.password = password;
        this.birthDay = birthDay;
    }

    public static FillAccountInformationFields the(String title, String name, String password, String birthDay){
        return new FillAccountInformationFields(title,name,password,birthDay);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitForVisibility.the(SignUpPage.radioButtonTitles),
                ClickOnAnElementByText.the(SignUpPage.radioButtonTitles,title)
        );
    }
}
