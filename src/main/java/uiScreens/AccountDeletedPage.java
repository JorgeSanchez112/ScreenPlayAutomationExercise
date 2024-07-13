package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountDeletedPage extends PageObject {
    public static Target titlePage = Target.the("ACCOUNT DELETED! title").located(By.cssSelector("h2 > b"));
}
