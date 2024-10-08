package checkout;

import interactions.ClickOn;
import interactions.ScrollToElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import tasks.FillPaymentDetails;
import uiScreens.PaymentPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PaymentStepDefinitions {

    @When("User enters payment details {string} {string} {string} {string} {string}")
    public void fillPaymentDetails(String nameOnCard, String cardNumber, String cvc, String monthExpiration, String yearExpiration) {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                FillPaymentDetails.withCredentials(nameOnCard,cardNumber,cvc,monthExpiration,yearExpiration)
        );
    }

    @When("User clicks on Pay and confirm order button")
    public void clickOnPayAndConfirmOrderButton() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(PaymentPage.payAndConfirmOrder)
        );
    }

    @Then("User can see a success message about the order")
    public void isSuccessMessageOfOrderSuccessfullyVisible() {
        Actor user = OnStage.theActorCalled("user");

        BrowseTheWeb.as(user).getDriver().navigate().back();

        user.attemptsTo(
                ScrollToElement.target(PaymentPage.orderPlaceSuccessfullyMessage)
        );

        user.should(
                seeThat(CurrentVisibility.of(PaymentPage.orderPlaceSuccessfullyMessage))
        );
    }

}
