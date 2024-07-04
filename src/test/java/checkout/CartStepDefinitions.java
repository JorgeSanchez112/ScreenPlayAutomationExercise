package checkout;

import interactions.ClickOn;
import interactions.ScrollToElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.Visibility;
import org.junit.Assert;
import uiScreens.CartPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CartStepDefinitions {

    @When("The user clicks Proceed To Checkout button")
    public void clickOnProceedToCheckout() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(CartPage.proceedToCheckoutButton),
                ClickOn.the(CartPage.proceedToCheckoutButton)
        );
    }

    @When("The user scroll down to the SUBSCRIPTION")
    public void scrollDownToSubscriptionText() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(CartPage.subscriptionText)
        );
    }

    @When("The user clicks the X button corresponding to a particular product")
    public void clickOnXButtonCorrespondingToAProduct() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(CartPage.deleteProductButton),
                ClickOn.the(CartPage.deleteProductButton)
        );
    }

    @Then("both products should be added to the cart")
    public void areProductsVisibleInCart() {
        Actor user = OnStage.theActorCalled("user");

        boolean visible = user.asksFor(Visibility.of(CartPage.products));

        Assert.assertTrue(visible);
    }

    @Then("The details of both products including their prices, quantities, and total price should be correct")
    public void isTheUserDirectedToAllProductsPageSuccessfully() {
        Actor user = OnStage.theActorCalled("user");

        String priceFirstProduct = CartPage.priceField.resolveAllFor(user).get(0).getText();
        String priceSecondProduct = CartPage.priceField.resolveAllFor(user).get(1).getText();

        String quantityFirstProduct = CartPage.quantityField.resolveAllFor(user).get(0).getText();
        String quantitySecondProduct = CartPage.quantityField.resolveAllFor(user).get(1).getText();

        String totalFirstProduct = CartPage.totalField.resolveAllFor(user).get(0).getText();
        String totalSecondProduct = CartPage.totalField.resolveAllFor(user).get(1).getText();

        Assert.assertEquals(priceFirstProduct,"Rs. 500");
        Assert.assertEquals(priceSecondProduct,"Rs. 400");

        Assert.assertEquals(quantityFirstProduct,"1");
        Assert.assertEquals(quantitySecondProduct,"1");

        String TotalFirstProductExpected = "Rs. 500";
        String TotalSecondProductExpected = "Rs. 400";

        Assert.assertEquals(totalFirstProduct,TotalFirstProductExpected);
        Assert.assertEquals(totalSecondProduct,TotalSecondProductExpected);

    }

    @Then("The user should be on the cart page")
    public void isUserOnCartPage() {
        Actor user = OnStage.theActorCalled("user");

        String currentUrl = BrowseTheWeb.as(user).getDriver().getCurrentUrl();

        Assert.assertNotEquals("https://automationexercise.com/",currentUrl);
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

        Assert.assertTrue(sizeProducts > 0);
    }

    @Then("The product should be removed from the cart")
    public void isProductNotVisible() {
        Actor user = OnStage.theActorCalled("user");

        int sizeProducts = CartPage.products.resolveAllFor(user).size();

        Assert.assertTrue(sizeProducts == 0);
    }


    @Then("The products should still be visible in the cart after login")
    public void the_products_should_still_be_visible_in_the_cart_after_login() {
        Actor user = OnStage.theActorCalled("user");

        int sizeProducts = CartPage.products.resolveAllFor(user).size();

        Assert.assertTrue(sizeProducts > 0);
    }

}
