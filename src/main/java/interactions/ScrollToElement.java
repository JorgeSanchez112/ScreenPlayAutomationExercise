package interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollToElement implements Interaction {
    private Target target;
    private WebElementFacade elementFacade;

    public ScrollToElement(Target target) {
        this.target = target;
    }

    public ScrollToElement(WebElementFacade elementFacade){
        this.elementFacade = elementFacade;
    }

    public static ScrollToElement target(Target target) {
        return instrumented(ScrollToElement.class, target);
    }

    public static ScrollToElement elementFacade(WebElementFacade elementFacade){
        return instrumented(ScrollToElement.class, elementFacade);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (target != null){
            actor.attemptsTo(
                    Scroll.to(target)
            );
        }else if(elementFacade != null){
            actor.attemptsTo(
                    Scroll.to(elementFacade)
            );
        }

    }
}
