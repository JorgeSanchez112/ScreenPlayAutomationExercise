package tasks;

import interactions.SelectItemInDropDownBox;
import interactions.TypeIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import uiScreens.SignUpPage;

public class FillAddressInformationFields implements Task {
    private String firstName;
    private String lastName;
    private String company;
    private String address;
    private String address2;
    private String country;
    private String state;
    private String city;
    private String zipCode;
    private String mobileNumber;

    public FillAddressInformationFields(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipCode, String mobileNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address = address;
        this.address2 = address2;
        this.country = country;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
        this.mobileNumber = mobileNumber;
    }

    public static FillAddressInformationFields withCredentials(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipCode, String mobileNumber){
        return new FillAddressInformationFields(firstName,lastName,company,address,address2,country,state,city,zipCode,mobileNumber);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                TypeIn.the(SignUpPage.firstNameField,firstName),
                TypeIn.the(SignUpPage.lastNameField,lastName),
                TypeIn.the(SignUpPage.companyField,company),
                TypeIn.the(SignUpPage.firstAddressField,address),
                TypeIn.the(SignUpPage.secondAddressField,address2),
                SelectItemInDropDownBox.the(SignUpPage.selectCountryBox,country),
                TypeIn.the(SignUpPage.stateField,state),
                TypeIn.the(SignUpPage.cityField,city),
                TypeIn.the(SignUpPage.zipCodeField,zipCode),
                TypeIn.the(SignUpPage.mobileNumberField,mobileNumber)
        );
    }
}
