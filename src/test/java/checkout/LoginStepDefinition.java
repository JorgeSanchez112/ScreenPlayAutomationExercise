package checkout;

import interactions.ClickOn;
import interactions.ScrollToElement;
import interactions.TypeIn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import org.junit.Assert;
import uiScreens.BrandProductsPage;
import uiScreens.LoginPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinition {

    @When("The user enters the name {string} and email {string} address")
    public void typeNameAndEmailAddress(String name, String email){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                TypeIn.the(LoginPage.nameInput,name),
                TypeIn.the(LoginPage.emailAddressInputSignUp,email)
        );
    }

    @When("The user clicks the Signup button")
    public void clickOnSignUpButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(LoginPage.buttonSignUp)
        );
    }

    @When("The user enter the correct email address and password")
    public void fillEmailAndPasswordInput() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                TypeIn.the(LoginPage.emailAddressInputLogin,"loco1@test.com"),
                TypeIn.the(LoginPage.passwordInput,"a")
        );

    }

    @When("The user clicks the login button")
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

    @Then("the error message Your email or password is incorrect! should be visible")
    public void isErrorMessageAboutLoginDataVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(LoginPage.wrongCredentialsMessage))
        );
    }

    @Then("The user should be navigated to the login page")
    public void the_user_should_be_navigated_to_the_login_page() {
        Actor user = OnStage.theActorCalled("user");

        String currentUrl = BrowseTheWeb.as(user).getDriver().getCurrentUrl();

        Assert.assertNotEquals("https://automationexercise.com/",currentUrl);
    }

}
