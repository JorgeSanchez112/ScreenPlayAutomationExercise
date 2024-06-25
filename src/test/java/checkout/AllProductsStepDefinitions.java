package checkout;

import interactions.ClickOn;
import interactions.HoverOverElement;
import interactions.ScrollToElement;
import interactions.TypeIn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToBy;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.TheSize;
import org.junit.Assert;
import uiScreens.ProductsPage;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AllProductsStepDefinitions {
    @When("The user enter the product name {string} in the search input")
    public void userEnterProductNameInSearchInput(String productName) {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                TypeIn.the(ProductsPage.searchInput,productName)
        );
    }

    @When("The user click the search button")
    public void userClickOnSearchButton() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(ProductsPage.searchButton)
        );
    }

    @When("The user hover over the first product")
    public void hoverOverFirstProduct(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(ProductsPage.products),
                MoveMouse.to(ProductsPage.products.resolveAllFor(user).get(0))
        );
    }

    @When("The user click the Add to cart button")
    public void clickOnAddToCartButtonOverlay(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                Click.on(ProductsPage.addToCartButtonOverlay.resolveAllFor(user).get(0)).afterWaitingUntilPresent()
        );
    }

    @When("The user click the Continue Shopping button")
    public void clickOnContinueShoppingButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(ProductsPage.continueShoppingButton)
        );
    }

    @When("The user hover over the second product")
    public void hoverOverSecondProduct(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(ProductsPage.products),
                MoveMouse.to(ProductsPage.products.resolveAllFor(user).get(1))
        );
    }

    @When("The user click the Add to cart button 2")
    public void clickOnAddToCartButtonOverlay2(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                Click.on(ProductsPage.addToCartButtonOverlay.resolveAllFor(user).get(1)).afterWaitingUntilPresent()
        );
    }

    @When("The user click the View Cart link")
    public void clickOnViewCartLink(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                Click.on(ProductsPage.viewCartLink).afterWaitingUntilPresent()
        );
    }


    @Then("the user should be navigated to the ALL PRODUCTS page successfully")
    public void isTheUserDirectedToAllProductsPageSuccessfully() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(ProductsPage.productsTitle))
        );
    }

    @Then("the products list should be visible")
    public void areProductsOfListVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(ProductsPage.products))
        );
    }

    @Then("all the products related to the search should be visible")
    public void areAllProductsRelatedToSearchVisible() {
        Actor user = OnStage.theActorCalled("user");

        int CurrentNumberOfProductsShowed = ProductsPage.products.resolveAllFor(user).size();

        Assert.assertTrue(CurrentNumberOfProductsShowed < 34);
    }

    @Then("{string} should be visible")
    public void isBookTitleValueCorrect(String expectedBookTitle) {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(ScrollToElement.target(ProductsPage.products));

        String valueOFProduct = ProductsPage.titleOFProduct.resolveAllFor(user).get(0).getValue();

        Assert.assertEquals(expectedBookTitle,valueOFProduct);
    }
}
