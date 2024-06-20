package tasks;

import interactions.AcceptAlert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GenerateRandomNumber implements Task {
    private int start;
    private int end;


    public GenerateRandomNumber(int start, int end){
        this.start = start;
        this.end = end;
    }

    public static GenerateRandomNumber Between(int start, int end){
        return Tasks.instrumented(GenerateRandomNumber.class,start,end);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (start > end) {
            throw new IllegalArgumentException("Start must be less than or equal to end");
        }

        Random random = new Random();
        int randomNumber = random.nextInt((end - start) + 1) + start;

        actor.remember("RANDOM_NUMBER", randomNumber);
    }
}
