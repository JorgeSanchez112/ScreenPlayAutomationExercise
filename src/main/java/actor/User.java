package actor;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class User {

    WebDriver hisBrowser;

    private Actor user = Actor.named("User");


    public static void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }
}
