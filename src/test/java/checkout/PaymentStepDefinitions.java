package checkout;

import interactions.ClickOn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import tasks.FillPaymentDetails;
import uiScreens.PaymentPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PaymentStepDefinitions {
    @When("The user enter payment details: {string}, {string}, {string}, {string}, {string}")
    public void fillPaymentDetails(String nameOnCard, String cardNumber, String cvc, String monthExpiration, String yearExpiration) {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                FillPaymentDetails.withCredentials(nameOnCard,cardNumber,cvc,monthExpiration,yearExpiration)
        );
    }

    @When("The user clicks the Pay and Confirm Order button")
    public void clickOnPayAndConfirmOrderButton() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(PaymentPage.payAndConfirmOrder)
        );
    }

    @Then("The success message Your order has been placed successfully! should be visible")
    public void isSuccessMessageOfOrderSuccessfullyVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(PaymentPage.orderPlaceSuccessfullyMessage))
        );
    }

}
