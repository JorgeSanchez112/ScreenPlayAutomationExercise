package checkout;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import org.junit.Assert;
import uiScreens.CartPage;
import uiScreens.ProductsPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CartStepDefinitions {
    @Then("both products should be added to the cart")
    public void areProductsVisibleInCart() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(CartPage.products))
        );
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
}
