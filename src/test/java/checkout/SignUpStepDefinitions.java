package checkout;

import interactions.ClickOn;
import interactions.ClickOnAnElementByText;
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

    @When("User fills details of account information {string} {string} {string} {string} {string} {string}")
    public void fillAccountInformationFields(String title, String name, String password, String birthDay, String birthMonth, String birthYear){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                FillAccountInformationFields.the(title, name, password, birthDay, birthMonth, birthYear)
        );

    }

    @When("User selects checkbox {string}")
    public void selectCheckboxByLabelText(String checkBoxLabel) {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                ClickOnAnElementByText.the(SignUpPage.checkboxes,checkBoxLabel)
        );
    }

    @When("User fills in the details of information {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void fillAddressInformationFields(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipCode, String mobileNumber) {
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                FillAddressInformationFields.withCredentials(firstName,lastName,company,address,address2,country,state,city,zipCode,mobileNumber)
        );

    }

    @When("User clicks Create Account button")
    public void clickOnCreateAccountButton() {
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
