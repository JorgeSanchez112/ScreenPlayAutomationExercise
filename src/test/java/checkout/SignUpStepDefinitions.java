package checkout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.targets.Target;
import uiScreens.SignUpPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SignUpStepDefinitions{

    @And("the user fills in the details: Title, Name, Email, Password, Date of birth")
    public void fillAccountInformationFields(){

    }

    @Then("'ENTER ACCOUNT INFORMATION' should be visible")
    public void IsFirstSubtitleVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(
                        CurrentVisibility.of(SignUpPage.subTitles)
                )
        );
    }
}
