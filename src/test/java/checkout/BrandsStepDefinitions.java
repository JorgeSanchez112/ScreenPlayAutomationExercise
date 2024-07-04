package checkout;

import interactions.ClickOn;
import interactions.ScrollToElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import org.junit.Assert;
import tasks.GenerateRandomNumber;
import uiScreens.BrandProductsPage;
import utils.AdBlockerJs;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BrandsStepDefinitions {
    @When("The user clicks on any other brand link on the left sidebar")
    public void clickOnAnyAnotherBrand(){
        Actor user = OnStage.theActorCalled("user");
        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);

        user.attemptsTo(GenerateRandomNumber.Between(0,7));

        int randomNumber = user.recall("RANDOM_NUMBER");

        user.attemptsTo(
                ScrollToElement.target(BrandProductsPage.brandsTitle),
                ClickOn.the(BrandProductsPage.brands.resolveAllFor(user).get(randomNumber))
        );
    }

    @Then("The user should be navigated to the brand page {string}")
    public void isUrlIncorrectWithThePage(String urlUnexpected){
        Actor user = OnStage.theActorCalled("user");

        String currentUrl = BrowseTheWeb.as(user).getDriver().getCurrentUrl();

        Assert.assertNotEquals(urlUnexpected,currentUrl);
    }

    @Then("brand products should be displayed")
    public void areProductsOfBrandVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(BrandProductsPage.brandProducts)
        );

        user.should(
                seeThat(CurrentVisibility.of(BrandProductsPage.brandProducts))
        );
    }
}
