package checkout;

import interactions.AcceptAlert;
import interactions.ClickOn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import tasks.FillOutGetInTouchForm;
import uiScreens.ContactUsPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ContactUsStepDefinitions {
    @When("The user fill out GET IN TOUCH form")
    public void fillOutGetInTouchForm(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                FillOutGetInTouchForm.withCredentials("test","test@testmail.com","testing","This is a message to test if the info is sent it correctly","C:\\Users\\Jorge\\Downloads\\sampleFile(22).jpeg")
        );
    }

    @When("The user clicks on Submit button")
    public void clickOnSubmitButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(ContactUsPage.submitButton)
        );
    }

    @When("The user accept the alert")
    public void acceptAlertOnContactUsPage(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                AcceptAlert.now()
        );
    }

    @When("The user clicks the Home button")
    public void clickOnHomeButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(ContactUsPage.homeButton)
        );
    }

    @Then("GET IN TOUCH should be visible")
    public void isGetInTouchTitleVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(ContactUsPage.titleGetInTouch))
        );
    }

    @Then("The success message Success! Your details have been submitted successfully. should be visible")
    public void isSuccessMessageVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(ContactUsPage.successMessage))
        );
    }
}
