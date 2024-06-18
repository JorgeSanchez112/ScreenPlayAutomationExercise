package checkout;

import interactions.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import uiScreens.HomePage;
import uiScreens.TestCasesPage;
import utils.AdBlockerJs;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class HomeStepDefinition {

    @Given("The user clicks on the SignupLogin button")
    public void redirectToLoginPage(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                Click.on(HomePage.headerMenu.resolveAllFor(user).get(3))
        );
    }

    @When("The user click on the Test Cases button")
    public void clickOnTestCasesButton(){
        boolean validate = false;

        Actor user = OnStage.theActorCalled("user");

        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);

        do{
            user.attemptsTo(
                    Click.on(HomePage.headerMenu.resolveAllFor(user).get(4)).afterWaitingUntilPresent()
            );

            if (TestCasesPage.TestCaseTitle.isVisibleFor(user)){
                validate = true;
            }
        }while (!validate);


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

    @When("The user clicks on the Delete Account button")
    public void clickOnDeleteAccountButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                WaitForVisibility.the(HomePage.headerMenu),
                Click.on(HomePage.headerMenu.resolveAllFor(user).get(4))
        );
    }

    @When("The user click the arrow button")
    public void clickOnArrowButton(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(HomePage.arrowButton)
        );
    }

    @When("The user click on the Women category")
    public void clickOnWomenCategory(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                WaitForVisibility.the(HomePage.brandsTitle),
                ScrollToElement.target(HomePage.brandsTitle),
                Click.on(HomePage.categories.resolveAllFor(user).get(0))
        );
    }

    @When("The user click on {string} category link under Women category")
    public void clickOnSubWomenCategories(String subcategory){
        Actor user = OnStage.theActorCalled("user");

        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);

        user.attemptsTo(
                ScrollToElement.target(HomePage.brandsTitle),
                Click.on(HomePage.categories.resolveAllFor(user).get(0)),
                ClickOnAnElementByText.the(HomePage.womenCategories,subcategory)
        );
    }

    @When("The user click on any sub-category link of Men category on the left sidebar")
    public void goThroughMenSubCategory(){
        Actor user = OnStage.theActorCalled("user");

        AdBlockerJs.AdBlockerJs(BrowserStepDefinitions.driver);

        user.attemptsTo(
                ScrollToElement.target(HomePage.brandsTitle),
                Click.on(HomePage.categories.resolveAllFor(user).get(1)),
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

    @When("The user click on the arrow at the bottom right side to move upward")
    public void clickOnTheArrowAtTheBottomRight(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ScrollToElement.target(HomePage.footerPage),
                ClickOn.the(HomePage.arrowUpButton)
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

    @Then("Logged in as username should be visible")
    public void isLoggedInVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(HomePage.headerMenu.of("loco2a")))
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

    @When("The user scroll up to the top of the page")
    public void scrollUpToTheTopOfThePage() {
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(CurrentVisibility.of(HomePage.logo))
        );
    }

}
