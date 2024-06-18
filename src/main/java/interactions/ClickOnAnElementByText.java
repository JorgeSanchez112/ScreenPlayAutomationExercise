package interactions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

import java.util.Objects;


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
        try{
            ListOfWebElementFacades a = target.resolveAllFor(actor);
            for (WebElement element : a) {
                if (Objects.equals(element.getText(), text)){
                    element.click();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
