package checkout;

import interactions.ClickOn;
import interactions.TypeIn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import uiScreens.LoginPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinition {

    @When("the user enters the name and email address")
    public void typeNameAndEmailAddress(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                TypeIn.the(LoginPage.nameInput,"loco"),
                TypeIn.the(LoginPage.emailAddressInputSignUp,"test@loco.com")
        );
    }

    @And("the user clicks the 'Signup' button")
    public void clickOnSignUpButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(LoginPage.buttonSignUp)
        );
    }

    @Then("'New User Signup!' should be visible")
    public void isLoginLabelVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(LoginPage.labelLogin))
        );
    }

}
