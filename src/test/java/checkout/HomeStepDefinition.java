package checkout;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import uiScreens.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class HomeStepDefinition {

    @Given("the user clicks on the 'SignupLogin' button")
    public void redirectToLoginPage(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                Click.on(HomePage.headerMenu.resolveAllFor(user).get(3))
        );
    }

    @Then("the home page should be visible successfully")
    public void homePageShouldBeVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(HomePage.logo))
        );
    }
}
