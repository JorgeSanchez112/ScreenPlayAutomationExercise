package checkout;

import interactions.WaitForVisibility;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import uiScreens.TestCasesPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TestCasesStepDefinition {
    @Then("User should be navigated to the test cases page successfully")
    public void isTestCasesTitleVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                WaitForVisibility.the(TestCasesPage.TestCaseTitle)
        );

        user.should(
            seeThat(
                    CurrentVisibility.of(TestCasesPage.TestCaseTitle)
            )
        );
    }

}
