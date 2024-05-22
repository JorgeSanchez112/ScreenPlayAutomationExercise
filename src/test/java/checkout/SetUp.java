package checkout;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import uiScreens.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SetUp {
    @Before
    public void set_the_stage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user has launched the browser")
    public void userLaunchBrowser(){
        Actor user = OnStage.theActorCalled("user");

        user.can(BrowseTheWeb.with(WebDriverManager.operadriver().getWebDriver()));
    }

    @And("the user navigates to {string}")
    public void goToProjectPage(String url){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(Open.url(url));
    }

    @Then("the home page should be visible successfully")
    public void homePageShouldBeVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(HomePage.logo))
        );
    }

}
