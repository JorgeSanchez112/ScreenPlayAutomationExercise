package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HeaderMenuComponent extends PageObject {
    public static Target headerMenu = Target.the("Menu elements").locatedBy(".navbar-nav *> a");
    public static Target buttonsOfUserLogged = Target.the("Logout and Delete account button").located(By.cssSelector(".navbar-nav > li > a[style='color:brown;']"));


}
