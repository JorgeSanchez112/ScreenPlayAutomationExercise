package tasks;

import interactions.ClickOn;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import utils.AdBlockerJs;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateTo implements Task {
    Target targetLink;
    WebElementFacade webElementFacade;

    public NavigateTo(Target targetLink){
        this.targetLink = targetLink;
    }

    public NavigateTo(WebElementFacade webElementFacade){
        this.webElementFacade = webElementFacade;
    }

    public static NavigateTo withTarget(Target target){
        return instrumented(NavigateTo.class,target);
    }

    public static NavigateTo withElementFacade(WebElementFacade webElementFacade){
        return instrumented(NavigateTo.class,webElementFacade);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AdBlockerJs.AdBlockerJs(BrowseTheWeb.as(actor).getDriver());

        if (targetLink != null){
            actor.attemptsTo(
                    ClickOn.the(targetLink)
            );
        } else if (webElementFacade != null) {
            actor.attemptsTo(
                    ClickOn.the(webElementFacade)
            );
        }


    }
}
