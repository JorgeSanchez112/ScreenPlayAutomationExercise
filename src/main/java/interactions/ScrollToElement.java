package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollToElement implements Interaction {
    private final Target target;

    public ScrollToElement(Target target) {
        this.target = target;
    }

    public static ScrollToElement target(Target target) {
        return instrumented(ScrollToElement.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = actor.abilityTo(net.serenitybdd.screenplay.abilities.BrowseTheWeb.class).getDriver();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", target.resolveFor(actor));
    }
}
