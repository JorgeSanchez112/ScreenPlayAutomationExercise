package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.targets.Target;

public class TypeIn implements Interaction {
    private Target target;
    private String text;

    public TypeIn(Target target, String text){
        this.target = target;
        this.text = text;
    }

    public static TypeIn the(Target target, String text){
        return new TypeIn(target,text);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(text).into(target)
        );
    }
}
