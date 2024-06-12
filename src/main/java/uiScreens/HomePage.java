package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static Target headerMenu = Target.the("Menu elements").locatedBy(".navbar-nav > li");
    public static Target logo = Target.the("Logo").locatedBy(".logo.pull-left");
    public static Target footerPage = Target.the("Footer's page").located(By.id("footer"));
    public static Target subscriptionText = Target.the("Subscription text of footer").locatedBy(".single-widget > h2");
    public static Target subscribeEmailInput = Target.the("Input of Subscription input over the footer").locatedBy("#susbscribe_email");
    public static Target arrowButton = Target.the("Arrow button next to the subscribe email input").located(By.id("#subscribe"));
    public static Target messageSuccessfullySubscribed = Target.the("You have been successfully subscribed! message").located(By.id("#success-subscribe"));
    public static Target categoriesBox = Target.the("Categories side bar box").located(By.id("#accordian"));
    public static Target categories = Target.the("All the categories in the side bar").locatedBy("#accordian > .panel-default");
    public static Target WomenCategories = Target.the("Women categories").located(By.id("Women"));
}
