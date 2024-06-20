package uiScreens;

import net.serenitybdd.screenplay.targets.Target;

public class BrandProductsPage {
    public static Target brandsTitle = Target.the("Brands Title").locatedBy(".brands_products > h2");
    public static Target brandProducts = Target.the("Products of brand").locatedBy(".col-sm-9 >* .col-sm-4");
    public static Target brands = Target.the("Brands of a products of brand page").locatedBy(".brands-name >* li");

}
