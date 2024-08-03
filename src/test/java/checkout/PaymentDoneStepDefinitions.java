package checkout;

import interactions.ClickOn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.Actor;
import questions.IsFileDownloaded;
import uiScreens.PaymentDonePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class PaymentDoneStepDefinitions {

    @When("User clicks the Download Invoice button")
    public void clickOnDownloadInvoiceButton() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(PaymentDonePage.downloadInvoiceButton)
        );

    }

    @Then("User can see the invoice downloaded in their respective path")
    public void isInvoiceDownloadedSuccessfully() {
        Actor user = OnStage.theActorCalled("user");

        String downloadFilePath = System.getProperty("user.home") + "\\Downloads\\invoice.txt";
        int timeoutInSeconds = 30;

        user.should(
                seeThat(IsFileDownloaded.in(downloadFilePath, timeoutInSeconds), is(true))
        );
    }

}
