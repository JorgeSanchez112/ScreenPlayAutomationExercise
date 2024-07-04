package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentDonePage extends PageObject {
    public static Target downloadInvoiceButton = Target.the("Download invoice button").located(By.className("check_out"));
}
