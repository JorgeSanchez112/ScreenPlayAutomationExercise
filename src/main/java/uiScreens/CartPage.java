package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage extends PageObject {
    public static Target products = Target.the("Products in cart shopping").locatedBy("tbody > tr");
    public static Target priceField = Target.the("Price field of each product").locatedBy("tbody > tr > td:nth-child(3) > p");
    public static Target quantityField = Target.the("Quantity field of each product").locatedBy("tbody > tr > td:nth-child(4) > p");
    public static Target totalField = Target.the("Total field of each product").locatedBy("tbody > tr > td:nth-child(5) > p");

}
