package tasks;

import interactions.ClickOnAnElementByText;
import interactions.TypeIn;
import interactions.WaitForVisibility;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import uiScreens.SignUpPage;

public class FillAccountInformationFields implements Task {
    private String title;
    private String name;
    private String password;
    private String dayOfBirthDay;
    private String monthOfBirthDay;
    private String yearOfBirthday;

    public FillAccountInformationFields(String title, String name, String password, String dayOfBirthDay, String monthOfBirthDay, String yearOfBirthday){
        this.title = title;
        this.name = name;
        this.password = password;
        this.dayOfBirthDay = dayOfBirthDay;
        this.monthOfBirthDay = monthOfBirthDay;
        this.yearOfBirthday = yearOfBirthday;
    }

    public static FillAccountInformationFields the(String title, String name, String password, String dayOfBirthDay, String monthOfBirthDay, String yearOfBirthday){
        return new FillAccountInformationFields(title,name,password,dayOfBirthDay,monthOfBirthDay,yearOfBirthday);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitForVisibility.the(SignUpPage.radioButtonTitles),
                ClickOnAnElementByText.the(SignUpPage.radioButtonTitles,title),
                TypeIn.the(SignUpPage.nameField,name),
                TypeIn.the(SignUpPage.passwordField,password),
                FillSignUpDateOfBirth.the(dayOfBirthDay,monthOfBirthDay,yearOfBirthday)
        );
    }
}
