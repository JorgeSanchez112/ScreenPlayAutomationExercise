package checkout;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import uiScreens.AccountCreatedPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StateAccountStepDefinition {
    @Then("ACCOUNT CREATED! should be visible")
    public void should_be_visible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(
                        CurrentVisibility.of(AccountCreatedPage.titleAccountCreated)
                )
        );
    }


}
