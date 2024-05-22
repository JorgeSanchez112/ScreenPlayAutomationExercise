package checkout;

import interactions.ClickOn;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import uiScreens.HomePage;

public class HomeStepDefinition {

    @Given("the user clicks on the 'SignupLogin' button")
    public void redirectToLoginPage(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(HomePage.headerMenu.inside("Signup / Login"))
        );
    }
}
