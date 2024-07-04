package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static Target logo = Target.the("Logo").locatedBy(".logo.pull-left");
    public static Target headerMenu = Target.the("Menu elements").locatedBy(".navbar-nav > li");
    public static Target FullFledgedText = Target.the("Full-Fledged practice website for Automation Engineers text").locatedBy("#slider >* .item.active >* h2");
    public static Target categoriesBox = Target.the("Categories side bar box").located(By.id("accordian"));
    public static Target categories = Target.the("All the categories in the left side bar").locatedBy("#accordian > .panel-default >* > h4 > a");
    public static Target womenCategories = Target.the("Women categories").locatedBy("#Women >* a");
    public static Target menCategories = Target.the("Men categories").locatedBy("#Men >* a");
    public static Target brandsTitle =  Target.the("Brands title").locatedBy(".brands_products > h2");
    public static Target brands = Target.the("Brands").locatedBy(".brands-name >* li");
    public static Target addToCartButton = Target.the("Add to cart button of products").locatedBy(".features_items >* .productinfo > .add-to-cart");
    public static Target continueShoppingButton = Target.the("Continuer Shopping button of the cart modal").locatedBy("#cartModal >* .modal-footer > button");
    public static Target viewCartLink = Target.the("View cart link of the cart modal").locatedBy("#cartModal >* .modal-body >* a");
    public static Target viewProductButton = Target.the("View product button of each product").locatedBy(".choose >* a");
    public static Target arrowUpButton = Target.the("Arrow up Button to scroll up").located(By.id("scrollUp"));
    public static Target recommendedItemsTitle = Target.the("Recommended Items Title").locatedBy(".recommended_items > h2");
    public static Target carouselOfRecommendedItems = Target.the("Carouse of recommended items").locatedBy("#recommended-item-carousel.carousel.slide");
    public static Target recommendedItemsProducts = Target.the("add cart button of each product of recommended item").locatedBy("#recommended-item-carousel >* .item.active >* .add-to-cart");
    public static Target footerPage = Target.the("Footer's page").located(By.id("footer"));
    public static Target subscriptionText = Target.the("Subscription text of footer").locatedBy(".single-widget > h2");
    public static Target subscribeEmailInput = Target.the("Input of Subscription input over the footer").locatedBy("#susbscribe_email");
    public static Target arrowButton = Target.the("Arrow button next to the subscribe email input").located(By.id("subscribe"));
    public static Target messageSuccessfullySubscribed = Target.the("You have been successfully subscribed! message").located(By.id("success-subscribe"));

}
