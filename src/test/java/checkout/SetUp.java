package checkout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.annotations.events.BeforeScenario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SetUp {
    @BeforeScenario
    public void set_the_stage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user has launched the browser")
    public void userLaunchBrowser(){
        Actor user = OnStage.theActorCalled("user");

        user.can(BrowseTheWeb.with(WebDriverManager.operadriver().getWebDriver()));
    }

    @Given("the user is on the 'SignupLogin' page")
    public void userIsOnSignUpLoginPage(){
        goToProjectPage("https://automationexercise.com/login");
    }

    @And("the user navigates to {string}")
    public void goToProjectPage(String url){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(Open.url(url));
    }



}
