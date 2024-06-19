package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactUsPage extends PageObject {

    public static Target titleGetInTouch = Target.the("title Get In Touch ").locatedBy(".contact-form > h2");
    public static Target nameField = Target.the("Name field of the page Contact us ").located(By.name("name"));
    public static Target emailField = Target.the("Email field of the page Contact us ").located(By.name("email"));
    public static Target subjectField = Target.the("Subject field of the page Contact us ").located(By.name("subject"));
    public static Target messageField = Target.the("Message field of the page Contact us").located(By.id("message"));
    public static Target uploadFile = Target.the("Upload a file of the page Contact us").located(By.name("upload_file"));
    public static Target submitButton = Target.the("Submit Button").located(By.className("submit_form"));

    //Elements below are shown after fill out GET IN TOUCH form
    public static Target successMessage = Target.the("Success Message").locatedBy(".contact-form > .alert-success");
    public static Target homeButton = Target.the("Home button").located(By.className("btn-success"));

}