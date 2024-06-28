package tasks;

import interactions.TypeIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import uiScreens.ProductDetailsPage;

public class FillOutReviewForm implements Task {
    private String name;
    private String EmailAddress;
    private String review;


    public FillOutReviewForm(String name, String EmailAddress, String review) {
        this.name = name;
        this.EmailAddress = EmailAddress;
        this.review = review;
    }

    public static FillOutReviewForm withCredentials(String name, String EmailAddress, String review){
        return new FillOutReviewForm(name,EmailAddress,review);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                TypeIn.the(ProductDetailsPage.yourNameInputInReviewForm,name),
                TypeIn.the(ProductDetailsPage.emailAddressInputInReviewForm,EmailAddress),
                TypeIn.the(ProductDetailsPage.addReviewHereTextAreaInReviewForm,review)
        );

    }
}
