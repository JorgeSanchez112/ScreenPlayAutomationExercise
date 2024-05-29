package checkout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import tasks.FillAccountInformationFields;
import uiScreens.SignUpPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SignUpStepDefinitions{

    @And("the user fills in the details: Title, Name, Email, Password, Date of birth")
    public void fillAccountInformationFields(){
        Actor user = OnStage.theActorCalled("user");

        user.attemptsTo(
                FillAccountInformationFields.the("Mr.","a","a","123")
        );

    }

    @When("the user selects the checkbox {string}")
    public void the_user_selects_the_checkbox(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("the user fills in the details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void the_user_fills_in_the_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("the user clicks the {string} button")
    public void the_user_clicks_the_button(String string) {
        // Write code here that turns the phrase above into concrete actions
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
