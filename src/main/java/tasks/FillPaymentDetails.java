package tasks;

import interactions.TypeIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import uiScreens.PaymentPage;

public class FillPaymentDetails implements Task {
    private String nameOnCard;
    private String cardNumber;
    private String cvc;
    private String monthExpiration;
    private String yearExpiration;

    public FillPaymentDetails(String nameOnCard, String cardNumber, String cvc, String monthExpiration, String yearExpiration){
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.monthExpiration = monthExpiration;
        this.yearExpiration = yearExpiration;
    }

    public static FillPaymentDetails withCredentials(String nameOnCard, String cardNumber, String cvc, String monthExpiration, String yearExpiration){
        return new FillPaymentDetails(nameOnCard,cardNumber,cvc,monthExpiration,yearExpiration);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                TypeIn.the(PaymentPage.nameOnCardField,nameOnCard),
                TypeIn.the(PaymentPage.cardNumberField,cardNumber),
                TypeIn.the(PaymentPage.cVCField,cvc),
                TypeIn.the(PaymentPage.monthExpirationField,monthExpiration),
                TypeIn.the(PaymentPage.yearExpirationField,yearExpiration)
        );
    }
}
