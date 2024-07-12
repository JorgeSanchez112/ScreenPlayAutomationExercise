package checkout;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.DoesAccountExist;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.is;

public class crazy1 {
    @Then("is 200")
    public void isGood(){
        Actor user = OnStage.theActorCalled("user");

        System.out.println("NonExistAccountEmail: " + DoesAccountExist.forEmail("loco@test.com").answeredBy(user));

        user.should(
                seeThat(DoesAccountExist.forEmail("loco1@test.com"),is(true))
        );
    }
}
