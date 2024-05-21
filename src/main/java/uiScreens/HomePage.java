package uiScreens;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public Target headerMenu = Target.the("menu elements").locatedBy(".navbar-nav > li");
}
