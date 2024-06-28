package checkout;

import interactions.ClickOn;
import interactions.ScrollToElement;
import interactions.TypeIn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.TextValue;
import org.junit.Assert;
import tasks.FillOutReviewForm;
import uiScreens.CartPage;
import uiScreens.ProductDetailsPage;
import utils.AdBlockerJs;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ProductDetailsStepDefinitions {
    @When("The user increase the quantity to {string}")
    public void increaseQuantityOfProduct(String quantity) {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(ProductDetailsPage.inputOfProductQuantity),
                TypeIn.the(ProductDetailsPage.inputOfProductQuantity,quantity)
        );
    }

    @When("The user clicks the Add to cart button")
    public void clickOnAddToCartButton() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(ProductDetailsPage.addToCartButton),
                ClickOn.the(ProductDetailsPage.addToCartButton)
        );
    }


    @When("The user enter name, email, and review")
    public void fillOutReviewFields() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                FillOutReviewForm.withCredentials("testName","TestAddressEmail", "Testing text are review.")
        );
    }

    @When("The user clicks the Submit button")
    public void clickOnSubmitButton() {
        Actor user = OnStage.theActorCalled("user");
        AdBlockerJs.AdBlockerJs(BrowseTheWeb.as(user).getDriver());

        user.attemptsTo(
                ClickOn.the(ProductDetailsPage.submitButtonInReviewForm)
        );
    }

    @When("The user clicks the View Cart button")
    public void clickOnViewCartButton() {
        Actor user = OnStage.theActorCalled("user");
        AdBlockerJs.AdBlockerJs(BrowseTheWeb.as(user).getDriver());

        user.attemptsTo(
                ClickOn.the(ProductDetailsPage.viewCartButton)
        );
    }

    @Then("The product detail page should be opened")
    public void isProductDetailPageOpen() {
        Actor user = OnStage.theActorCalled("user");

        String currentUrl = BrowseTheWeb.as(user).getDriver().getCurrentUrl();

        Assert.assertNotEquals("https://automationexercise.com/",currentUrl);
    }

    @Then("The product should be displayed in the cart page with the exact quantity {string}")
    public void isQuantityProductSameOnCartPage(String expectedQuantity) {
        Actor user = OnStage.theActorCalled("user");

        String currentQuantity = user.asksFor(TextValue.of(CartPage.quantityField));

        Assert.assertNotEquals(expectedQuantity,currentQuantity);
    }

    @Then("Write Your Review should be visible")
    public void isWriteYourReviewSubtitleVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(ProductDetailsPage.writeYourReviewLink))
        );
    }

    @Then("The success message Thank you for your review. should be visible")
    public void isSuccessMessageForReviewVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(ProductDetailsPage.messageOfSuccessfulReview))
        );
    }

    @Then("The product details should be visible:")
    public void isProductsDetailsVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(ProductDetailsPage.productName))
        );
    }

}
