package checkout;

import interactions.ClickOn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import tasks.FillAccountInformationFields;
import tasks.FillAddressInformationFields;
import uiScreens.SignUpPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SignUpStepDefinitions{

    @When("The user fills in the details: Title, Name, Email, Password, Date of birth")
    public void fillAccountInformationFields(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                FillAccountInformationFields.the("Mr.","a","a","31","5","2000")
        );

    }

    @When("The user selects all checkbox in Enter Account Information")
    public void the_user_selects_the_checkbox() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(SignUpPage.newsletterCheckBox),
                ClickOn.the(SignUpPage.specialOffersCheckBox)
        );
    }

    @When("The user fills in the details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fillAddressInformationFields() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                FillAddressInformationFields.withCredentials("lola","12","IT","sfasf","afsadf","Israel","michigan","capital","asd1","1234567891")
        );

    }

    @When("The user clicks the Create Account button")
    public void the_user_clicks_the_button() {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOn.the(SignUpPage.createAccountButton)
        );
    }


    @Then("ENTER ACCOUNT INFORMATION should be visible")
    public void IsFirstSubtitleVisible(){
        Actor user = OnStage.theActorCalled("user");

        user.should(
                seeThat(
                        CurrentVisibility.of(SignUpPage.subTitles)
                )
        );
    }
}
