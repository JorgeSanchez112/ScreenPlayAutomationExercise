package checkout;

import interactions.ScrollToElement;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import uiScreens.TShirtsSubCategoryPage;
import utils.AdBlockerJs;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MenSubCategories {
    @Then("The user should be navigated to that category page")
    public void navigateToTShirtsSubcategory(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(TShirtsSubCategoryPage.titlePage)
        );

        user.should(
                seeThat(CurrentVisibility.of(TShirtsSubCategoryPage.titlePage))
        );
    }
}
