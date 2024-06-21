package uiScreens;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {
    public static Target loginLabel = Target.the("Login form title").locatedBy(".login-form > h2");
    public static Target signUpLabel = Target.the("Sign up form title").locatedBy(".signup-form > h2");
    public static Target emailAddressInputLogin = Target.the("Email address field of login form").locatedBy(".login-form *> input[name='email']");
    public static Target nameInput = Target.the("Name user field").located(By.name("name"));
    public static Target passwordInput = Target.the("Password field").located(By.name("password"));
    public static Target emailAddressInputSignUp = Target.the("Email address field of sign up form").locatedBy(".signup-form *> input[name='email']");
    public static Target wrongCredentialsMessage = Target.the("Your email or password is incorrect! message").locatedBy(".login-form >* p");
    public static Target buttonLogin = Target.the("Login button").locatedBy(".login-form *> button[class='btn btn-default']");
    public static Target buttonSignUp = Target.the("Sign up button").locatedBy(".signup-form *> button[class='btn btn-default']");
}
