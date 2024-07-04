package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClickOn implements Interaction {
    private Target target;
    private WebElementFacade elementFacade;

    public ClickOn(Target target){
        this.target = target;
    }

    public ClickOn(WebElementFacade elementFacade){
        this.elementFacade = elementFacade;
    }

    public static ClickOn the(Target target){
        return new ClickOn(target);
    }

    public static ClickOn the(WebElementFacade elementFacade){
        return new ClickOn(elementFacade);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (target != null) {
            actor.attemptsTo(
                    Click.on(target)
            );
        } else if (elementFacade != null) {
            elementFacade.click();
        }
    }
}
