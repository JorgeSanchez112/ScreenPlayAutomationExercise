package tasks;

import interactions.ClickOn;
import interactions.TypeIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import uiScreens.ContactUsPage;

public class FillOutGetInTouchForm implements Task {
    private String name;
    private String email;
    private String subject;
    private String message;
    private String filePath;

    public FillOutGetInTouchForm(String name, String email, String subject, String message, String filePath){
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
        this.filePath = filePath;
    }

    public static FillOutGetInTouchForm withCredentials(String name, String email, String subject, String message, String filePath){
        return new FillOutGetInTouchForm(name,email,subject,message,filePath);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                TypeIn.the(ContactUsPage.nameField,name),
                TypeIn.the(ContactUsPage.emailField,email),
                TypeIn.the(ContactUsPage.subjectField,subject),
                TypeIn.the(ContactUsPage.messageField,message),
                TypeIn.the(ContactUsPage.uploadFile,filePath)
        );
    }
}
