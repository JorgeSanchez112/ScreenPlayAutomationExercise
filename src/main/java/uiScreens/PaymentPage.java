package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPage extends PageObject {
    public static Target nameOnCardField = Target.the("Name on card field").located(By.name("name_on_card"));
    public static Target cardNumberField = Target.the("Card number field").located(By.name("card_number"));
    public static Target cVCField = Target.the("CVC field").located(By.name("cvc"));
    public static Target monthExpirationField = Target.the("Field of expiration month").located(By.name("expiry_month"));
    public static Target yearExpirationField = Target.the("Field of the year expiration").located(By.name("expiry_year"));
    public static Target orderPlaceSuccessfullyMessage = Target.the("Your order has been placed successfully! message").locatedBy(".payment-information >* .alert-success");
    public static Target payAndConfirmOrder = Target.the("Pay and confirm order").located(By.id("submit"));

}
