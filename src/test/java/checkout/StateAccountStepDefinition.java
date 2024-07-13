package checkout;

import interactions.ClickOn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import uiScreens.AccountCreatedPage;
import uiScreens.AccountDeletedPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StateAccountStepDefinition {

    @When("The user clicks the Continue button")
    public void userClicksContinueButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(AccountCreatedPage.continueButton)
        );
    }

    @Then("ACCOUNT CREATED! should be visible")
    public void isAccountCreatedTitleVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(
                        CurrentVisibility.of(AccountCreatedPage.titleAccountCreated)
                )
        );
    }

    @Then("ACCOUNT DELETED! should be visible")
    public void isAccountDeletedTitleVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(
                        CurrentVisibility.of(AccountDeletedPage.titlePage)
                )
        );
    }

}
