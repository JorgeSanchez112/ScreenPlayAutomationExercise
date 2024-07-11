package checkout;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.ValidateAccountExist;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class crazy1 {
    @Then("is 200")
    public void isGood(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ValidateAccountExist.withEmail("loco@test.com")
        );


        user.should(
                seeThatResponse("The user have an account with this email",
                        response -> response.statusCode(404))
        );
    }
}
