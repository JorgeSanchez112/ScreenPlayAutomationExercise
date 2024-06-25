package uiScreens;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {
    public static Target searchInput = Target.the("search input of products page").located(By.id("search_product"));
    public static Target searchButton = Target.the("search button of search input").located(By.id("submit_search"));
    public static Target productsTitle = Target.the("ALL PRODUCTS title").locatedBy(".features_items > .col-sm-4 >* .productinfo > p");
    public static Target titleOFProduct = Target.the("title or name of each product").locatedBy(".productinfo > p");
    public static Target brandsTitle = Target.the("Brands Title").locatedBy(".brands_products > h2");
    public static Target products = Target.the("Elements of products").locatedBy(".features_items > .col-sm-4");
    public static Target addToCartButtonOverlay = Target.the("Add To cart button in the overlay way").locatedBy(".product-overlay >* a");
    public static Target viewCartLink = Target.the("View cart link of the cart modal").locatedBy("#cartModal >* .modal-body >* a");
    public static Target continueShoppingButton = Target.the("Continuer Shopping button of the cart modal").locatedBy("#cartModal >* .modal-footer > button");

}
