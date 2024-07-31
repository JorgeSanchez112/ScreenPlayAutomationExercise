package checkout;

import interactions.ClickOn;
import interactions.ScrollToElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import uiScreens.CartPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CartStepDefinitions {

    @When("User clicks Proceed to checkout")
    public void clickOnProceedToCheckout() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(CartPage.proceedToCheckoutButton),
                ClickOn.the(CartPage.proceedToCheckoutButton)
        );
    }

    @When("The user scrolls down to the SUBSCRIPTION")
    public void scrollDownToSubscriptionText() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(CartPage.subscriptionText)
        );
    }

    @When("User clicks the X button corresponding to a particular product")
    public void clickOnXButtonCorrespondingToAProduct() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(CartPage.deleteProductButton),
                ClickOn.the(CartPage.deleteProductButton),
                ClickOn.the(CartPage.deleteProductButton) //This is an extraordinary case should be fixed
        );
    }

    @When("User clicks on Register Login button")
    public void ClickOnRegisterLoginButton() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(CartPage.registerLoginLink),
                ClickOn.the(CartPage.registerLoginLink)
        );
    }

    @Then("User watches both products in cart")
    public void areProductsVisibleInCart() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                Ensure.that(CartPage.products.resolveAllFor(user)).hasSize(2)
        );
    }

    @Then("User watches their prices {string} {string}")
    public void validatePricesOfTwoBeginProducts(String expectedFirstProductPrice, String expectedSecondProductPrice) {
        Actor user = OnStage.theActorCalled("user");

        String priceFirstProduct = CartPage.priceField.resolveAllFor(user).get(0).getText();
        String priceSecondProduct = CartPage.priceField.resolveAllFor(user).get(1).getText();

        user.attemptsTo(
                Ensure.that(priceFirstProduct).isEqualTo(expectedFirstProductPrice),
                Ensure.that(priceSecondProduct).isEqualTo(expectedSecondProductPrice)
        );


    }

    @Then("User watches their quantity {string} {string}")
    public void validateQuantityOfTwoBeginProducts(String expectedFirstProductQuantity, String expectedSecondProductQuantity) {
        Actor user = OnStage.theActorCalled("user");

        String quantityFirstProduct = CartPage.quantityField.resolveAllFor(user).get(0).getText();
        String quantitySecondProduct = CartPage.quantityField.resolveAllFor(user).get(1).getText();

        user.attemptsTo(
                Ensure.that(quantityFirstProduct).isEqualTo(expectedFirstProductQuantity),
                Ensure.that(quantitySecondProduct).isEqualTo(expectedSecondProductQuantity)
        );

    }

    @Then("User watches their total price {string} {string}")
    public void validateTotalPriceOfTwoBeginProducts(String expectedFirstProductTotalPrice, String expectedSecondProductTotalPrice) {
        Actor user = OnStage.theActorCalled("user");

        String totalFirstProduct = CartPage.totalField.resolveAllFor(user).get(0).getText();
        String totalSecondProduct = CartPage.totalField.resolveAllFor(user).get(1).getText();

        user.attemptsTo(
                Ensure.that(totalFirstProduct).isEqualTo(expectedFirstProductTotalPrice),
                Ensure.that(totalSecondProduct).isEqualTo(expectedSecondProductTotalPrice)
        );
    }

    @Then("The user should be on the cart page")
    public void isUserOnCartPage() {
        Actor user = OnStage.theActorCalled("user");

        String currentUrl = BrowseTheWeb.as(user).getDriver().getCurrentUrl();

        user.attemptsTo(
                Ensure.that(currentUrl).isEqualTo("https://automationexercise.com/")
        );
    }

    @Then("The cart page should be displayed")
    public void isCartPageDisplayed() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(CartPage.shoppingCartLabel))
        );
    }

    @Then("the product should be displayed in the cart page")
    public void isProductsOfCartPageNotEmpty() {
        Actor user = OnStage.theActorCalled("user");

        int sizeProducts = CartPage.products.resolveAllFor(user).size();

        user.attemptsTo(
                Ensure.that(sizeProducts).isGreaterThan(0)
        );
    }

    @Then("The product should be removed from the cart")
    public void isProductNotVisible() {
        Actor user = OnStage.theActorCalled("user");

        int sizeProducts = CartPage.products.resolveAllFor(user).size();

        user.attemptsTo(
                Ensure.that(sizeProducts).isEqualTo(0)
        );
    }

    @Then("The products should still be visible in the cart after login")
    public void areStillProductsVisibleInTheCartAfterLogin() {
        Actor user = OnStage.theActorCalled("user");

        int sizeProducts = CartPage.products.resolveAllFor(user).size();

        user.attemptsTo(
                Ensure.that(sizeProducts).isGreaterThan(0)
        );
    }

}
