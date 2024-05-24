package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPage extends PageObject {
    public static Target subTitles = Target.the("Sign Up Subtitle Page").locatedBy("#form >* h2");
    public static Target radioButtonTitles = Target.the("Titles").locatedBy(".radio-inline > label");
    public static Target nameField = Target.the("name").located(By.id("name"));
    public static Target passwordField = Target.the("password").located(By.id("password"));
    public static Target selectDayBox = Target.the("day of birth").located(By.id("days"));
    public static Target selectMonthBox = Target.the("month of birth").located(By.id("months"));
    public static Target selectYearBox = Target.the("year of birth").located(By.id("years"));
    public static Target newsletterCheckBox = Target.the("Sign up for our newsletter! Check Box").located(By.id("uniform-newsletter"));
    public static Target specialOffersCheckBox = Target.the("Receive special offers from our partners! Check Box").located(By.id("uniform-optin"));
    public static Target firstNameField = Target.the("first name").located(By.id("first_name"));
    public static Target lastNameField = Target.the("last name").located(By.id("last_name"));
    public static Target companyField = Target.the("company").located(By.id("company"));
    public static Target firstAddressField = Target.the("address 1").located(By.id("address1"));
    public static Target secondAddressField = Target.the("address 2").located(By.id("address2"));
    public static Target selectCountryBox = Target.the("country").located(By.name("country"));
    public static Target stateField = Target.the("state").located(By.id("state"));
    public static Target cityField = Target.the("city").located(By.id("city"));
    public static Target zipCodeField = Target.the("zipCode").located(By.id("zipcode"));
    public static Target mobileNumberField = Target.the("mobileNumber").located(By.id("mobile_number"));
    public static Target createAccountButton = Target.the("Create account").locatedBy(".login-form >* button");

}
