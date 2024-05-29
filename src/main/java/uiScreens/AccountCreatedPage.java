package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AccountCreatedPage extends PageObject {
    public static Target titleAccountCreated =  Target.the("Title Account created").locatedBy("#form >* h2");
}
