package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    public static Target shoppingCartLabel = Target.the("Shopping cart label").located(By.className("active"));
    public static Target proceedToCheckoutButton = Target.the("Proceed to checkout button").locatedBy(".col-sm-6 > a");
    public static Target products = Target.the("Products in cart shopping").located(By.cssSelector("tbody > tr"));
    public static Target priceField = Target.the("Price field of each product").located(By.cssSelector("tbody > tr > td:nth-child(3) > p"));
    public static Target quantityField = Target.the("Quantity field of each product").located(By.cssSelector("tbody > tr > td:nth-child(4) > button"));
    public static Target totalField = Target.the("Total field of each product").located(By.cssSelector("tbody > tr > td:nth-child(5) > p"));
    public static Target deleteProductButton = Target.the("Button for delete a respective product").located(By.className("cart_quantity_delete"));
    public static Target subscriptionText = Target.the("Subscription text of footer").locatedBy(".single-widget > h2");

    public static Target registerLoginLink = Target.the("Link of register login modal to proceed to checkout").locatedBy("#checkoutModal *> a");
}
