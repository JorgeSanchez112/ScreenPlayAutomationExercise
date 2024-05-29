package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Select;

public class SelectItemInDropDownBox implements Interaction {
    private Target target;
    private String value;

    public SelectItemInDropDownBox(Target target, String value){
        this.target = target;
        this.value = value;
    }

    public static SelectItemInDropDownBox the(Target target,String value){
        return new SelectItemInDropDownBox(target,value);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Select.value(value).from(target).performAs(actor);
    }
}
