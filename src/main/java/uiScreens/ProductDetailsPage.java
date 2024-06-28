package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductDetailsPage extends PageObject {
    public static Target productName = Target.the("Product name text").locatedBy(".product-information > h2");
    public static Target productCategory = Target.the("categories of product").locatedBy(".product-information > p:nth-child(3)");
    public static Target productPrice = Target.the("Price of the product").locatedBy(".product-information >span > span");
    public static Target labelOfProductQuantity = Target.the("label of product quantity").locatedBy(".product-information >span > label");
    public static Target inputOfProductQuantity = Target.the("Input of product quantity").located(By.id("quantity"));
    public static Target addToCartButton = Target.the("Add to cart button").locatedBy("span > button");
    public static Target viewCartButton = Target.the("View cart button").locatedBy(".modal-footer > button");
    public static Target productAvailability = Target.the("Availability of product").locatedBy(".product-information > p:nth-child(6)");
    public static Target productCondition = Target.the("condition of product").locatedBy(".product-information > p:nth-child(7)");
    public static Target productBrand = Target.the("Brand of the product").locatedBy(".product-information > p:nth-child(8)");
    public static Target writeYourReviewLink = Target.the("Write your review label").locatedBy(".active > a");
    public static Target yourNameInputInReviewForm = Target.the("Input your name inside review form").located(By.id("name"));
    public static Target emailAddressInputInReviewForm = Target.the("Email address input in review form").located(By.id("email"));
    public static Target addReviewHereTextAreaInReviewForm = Target.the("Add review here text area in review form").located(By.id("review"));
    public static Target submitButtonInReviewForm = Target.the("submit button in review form").located(By.id("button-review"));
    public static Target messageOfSuccessfulReview = Target.the("Message of successful review").located(By.className("alert-success"));
}
