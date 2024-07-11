package checkout;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.model.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;
import utils.AdBlockerJs;
import utils.WebDriverSetup;

public class BrowserStepDefinitions {

    public static WebDriver driver;
    public Actor user;
    private String theRestApiBaseUrl;
    private EnvironmentVariables environmentVariables;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        user = OnStage.theActorCalled("user");

        driver = new WebDriverSetup().setupChromeDriver();

        theRestApiBaseUrl = environmentVariables.optionalProperty("restapi.baseurl")
                .orElse("https://automationexercise.com/api");

        user = Actor.named("Supervisor of correct work of the API").whoCan(CallAnApi.at(theRestApiBaseUrl));



        AdBlockerJs.AdBlockerJs(driver);
    }

    @Given("The user has launched the browser")
    public void userLaunchBrowser() {
        user.can(BrowseTheWeb.with(driver));
    }

    @When("The user navigates to {string}")
    public void goToProjectPage(String url) {
        user.attemptsTo(Open.url(url));
    }

}
