package checkout;

import interactions.ClickOn;
import interactions.TypeIn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import questions.DoesAccountExist;
import uiScreens.LoginPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinition {

    @When("User enters name {string} and email {string} address")
    public void typeNameAndEmailAddress(String name, String email){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                TypeIn.the(LoginPage.nameInput,name),
                TypeIn.the(LoginPage.emailAddressInputSignUp,email)
        );
    }

    @When("User clicks SignUp button")
    public void clickOnSignUpButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(LoginPage.buttonSignUp)
        );
    }

    @When("User enters email {string} and password {string}")
    public void fillEmailAndPasswordInput(String email, String password) {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                TypeIn.the(LoginPage.emailAddressInputLogin,email),
                TypeIn.the(LoginPage.passwordInput,password)
        );

    }

    @When("User clicks login button")
    public void clickLoginButton() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(LoginPage.buttonLogin)
        );
    }

    @Then("Login to your account should be visible")
    public void isLoginToYourAccountVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(LoginPage.loginLabel))
        );
    }

    @Then("New User Signup! should be visible")
    public void isSignUpLabelVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(LoginPage.signUpLabel))
        );
    }

    @Then("Message of wrong email or password should be visible")
    public void isErrorMessageAboutLoginDataVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(LoginPage.wrongCredentialsMessage))
        );
    }

    @Then("User should be navigated to login page")
    public void isUserOnLoginPage() {
        Actor user = OnStage.theActorCalled("user");

        String currentUrl = BrowseTheWeb.as(user).getDriver().getCurrentUrl();

        user.attemptsTo(
                Ensure.that(currentUrl).isNotEqualTo("https://automationexercise.com/")
        );
    }

    @Then("User verifies Email Address already exist! message is visible")
    public void isEmailAlreadyExistMessageVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(LoginPage.EmailAlreadyExistMessage))
        );
    }

}
