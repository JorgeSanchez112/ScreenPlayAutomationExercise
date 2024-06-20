package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage extends PageObject {
    public static Target brandsTitle = Target.the("Brands Title").locatedBy(".brands_products > h2");

}
