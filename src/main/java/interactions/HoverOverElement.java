package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HoverOverElement implements Interaction {
    private final Target target;

    public HoverOverElement(Target target) {
        this.target = target;
    }

    public static HoverOverElement target(Target target) {
        return instrumented(HoverOverElement.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(target));
    }
}
