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

        if (DoesAccountExist.forEmail(email).answeredBy(user)){
            System.out.println("Account has been already created");
        }else{
            user.attemptsTo(
                    TypeIn.the(LoginPage.nameInput,name),
                    TypeIn.the(LoginPage.emailAddressInputSignUp,email)
            );
        }

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
    @When("The user enter an incorrect email address and password")
    public void enterIncorrectInfoToLogin() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                TypeIn.the(LoginPage.emailAddressInputLogin,"incorrectEmail@test.com"),
                TypeIn.the(LoginPage.passwordInput,"incorrect")
        );

    }

    @When("The user enter name and an already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                TypeIn.the(LoginPage.nameInput,"loco2"),
                TypeIn.the(LoginPage.emailAddressInputSignUp,"loco2@test.com")
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

    @Then("The error message Email Address already exist! should be visible")
    public void isEmailAlreadyExistMessageVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(LoginPage.EmailAlreadyExistMessage))
        );
    }

}
