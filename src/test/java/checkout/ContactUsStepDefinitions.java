package checkout;

import interactions.AcceptAlert;
import interactions.ClickOn;
import interactions.TypeIn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import tasks.FillOutGetInTouchForm;
import uiScreens.ContactUsPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ContactUsStepDefinitions {
    @When("User enters {string} {string} {string} {string}")
    public void fillOutGetInTouchForm(String name, String email, String subject, String message){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                FillOutGetInTouchForm.withCredentials(name,email,subject,message)
        );
    }

    @When("User uploads file {string}")
    public void uploadAFile(String filePath){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                TypeIn.the(ContactUsPage.uploadFile,filePath)
        );
    }

    @When("User clicks on Submit button")
    public void clickOnSubmitButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(ContactUsPage.submitButton)
        );
    }

    @When("User clicks on OK button")
    public void acceptAlertOnContactUsPage(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                AcceptAlert.now()
        );
    }

    @When("User clicks on Home button")
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

    @Then("User can see success message")
    public void isSuccessMessageVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(ContactUsPage.successMessage))
        );
    }
}
