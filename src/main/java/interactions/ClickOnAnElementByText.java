package interactions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClickOnAnElementByText implements Interaction {

    private Target target;
    private String text;

    public ClickOnAnElementByText(Target target, String text){
        this.target = target;
        this.text = text;
    }

    public static ClickOnAnElementByText the(Target target, String text){
        return new ClickOnAnElementByText(target,text);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades a = target.resolveAllFor(actor);
        for (WebElement element : a) {
            System.out.println(element);
        }

        System.out.println(text);
    }
}
