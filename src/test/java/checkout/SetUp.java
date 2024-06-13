package checkout;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.annotations.events.BeforeScenario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetUp {
    private WebDriver driver;

    @BeforeScenario
    public void set_the_stage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The user has launched the browser")
    public void userLaunchBrowser(){
        Actor user = OnStage.theActorCalled("user");

        user.can(
                BrowseTheWeb.with(WebDriverManager.chromiumdriver().getWebDriver())
        );
    }

    @When("The user navigates to {string}")
    public void goToProjectPage(String url){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(Open.url(url));

    }

//    private void injectAdBlockerScript(WebDriver driver){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("var elements = document.getElementsByClassName('adsbygoogle');" +
//                "while(elements.length > 0) { " +
//                "elements[0].parentNode.removeChild(elements[0]); " +
//                "}");
//    }


}
