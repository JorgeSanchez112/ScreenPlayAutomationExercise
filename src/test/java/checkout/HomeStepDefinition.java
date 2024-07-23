package checkout;

import interactions.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import tasks.GenerateRandomNumber;
import tasks.NavigateTo;
import uiScreens.*;
import utils.AdBlockerJs;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class HomeStepDefinition {

    @When("User clicks on Signup Login button")
    public void redirectToLoginPage(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                NavigateTo.withElementFacade(HeaderMenuComponent.headerMenu.resolveAllFor(user).get(3))
        );
    }

    @When("The user clicks on the Test Cases button")
    public void clickOnTestCasesButton(){
        Actor user = OnStage.theActorCalled("user");


        user.attemptsTo(
                NavigateTo.withElementFacade(HeaderMenuComponent.headerMenu.resolveAllFor(user).get(4))
        );
    }

    @When("The user scroll down to the footer")
    public void scrollDownToFooter(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(HomePage.footerPage)
        );
    }

    @When("The user enter an email address in the input field")
    public void the_user_enter_an_email_address_in_the_input_field() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                TypeIn.the(HomePage.subscribeEmailInput,"email@address.com")
        );
    }

    @When("User clicks Delete Account button")
    public void clickOnDeleteAccountButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                WaitForVisibility.the(HeaderMenuComponent.headerMenu),
                ClickOn.the(HeaderMenuComponent.headerMenu.resolveAllFor(user).get(4))
        );
    }

    @When("The user clicks the arrow button")
    public void clickOnArrowButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(HomePage.arrowButton)
        );
    }

    @When("The user clicks on the Women category")
    public void clickOnWomenCategory(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                WaitForVisibility.the(HomePage.brandsTitle),
                ScrollToElement.target(HomePage.brandsTitle),
                ClickOn.the(HomePage.categories.resolveAllFor(user).get(0))
        );
    }

    @When("The user clicks on {string} category link under Women category")
    public void clickOnSubWomenCategories(String subcategory){
        Actor user = OnStage.theActorCalled("user");

        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);

        user.attemptsTo(
                ScrollToElement.target(HomePage.brandsTitle),
                ClickOn.the(HomePage.categories.resolveAllFor(user).get(0)),
                ClickOnAnElementByText.the(HomePage.womenCategories,subcategory)
        );
    }

    @When("The user clicks on any sub-category link of Men category on the left sidebar")
    public void goThroughMenSubCategory(){
        Actor user = OnStage.theActorCalled("user");

        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);

        user.attemptsTo(
                ScrollToElement.target(HomePage.brandsTitle),
                ClickOn.the(HomePage.categories.resolveAllFor(user).get(1)),
                ClickOnAnElementByText.the(HomePage.menCategories,"TSHIRTS")
        );

    }

    @When("The user scroll down to the bottom of the page")
    public void scrollToBottomCarousel(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(HomePage.carouselOfRecommendedItems)
        );
    }

    @When("The user clicks on the arrow at the bottom right side to move upward")
    public void clickOnTheArrowAtTheBottomRight(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(HomePage.footerPage),
                ClickOn.the(HomePage.arrowUpButton)
        );
    }

    @When("User clicks on Contact Us button")
    public void clickOnContactUsButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(HeaderMenuComponent.headerMenu.resolveAllFor(user).get(7))
        );
    }

    @When("The user scroll up to the top of the page")
    public void scrollUpToTheTopOfThePage(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(HomePage.logo)
        );
    }

    @When("The user clicks on the Products button")
    public void the_user_click_on_the_products_button() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                NavigateTo.withElementFacade(HeaderMenuComponent.headerMenu.resolveAllFor(user).get(1))
        );

    }

    @When("The user scroll down to Brands")
    public void scrollDownToBrands(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
               ScrollToElement.target(HomePage.brandsTitle)
        );
    }

    @When("The user clicks on any brand name")
    public void clickOnAnyBrandName(){
        Actor user = OnStage.theActorCalled("user");
        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);

        user.attemptsTo(GenerateRandomNumber.Between(0,7));

        int randomNumber = user.recall("RANDOM_NUMBER");

        user.attemptsTo(
                ScrollToElement.target(HomePage.brandsTitle),
                ClickOn.the(HomePage.brands.resolveAllFor(user).get(randomNumber))
        );
    }

    @When("User clicks logout button")
    public void clickLogOutButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(HeaderMenuComponent.buttonsOfUserLogged.resolveAllFor(user).get(0))
        );
    }

    @When("The user add products to the cart")
    public void AddProductsToCart() {
        Actor user = OnStage.theActorCalled("user");
        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);

        user.attemptsTo(
                WaitForVisibility.the(HomePage.brandsTitle),
                ClickOn.the(HomePage.addToCartButton.resolveAllFor(user).get(0)),
                ClickOn.the(HomePage.continueShoppingButton),
                ClickOn.the(HomePage.addToCartButton.resolveAllFor(user).get(1)),
                ClickOn.the(HomePage.continueShoppingButton)
        );
    }

    @When("The user clicks the Cart button")
    public void clickOnCartButton() {
        Actor user = OnStage.theActorCalled("user");
        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);
        boolean validate = false;

        do{
            user.attemptsTo(
                    ClickOn.the(HeaderMenuComponent.headerMenu.resolveAllFor(user).get(2))
            );

            if (CartPage.shoppingCartLabel.isVisibleFor(user)){
                validate = true;
            }
        } while (!validate);
    }

    @When("The user clicks on the View Product button of the first product")
    public void clickOnTheViewProductButtonOfFirstProduct() {
        Actor user = OnStage.theActorCalled("user");
        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);
        boolean validate = false;

        do{
            user.attemptsTo(
                    ClickOn.the(HomePage.viewProductButton.resolveAllFor(user).get(0))
            );


            if (ProductDetailsPage.productName.isVisibleFor(user)){
                validate = true;
            }
        } while (!validate);


        BrowseTheWeb.as(user).getDriver().navigate().refresh();
    }

    @When("The user clicks the View Product button for any product")
    public void clickOnViewProductButtonForAnyProduct() {
        Actor user = OnStage.theActorCalled("user");
        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);
        boolean validate = false;

        user.attemptsTo(GenerateRandomNumber.Between(0,33));

        int randomNumber = user.recall("RANDOM_NUMBER");

        do{
            user.attemptsTo(
                    ScrollToElement.elementFacade(HomePage.viewProductButton.resolveAllFor(user).get(randomNumber)),
                    ClickOn.the(HomePage.viewProductButton.resolveAllFor(user).get(randomNumber))
            );


            if (ProductDetailsPage.productName.isVisibleFor(user)){
                validate = true;
            }
        } while (!validate);

        BrowseTheWeb.as(user).getDriver().navigate().refresh();
    }

    @When("The user clicks on the Add To Cart button on a recommended product")
    public void clickOnAddToCartButtonOnRecommendedProduct() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(HomePage.carouselOfRecommendedItems),
                ClickOn.the(HomePage.recommendedItemsProducts.resolveAllFor(user).get(1))
        );
    }

    @When("The user clicks on the View Cart button")
    public void clickOnViewCartButton() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                WaitForVisibility.the(HomePage.viewCartLink),
                ClickOn.the(HomePage.viewCartLink)
        );
    }

    @Then("The home page should be visible successfully")
    public void homePageShouldBeVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                WaitForVisibility.the(HomePage.logo)
        );

        user.should(
                seeThat(CurrentVisibility.of(HomePage.logo))
        );
    }

    @When("The user add a product to the cart")
    public void AddAProductToCart() {
        Actor user = OnStage.theActorCalled("user");
        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);

        user.attemptsTo(GenerateRandomNumber.Between(0,33));

        int randomNumber = user.recall("RANDOM_NUMBER");

        user.attemptsTo(
                ScrollToElement.elementFacade(HomePage.addToCartButton.resolveAllFor(user).get(randomNumber)),
                ClickOn.the(HomePage.addToCartButton.resolveAllFor(user).get(randomNumber))
        );
    }

    @When("The user clicks the Delete Account button")
    public void ClickOnDeleteAccount() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(HeaderMenuComponent.buttonsOfUserLogged.resolveAllFor(user).get(1))
        );
    }


    @Then("Logged in as username should be visible")
    public void isLoggedInVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(HeaderMenuComponent.headerMenu.of("loco1a")))
        );
    }

    @Then("The text SUBSCRIPTION should be visible")
    public void isSUBSCRIPTIONTextVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                WaitForVisibility.the(HomePage.subscriptionText)
        );

        user.should(
                seeThat(CurrentVisibility.of(HomePage.subscriptionText))
        );
    }

    @Then("The success message You have been successfully subscribed! should be visible")
    public void isMessageSuccessfullySubscribedVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                WaitForVisibility.the(HomePage.messageSuccessfullySubscribed)
        );

        user.should(
                seeThat(CurrentVisibility.of(HomePage.messageSuccessfullySubscribed))
        );
    }

    @Then("Categories should be visible on the left sidebar")
    public void isCategoriesVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(HomePage.categoriesBox))
        );
    }

    @Then("The user should see the Women categories")
    public void isWomenCategoriesVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(HomePage.womenCategories))
        );
    }

    @Then("RECOMMENDED ITEMS should be visible")
    public void isRecommendedItemsTitleVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(HomePage.recommendedItemsTitle))
        );
    }

    @Then("SUBSCRIPTION should be visible")
    public void isSubscriptionVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(HomePage.subscriptionText))
        );
    }

    @Then ("The page should be scrolled up")
    public void isLogoVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(HomePage.logo))
        );
    }

    @Then("Full-Fledged practice website for Automation Engineers should be visible on the screen")
    public void isFullFledgedTextVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(HomePage.FullFledgedText))
        );
    }


    @Then("User should be navigated to the home page successfully")
    public void userShouldBeOnHomePage(){
        Actor user = OnStage.theActorCalled("user");
        final String urlExpected = "https://automationexercise.com/";

        BrowseTheWeb.as(user).getDriver().navigate().refresh();

        String currentUrl = BrowseTheWeb.as(user).getDriver().getCurrentUrl();

        user.attemptsTo(
                Ensure.that(currentUrl).isEqualTo(urlExpected)
        );
    }

    @Then("Logged in as {string} should be visible at the top")
    public void isLoggedInAsVisibleAtTheTop(String string1) {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(HeaderMenuComponent.headerMenu.of(string1)))
        );
    }

}
