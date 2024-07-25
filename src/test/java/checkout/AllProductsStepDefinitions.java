package checkout;

import interactions.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.TextValue;
import uiScreens.ProductsPage;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AllProductsStepDefinitions {
    @When("User enters the product name {string} in the search input")
    public void userEnterProductNameInSearchInput(String productName) {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                TypeIn.the(ProductsPage.searchInput,productName)
        );
    }

    @When("User clicks the search button")
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

    @When("The user clicks the Add to cart button overlay")
    public void clickOnAddToCartButtonOverlay(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(ProductsPage.addToCartButtonOverlay.resolveAllFor(user).get(0))
        );
    }

    @When("The user clicks the Continue Shopping button")
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

    @When("The user clicks the Add to cart button 2")
    public void clickOnAddToCartButtonOverlay2(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(ProductsPage.addToCartButtonOverlay.resolveAllFor(user).get(1))
        );
    }

    @When("The user clicks the View Cart link")
    public void clickOnViewCartLink(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(ProductsPage.viewCartLink)
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

    @Then("all the products related to the search {string} should be visible")
    public void areAllProductsRelatedToSearchVisible(String productNameSearched) {
        Actor user = OnStage.theActorCalled("user");

        List<String> name = ProductsPage.titleOfProduct.resolveAllFor(user).textContents();

        user.attemptsTo(
                Ensure.that(name).contains(productNameSearched)
        );

    }

    @Then("{string} should be visible")
    public void isProductTitleValueCorrect(String expectedProductTitle) {
        Actor user = OnStage.theActorCalled("user");

        String valueOFProduct = ProductsPage.titleOfProduct.resolveAllFor(user).get(0).getText();

        user.attemptsTo(
                Ensure.that(valueOFProduct).isEqualTo(expectedProductTitle)
        );
    }
}
