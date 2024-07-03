package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {
    public static Target titles = Target.the("Section titles").locatedBy(".step-one > h2");
    public static Target deliveryAddress = Target.the("Address delivery").located(By.id("address_delivery"));
    public static Target billingAddress = Target.the("Billing address").located(By.id("address_invoice"));
    public static Target commentField = Target.the("Comment field to leave a message about the order").located(By.name("message"));
    public static Target placeOrderButton = Target.the("Place order button").located(By.className("check_out"));
}
