package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidateAccountExist implements Task {
    private final String emailAccount;

    public ValidateAccountExist(String emailAccount){
        this.emailAccount = emailAccount;
    }

    public static ValidateAccountExist withEmail(String emailAccount){
        return instrumented(ValidateAccountExist.class, emailAccount);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/getUserDetailByEmail/{emailAccount}")
                        .with(request -> request.pathParam("emailAccount", emailAccount))
        );
    }
}
