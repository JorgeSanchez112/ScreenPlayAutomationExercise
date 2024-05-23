package tasks;

import interactions.ClickOn;
import interactions.TypeIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import uiScreens.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUser implements Task {

    private String emailAddress;
    private String password;

    public LoginUser(String emailAddress,String password){
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public static LoginUser withCredentials(String username, String password) {
        return instrumented(LoginUser.class, username, password);
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
