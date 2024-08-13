package checkout;

import interactions.ClickOn;
import interactions.ScrollToElement;
import interactions.TypeIn;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.targets.Target;
import uiScreens.CheckoutPage;
import utils.AdBlockerJs;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class CheckoutStepDefinitions {
    @When("User enters description {string} in comment text area")
    public void enterDescriptionInCommentTextArea(String comment) {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                TypeIn.the(CheckoutPage.commentField,comment)
        );

    }

    @When("User clicks Place holder")
    public void the_user_clicks_the_place_order_button() {
        Actor user = OnStage.theActorCalled("user");

        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);

        user.attemptsTo(
                ScrollToElement.target(CheckoutPage.placeOrderButton),
                ClickOn.the(CheckoutPage.placeOrderButton)
        );

    }

    @Then("User can see delivery address")
    public void isDeliveryAddressTitleVisible(){
        Actor user = OnStage.theActorCalled("user");

        seeThat("the first delivery address is visible",
                actor -> CheckoutPage.deliveryAddress.resolveAllFor(user).get(0).isVisible(),
                is(true)
        );
    }

    @Then("User can see billing address")
    public void iBillingAddressTitleVisible(){
        Actor user = OnStage.theActorCalled("user");

        seeThat("the first delivery address is visible",
                actor -> CheckoutPage.billingAddress.resolveAllFor(user).get(0).isVisible(),
                is(true)
        );
    }

    @Then("User can see the same data completed in register at the delivery address {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void isBillingAddressDataCorrect(String title, String firstname, String lastname, String company, String address, String address2, String country, String state, String city, String zipcode, String mobileNumber) {
        validateTitleAndFullName(CheckoutPage.deliveryAddress,title, firstname + " " +lastname);
        validateCompany(CheckoutPage.deliveryAddress,company);
        validateFirstAddress(CheckoutPage.deliveryAddress,address);
        validateSecondAddress(CheckoutPage.deliveryAddress,address2);
        validateResidenceInformation(CheckoutPage.deliveryAddress,state,city,zipcode);
        validateCountry(CheckoutPage.deliveryAddress,country);
        validateMobileNumber(CheckoutPage.deliveryAddress,mobileNumber);
    }

    @Then("User can see the same data completed in register at the billing address {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void isDeliveryAddressDataCorrect(String title, String firstname, String lastname, String company, String address, String address2, String country, String state, String city, String zipcode, String mobileNumber) {
        validateTitleAndFullName(CheckoutPage.billingAddress,title, firstname + " " +lastname);
        validateCompany(CheckoutPage.billingAddress,company);
        validateFirstAddress(CheckoutPage.billingAddress,address);
        validateSecondAddress(CheckoutPage.billingAddress,address2);
        validateResidenceInformation(CheckoutPage.billingAddress,state,city,zipcode);
        validateCountry(CheckoutPage.billingAddress,country);
        validateMobileNumber(CheckoutPage.billingAddress,mobileNumber);
    }

    @Then("Address Details and Review Your Order should be visible")
    public void areTitlesVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(CheckoutPage.titles))
        );
    }

    public void validateTitleAndFullName(Target target, String title, String fullName){
        Actor user = OnStage.theActorCalled("user");

        String nameInfo = target.resolveAllFor(user).get(1).getText();
        String expectedNameInfo = title + " " + fullName;

        user.attemptsTo(
                Ensure.that(nameInfo).isEqualTo(expectedNameInfo)
        );
    }

    public void validateCompany(Target target, String expectedCompany){
        Actor user = OnStage.theActorCalled("user");

        String company = target.resolveAllFor(user).get(2).getText();

        user.attemptsTo(
                Ensure.that(company).isEqualTo(expectedCompany)
        );
    }

    public void validateFirstAddress(Target target, String expectedAddress){
        Actor user = OnStage.theActorCalled("user");

        String address = target.resolveAllFor(user).get(3).getText();

        user.attemptsTo(
                Ensure.that(address).isEqualTo(expectedAddress)
        );
    }

    public void validateSecondAddress(Target target, String expectedAddress){
        Actor user = OnStage.theActorCalled("user");

        String address = target.resolveAllFor(user).get(4).getText();

        user.attemptsTo(
                Ensure.that(address).isEqualTo(expectedAddress)
        );
    }

    public void validateResidenceInformation(Target target, String state, String city, String zipCode){
        Actor user = OnStage.theActorCalled("user");

        String residenceInformation = target.resolveAllFor(user).get(5).getText();
        String expectedResidence = state + " " + city + " " + zipCode;

        user.attemptsTo(
                Ensure.that(residenceInformation).isEqualTo(residenceInformation)
        );
    }

    public void validateCountry(Target target, String expectedCountry){
        Actor user = OnStage.theActorCalled("user");

        String country = target.resolveAllFor(user).get(6).getText();

        user.attemptsTo(
                Ensure.that(country).isEqualTo(expectedCountry)
        );
    }

    public void validateMobileNumber(Target target, String expectedPhoneNumber){
        Actor user = OnStage.theActorCalled("user");

        String phoneNumber = target.resolveAllFor(user).get(7).getText();

        user.attemptsTo(
                Ensure.that(phoneNumber).isEqualTo(expectedPhoneNumber)
        );
    }


}
