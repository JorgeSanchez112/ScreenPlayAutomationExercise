package tasks;

import interactions.ClickOn;
import interactions.TypeIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SendKeys;
import uiScreens.HomePage;
import uiScreens.LoginPage;

public class LoginUser implements Task {

    private String emailAddress;
    private String password;

    public LoginUser(String emailAddress,String password){
        this.emailAddress = emailAddress;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                TypeIn.the(LoginPage.emailAddressInputLogin,emailAddress),
                TypeIn.the(LoginPage.passwordInput,password),
                ClickOn.the(LoginPage.buttonLogin)
        );
    }
}
