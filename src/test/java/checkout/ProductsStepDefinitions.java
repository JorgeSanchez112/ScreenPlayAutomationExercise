package checkout;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import uiScreens.ProductsPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ProductsStepDefinitions {

    @Then("brands should be visible on the left sidebar")
    public void isBrandsVisibleOnLeftSideBar(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(ProductsPage.brandsTitle))
        );
    }
}
