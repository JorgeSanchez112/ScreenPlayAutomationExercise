package checkout;

import interactions.ClickOn;
import interactions.ScrollToElement;
import interactions.TypeIn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.questions.TextValue;
import tasks.FillOutReviewForm;
import uiScreens.CartPage;
import uiScreens.ProductDetailsPage;
import utils.AdBlockerJs;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ProductDetailsStepDefinitions {
    @When("User increases quantity to {string}")
    public void increaseQuantityOfProduct(String quantity) {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(ProductDetailsPage.inputOfProductQuantity),
                Clear.field(ProductDetailsPage.inputOfProductQuantity),
                TypeIn.the(ProductDetailsPage.inputOfProductQuantity, quantity)
        );
    }

    @When("User clicks Add to cart button")
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
                FillOutReviewForm.withCredentials("testName", "TestAddress@Email.test", "Testing text are review.")
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

    @When("User clicks View Cart button")
    public void clickOnViewCartButton() {
        Actor user = OnStage.theActorCalled("user");
        AdBlockerJs.AdBlockerJs(BrowseTheWeb.as(user).getDriver());

        user.attemptsTo(
                ClickOn.the(ProductDetailsPage.viewCartButton)
        );
    }

    @Then("User is landed to product detail page")
    public void isProductDetailPageOpen() {
        Actor user = OnStage.theActorCalled("user");

        String currentUrl = BrowseTheWeb.as(user).getDriver().getCurrentUrl(); //Try to do this with expression regular

        user.attemptsTo(
                Ensure.that(currentUrl).isNotEqualTo("https://automationexercise.com/")
        );
    }

    //Weird assert, this needs a revision
    @Then("User watches the product in cart page with the same quantity {string}")
    public void isQuantityProductSameOnCartPage(String expectedQuantity) {
        Actor user = OnStage.theActorCalled("user");

        String currentQuantity = user.asksFor(TextValue.of(CartPage.quantityField));

        user.attemptsTo(
                Ensure.that(currentQuantity).isNotEqualTo(expectedQuantity)
        );

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

    @Then("User verifies product name is visible")
    public void isProductNameInDetailsPageVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(ProductDetailsPage.productName)
        );

        user.should(
                seeThat(CurrentVisibility.of(ProductDetailsPage.productName))
        );
    }

    @Then("User verifies category is visible")
    public void isCategoryInDetailsPageVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(ProductDetailsPage.productCategory)
        );

        user.should(
                seeThat(CurrentVisibility.of(ProductDetailsPage.productCategory))
        );
    }

    @Then("User verifies price is visible")
    public void isPriceInDetailsPageVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(ProductDetailsPage.productPrice)
        );

        user.should(
                seeThat(CurrentVisibility.of(ProductDetailsPage.productPrice))
        );
    }


    @Then("User verifies availability is visible")
    public void isAvailabilityInDetailsPageVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(ProductDetailsPage.productAvailability)
        );

        user.should(
                seeThat(CurrentVisibility.of(ProductDetailsPage.productAvailability))
        );
    }

    @Then("User verifies condition is visible")
    public void isConditionInDetailsPageVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(ProductDetailsPage.productCondition)
        );

        user.should(
                seeThat(CurrentVisibility.of(ProductDetailsPage.productCondition))
        );
    }

    @Then("User verifies brand is visible")
    public void isBrandInDetailsPageVisible() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(ProductDetailsPage.productBrand)
        );

        user.should(
                seeThat(CurrentVisibility.of(ProductDetailsPage.productBrand))
        );
    }
}