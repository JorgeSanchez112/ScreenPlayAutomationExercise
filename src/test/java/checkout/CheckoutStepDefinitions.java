package checkout;

import interactions.ClickOn;
import interactions.ScrollToElement;
import interactions.TypeIn;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import uiScreens.CheckoutPage;
import utils.AdBlockerJs;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CheckoutStepDefinitions {
    @When("The user enter a description {string} in the comment text area")
    public void enterDescriptionInCommentTextArea(String comment) {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                TypeIn.the(CheckoutPage.commentField,comment)
        );

    }

    @When("The user clicks the Place Order button")
    public void the_user_clicks_the_place_order_button() {
        Actor user = OnStage.theActorCalled("user");

        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);

        user.attemptsTo(
                ScrollToElement.target(CheckoutPage.placeOrderButton),
                ClickOn.the(CheckoutPage.placeOrderButton)
        );

    }

    @Then("The delivery address should be visible")
    public void isDeliveryAddressVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(CheckoutPage.deliveryAddress))
        );
    }

    @Then("The billing address should be visible")
    public void isBillingAddressVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(CheckoutPage.billingAddress))
        );
    }


}
