package uiScreens;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public Target labelLogin = Target.the("Login form title").locatedBy(".login-form > h2");
    public Target signUpLabel = Target.the("Sign up form title").locatedBy(".signup-form > h2");
    public Target emailAddressInputLogin = Target.the("Email address field of login form").locatedBy(".login-form *> input[name='email']");
    public Target nameInput = Target.the("Name user field").located(By.name("name"));
    public Target passwordInput = Target.the("Password field").located(By.name("password"));
    public Target emailAddressInputSignUp = Target.the("Email address field of sign up form").locatedBy(".signup-form *> input[name='email']");
    public Target buttonLogin = Target.the("Login button").locatedBy(".login-form *> button[class='btn btn-default']");
    public Target signUp = Target.the("Sign up button").locatedBy(".signup-form *> button[class='btn btn-default']");
}
