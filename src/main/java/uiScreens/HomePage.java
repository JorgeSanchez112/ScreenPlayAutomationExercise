package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
    public static Target headerMenu = Target.the("Menu elements").locatedBy(".navbar-nav > li");
    public static Target logo = Target.the("Logo").locatedBy(".logo.pull-left");
}
