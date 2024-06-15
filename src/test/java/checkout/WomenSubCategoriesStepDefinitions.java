package checkout;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.TextValue;
import org.junit.Assert;
import uiScreens.DressSubCategoryPage;
import uiScreens.SareeSubCategoryPage;
import uiScreens.TopsSubCategoryPage;
import utils.AdBlockerJs;

import java.util.Objects;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class WomenSubCategoriesStepDefinitions {
    @Then("The category page should be displayed {string}")
    public void isUrlCorrectWithThePage(String urlExpected){
        Actor user = OnStage.theActorCalled("user");

        String currentUrl = BrowseTheWeb.as(user).getDriver().getCurrentUrl();

        Assert.assertEquals(urlExpected,currentUrl);
    }

    @Then("The user should confirm the {string} text of {string} page")
    public void isTitleTextCorrect(String titlePage, String subCategoryPage){
        Actor user = OnStage.theActorCalled("user");

        if (Objects.equals(subCategoryPage, "DRESS")){
            user.should(
                    seeThat(TextValue.of(DressSubCategoryPage.titlePage))
            );
        } else if (Objects.equals(subCategoryPage, "TOPS")) {
            user.should(
                    seeThat(TextValue.of(TopsSubCategoryPage.titlePage))
            );
        } else if (Objects.equals(subCategoryPage, "SAREE")) {
            user.should(
                    seeThat(TextValue.of(SareeSubCategoryPage.titlePage))
            );
        }

    }
}
