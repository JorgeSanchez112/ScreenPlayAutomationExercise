package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

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



    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
